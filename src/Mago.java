public class Mago extends Personagem {

    private Arma cajado = new Arma("Cajado", 13);
    private Arma varinha = new Arma("Varinha", 13);
    private Arma cetro = new Arma("Cetro", 13);

    public Mago(String nome, String genero, int vida, int defesa, int forca) {
        super(nome, vida, defesa, forca);
        adicionarArma(cajado);
        adicionarArma(varinha);
        adicionarArma(cetro);
        setArma(cajado);
        adicionarHabilidades(new MagoHabilidade());
    }

    public Arma getCajado(){return cajado;}
    public Arma getVarinha(){return varinha;}
    public Arma getCetro(){return cetro;}

    @Override
    public void atacar(Criatura alvo) {
        int dano = getForca() + getArma().getDano();
        IO.println(getNome()+" lança uma magia com " + getArma().getNome()+ "! Dano: " + dano);
        alvo.receberDano(dano);

    }
}
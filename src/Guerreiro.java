public class Guerreiro extends Personagem {

 private Arma katana = new Arma("Katana", 15);
 private Arma lanca = new Arma("Lança", 15);
 private Arma espadaPesada = new Arma("Espada Pesada",15);

    public Guerreiro(String nome, String genero, int vida, int defesa, int forca) {
        super(nome, vida, defesa, forca);
        adicionarArma(katana);
        adicionarArma(lanca);
        adicionarArma(espadaPesada);
        setArma(espadaPesada);
        adicionarHabilidades(new GolpePoderoso());
    }

    public Arma getKatana() {
        return katana;
    }

    public Arma getLanca() {
        return lanca;
    }

    public Arma getEspadaPesada() {
        return espadaPesada;
    }

    @Override
    public void atacar(Criatura alvo) {
        int dano = getForca() + getArma().getDano();
        IO.println(getNome()+" Corte com "+ getArma().getNome()+ "! Dano: " + dano);
        alvo.receberDano(dano);
    }

}

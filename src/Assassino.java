public class Assassino extends Personagem {

    private Arma kunai = new Arma("Kunai", 15);
    private Arma adagas = new Arma("Adagas", 15);
    private Arma laminasGemeas = new Arma("Laminas Gemeas", 15);

    public Assassino(String nome, String genero, int vida, int defesa, int forca) {
        super(nome, vida, defesa, forca);
        adicionarArma(kunai);
        adicionarArma(adagas);
        adicionarArma(laminasGemeas);
        setArma(kunai);
    }

    public Arma getKunai() {
        return kunai;
    }

    public Arma getAdagas() {
        return adagas;
    }

    public Arma getLaminasGemeas() {
        return laminasGemeas;
    }

    @Override
    public void atacar(Criatura alvo) {
        int dano = getForca() + getArma().getDano();
        IO.println(getNome()+ " Golpe Rápido " + getArma().getNome()+ "! Dano: " + dano);
        alvo.receberDano(dano);
    }
}
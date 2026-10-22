public class Assassino extends Personagem {

    private Arma kunai = new Arma("Kunai", 12);
    private Arma adagas = new Arma("Adagas", 12);
    private Arma laminasGemeas = new Arma("Laminas Gemeas", 12);

    public Assassino(String nome, String genero, int vida, int defesa, int forca) {
        super(nome, vida, defesa, forca);
        adicionarArma(kunai);
        adicionarArma(adagas);
        adicionarArma(laminasGemeas);
        setArma(kunai);
        adicionarHabilidades(new AssassinoHabilidade());
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
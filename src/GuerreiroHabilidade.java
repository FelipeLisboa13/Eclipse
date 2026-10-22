public class GuerreiroHabilidade implements Habilidade{
    @Override
    public String getNome() {
        return "Deceiver’s Punch";
    }

    @Override
    public int getcusto() {
        return 25;
    }

    @Override
    public void usar(Personagem usuario, Criatura alvo) {
        int dano = (usuario.getForca() + usuario.getArma().getDano()) * 2;
        IO.println(usuario.getNome() + " usa golpe Poderoso em " + alvo.getNome() + "!");
        alvo.receberDano(dano);

    }

    @Override
    public void add(Habilidade habilidade) {

    }
}

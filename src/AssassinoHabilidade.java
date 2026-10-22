public class AssassinoHabilidade implements Habilidade{
    @Override
    public String getNome() {
        return "Abyss";
    }

    @Override
    public int getcusto() {
        return 33;
    }

    @Override
    public void usar(Personagem usuario, Criatura alvo) {
        int dano = (usuario.getForca() + usuario.getArma().getDano() *2);
        IO.println(usuario.getNome() + " Usar Abismo total " + alvo.getNome() + "!");
        alvo.receberDano(dano);

    }

    @Override
    public void add(Habilidade habilidade) {

    }
}

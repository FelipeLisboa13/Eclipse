public class ArqueiroHabilidade implements Habilidade{
    @Override
    public String getNome() {
        return "Illusion";
    }

    @Override
    public int getcusto() {
        return 29;
    }

    @Override
    public void usar(Personagem usuario, Criatura alvo) {
        int dano = (usuario.getForca() + usuario.getArma().getDano() *2 );
        IO.println(usuario.getNome() + " Usar ataque de flecha " + alvo.getNome() + "!");
        alvo.receberDano(dano);

    }

    @Override
    public void add(Habilidade habilidade) {

    }
}

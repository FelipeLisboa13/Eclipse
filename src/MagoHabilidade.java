public class MagoHabilidade implements Habilidade{


    @Override
    public String getNome() {
        return "New Moon";
    }

    @Override
    public int getcusto() {
        return 32;
    }

    @Override
    public void usar(Personagem usuario, Criatura alvo) {
        int dano = (usuario.getForca() + usuario.getArma().getDano() *2);
        IO.println(usuario.getNome() + " Usar Magia em " + alvo.getNome() + "!");
        alvo.receberDano(dano);
    }

    @Override
    public void add(Habilidade habilidade) {

    }
}

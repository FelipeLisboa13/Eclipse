public class Inimigo  extends Criatura{


    public Inimigo(String nome, int vida, int defesa, int forca) {
        super(nome, vida, defesa, forca);
    }

    @Override
    public void atacar(Criatura alvo) {
        IO.println(getNome() + " Ataca " + alvo.getNome() + "!" );
        alvo.receberDano(getForca());
    }
}

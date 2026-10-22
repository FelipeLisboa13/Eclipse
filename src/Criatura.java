public abstract class Criatura {

 private String nome;
 private int vida;
 private int defesa;
 private int forca;

    public Criatura(String nome, int vida, int defesa, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
        this.forca = forca;
    }

    public void aumentarForca(int quantidade) {
        forca += quantidade;
    }

    public void aumentarDefesa(int quantidade) {
        defesa += quantidade;
    }

    public void aumentarVida(int quantidade) {
        vida += quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getForca() {
        return forca;
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public void receberDano(int dano){
        if (defendendo){
            dano = dano / 2;
        }
        int danoReal = Math.max(1,dano - defesa);
        vida = Math.max(0, vida - danoReal);
        IO.println(nome + " Recebeu " + danoReal + " de dano! Vida:" + vida);
    }
    public abstract void atacar(Criatura alvo);

    private boolean defendendo = false;

    public void setDefendendo(boolean defendendo){
        this.defendendo = defendendo;
    }

    public void curar(int quantidade){
        vida += quantidade;
        IO.println(nome + " recuperou " + quantidade + " de vida! vida:" + vida);
    }
}

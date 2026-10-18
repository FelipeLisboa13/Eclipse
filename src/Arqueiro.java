public class Arqueiro extends Personagem{

 private Arma arcoFlexivel = new Arma("Arco Flexíel", 15);
 private Arma besta = new Arma("Besta", 15);
 private Arma arcoPesado = new Arma("Arco Pesado", 15 );

    public Arqueiro(String nome, String genero, int vida, int defesa, int forca) {
        super(nome, vida, defesa, forca);
        adicionarArma(arcoFlexivel);
        adicionarArma(besta);
        adicionarArma(arcoPesado);
       setArma(arcoFlexivel);
    }



    public Arma getArcoFlexivel() {
        return arcoFlexivel;
    }

    public Arma getBesta() {
        return besta;
    }

    public Arma getArcoPesado() {
        return arcoPesado;
    }

    @Override
    public void atacar(Criatura alvo) {
        int dano = getForca() + getArma().getDano();
        IO.println(getNome()+ " Disparo á distância com " + getArma().getNome()+ "! Dano: " + dano);
        alvo.receberDano(dano);


    }

}

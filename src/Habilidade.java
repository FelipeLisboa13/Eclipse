public interface Habilidade {

 String getNome();
 int getcusto();
 void usar(Personagem usuario, Criatura alvo);

    void add(Habilidade habilidade);
}

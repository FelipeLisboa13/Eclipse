import java.util.ArrayList;
import java.util.List;

public abstract class Personagem extends Criatura {


    private String genero;
    private Arma arma;
    private int mana = 25;

    public Personagem(String nome, int vida, int defesa, int forca) {
        super(nome, vida, defesa, forca);
        this.genero = genero;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private List<Arma> armasDisponiveis = new ArrayList<>();
    public  List<Arma> getArmasDisponiveis(){
        return armasDisponiveis;
    }
    protected  void adicionarArma(Arma arma){
        armasDisponiveis.add(arma);
    }

    private List<Habilidade> habilidades = new ArrayList<>();

    public int getMana(){
        return mana;
    }

    public void ganharMana(int quantidade){
        mana += quantidade;
    }
    public boolean gastarMana(int custo) {
        if (mana >= custo) {
            mana -= custo;
            return true;
        }
        return false;
    }

    public List<Habilidade> getHabilidades(){
        return habilidades;
    }

    protected void adicionarHabilidades(Habilidade habilidade){
        habilidades.add(habilidade);
    }

}

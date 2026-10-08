public class Personagem {

    private String nome;
    private String genero;
    private String vida;
    private String defeza;
    private String forca;


    public Personagem(String nome, String genero, String vida, String defeza, String forca) {
        this.nome = nome;
        this.genero = genero;
        this.vida = vida;
        this.defeza = defeza;
        this.forca = forca;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getDefeza() {
        return defeza;
    }

    public void setDefeza(String defeza) {
        this.defeza = defeza;
    }

    public String getForca() {
        return forca;
    }

    public void setForca(String forca) {
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

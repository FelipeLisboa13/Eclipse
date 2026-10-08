import static java.lang.IO.readln;

public class Main {
    public static void main(String[] args) {
        Raca[] racas = Raca.values();
        Classe[] classes = Classe.values();
        Genero[] generos = Genero.values();
        IO.println("---------------------------------------------------------------------------------------------");
        IO.println("                  _-_-_-_--- Sun Games Apresenta Eclipse ----_-_-_-_");
        IO.println("---------------------------------------------------------------------------------------------");
        IO.println("");
        IO.println("                      ------ Criação de personagem ------");
        IO.println("");
        IO.println("___________________________________________________________");
        String nome = readln("  Nome do personagem: ");
        IO.println("___________________________________________________________");
        IO.println("");

        Genero generoEscolhido = null;
        while (generoEscolhido == null){
            IO.println("  Qual é o Gênero do seu personagem: ");
            for (int i = 0; i < generos.length; i++){
                IO.println((i + 1) + " - " + generos[i]);

            }
            int op = Integer.parseInt(readln("Opção: "));

            if (op >= 1 && op <= generos.length){
                generoEscolhido = generos[op -1];
            }else {
                IO.println(" Opção inválida! Tente de novo. ");
            }
        }

        IO.println("");

        Classe classesEscolhido = null;
        while (classesEscolhido == null){
            IO.println(" Escolha o que você vai ser: ");
            for (int i = 0; i< classes.length; i++){
                IO.println((i + 1) + " - " + classes[i]);
            }
            int op = Integer.parseInt(readln("Opção: "));

            if (op >= 1 && op <= classes.length){
                classesEscolhido = classes[op - 1];
            }else {
                IO.println(" Opção inválida! Tente novamente. ");
            }
        }

        IO.println("");

        Raca racaEscolhido = null;
        while (racaEscolhido == null) {
            IO.println(" Escolha sua Raça: ");
            for (int i = 0; i < racas.length; i++) {
                IO.println((i + 1) + " - " + racas[i]);
            }
            int op = Integer.parseInt(readln("Opção: "));

            if (op >= 1 && op <= racas.length) {
                racaEscolhido = racas[op - 1];
            } else {
                IO.println(" Opção inválida! Tente de novo.");
            }
        }
        IO.println("");
        IO.println("Personagem criado com sucesso!!");
        IO.println("");
        IO.println("Seja Bem-Vido ao word Eclipse ");
        IO.println("");
        IO.println("-------" + "Seus Status" + "-------");
        IO.println("");
        IO.println("-- Nome: " + nome + " -----");
        IO.println("-- Gênero: " + generoEscolhido + " -----");
        IO.println("-- Classe: " + classesEscolhido + " -----");
        IO.println("-- Raça: " + racaEscolhido + " -----");
    }
}
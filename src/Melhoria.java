import static java.lang.IO.readln;

public class Melhoria {

    public static int melhorar(Personagem heroi, int pontos) {
        if (pontos <= 0) {
            return pontos;
        }

        String escolha = "";
        while (!escolha.equals("1") && !escolha.equals("2")) {
            IO.println("");
            IO.println("Você tem " + pontos + " pontos para gastar.");
            IO.println("1 - Melhorar personagem");
            IO.println("2 - Continuar para o próximo nível");
            escolha = readln("Opção: ");

            if (!escolha.equals("1") && !escolha.equals("2")) {
                IO.println("Opção inválida!");
            }
        }

        if (escolha.equals("2")) {
            return pontos;
        }
        IO.println("");
        IO.println("------ Melhorar personagem ------");

        while (pontos > 0) {
            IO.println("");
            IO.println("Pontos disponíveis: " + pontos);
            IO.println("Força: " + heroi.getForca() + " | Defesa: " + heroi.getDefesa()
                    + " | Vida: " + heroi.getVida() + " | Mana: " + heroi.getMana());
            IO.println("1 - Força +3 (1 ponto)");
            IO.println("2 - Defesa +1 (1 ponto)");
            IO.println("3 - Vida +15 (1 ponto)");
            IO.println("4 - Mana +10 (1 ponto)");
            IO.println("0 - Continuar para o próximo nível");
            String op = readln("Opção: ");

            switch (op) {
                case "1" -> { heroi.aumentarForca(3); pontos--; }
                case "2" -> { heroi.aumentarDefesa(1); pontos--; }
                case "3" -> { heroi.aumentarVida(15); pontos--; }
                case "4" -> { heroi.ganharMana(10); pontos--; }
                case "0" -> { return pontos; }
                default -> IO.println("Opção inválida!");
            }
        }
        return pontos;
    }
}
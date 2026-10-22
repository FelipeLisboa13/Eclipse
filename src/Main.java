import java.util.List;

import static java.lang.IO.readln;

public class Main {
    public static void main(String[] args) {
        Raca[] racas = Raca.values();
        Classe[] classes = Classe.values();
        Genero[] generos = Genero.values();
        String jogarNovamente;
        do {
            Personagem personagem = null;
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
            while (generoEscolhido == null) {
                IO.println("  Qual é o Gênero do seu personagem: ");
                for (int i = 0; i < generos.length; i++) {
                    IO.println((i + 1) + " - " + generos[i]);

                }
                int op = Integer.parseInt(readln("Opção: "));

                if (op >= 1 && op <= generos.length) {
                    generoEscolhido = generos[op - 1];
                } else {
                    IO.println(" Opção inválida! Tente de novo. ");
                }
            }

            IO.println("");

            Classe classesEscolhido = null;
            while (classesEscolhido == null) {
                IO.println(" Escolha o que você vai ser: ");
                for (int i = 0; i < classes.length; i++) {
                    IO.println((i + 1) + " - " + classes[i]);
                }
                int op = Integer.parseInt(readln("Opção: "));

                if (op >= 1 && op <= classes.length) {
                    classesEscolhido = classes[op - 1];
                } else {
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

                switch (classesEscolhido) {
                    case Guerreiro -> personagem = new Guerreiro(nome, generoEscolhido.toString(),
                            100, 9, 28);
                    case Mago -> personagem = new Mago(nome, generoEscolhido.toString(),
                            80, 5, 22);
                    case Arqueiro -> personagem = new Arqueiro(nome, generoEscolhido.toString(),
                            90, 7, 20);
                    case Assassino -> personagem = new Assassino(nome, generoEscolhido.toString(),
                            85, 8, 26);
                }

                IO.println("");

                Arma armaEscolher = null;
                while (armaEscolher == null) {
                    IO.println(" Escolha seu equipamento inicial: ");
                    List<Arma> armas = personagem.getArmasDisponiveis();
                    for (int i = 0; i < armas.size(); i++) {
                        IO.println((i + 1) + " - " + armas.get(i).getNome() + " ( Dano: " + armas.get(i).getDano() + ")");
                    }
                    int opc = Integer.parseInt(readln("Opção: "));
                    if (opc >= 1 && opc <= armas.size()) {
                        armaEscolher = armas.get(opc - 1);
                    } else {
                        IO.println(" Opção inválida! Tente de novo.");
                    }
                }
                personagem.setArma(armaEscolher);


                IO.println("_______________________________________");
                IO.println(" -- Personagem criado com sucesso!! -- ");
                IO.println("---------------------------------------");
                IO.println("Seja Bem-Vido ao word Eclipse ");
                IO.println("");
                IO.println(" ------- " + " Seus Status " + " ------- ");
                IO.println("");
                IO.println("-- Nome: " + nome + " -----");
                IO.println("-- Gênero: " + generoEscolhido + " -----");
                IO.println("-- Classe: " + classesEscolhido + " -----");
                IO.println("-- Raça: " + racaEscolhido + " -----");
                IO.println("-- Arma: " + personagem.getArma().getNome() + " ----");
                IO.println("");
                IO.println("------------------------- Apareceu no mundo -------------------------");
                Inimigo[] inimigos = {
                        new Inimigo("Goblin", 50, 3, 25),
                        new Inimigo("Orc", 80, 6, 35),
                        new Inimigo("Dragão Sombrio (mini Boss)", 125, 7, 40)
                };
                int pontos = 0;
                boolean venceu = true;
                IO.println("");
                for (Inimigo inimigo : inimigos) {
                    if (!Batalha.lutar(personagem, inimigo)) {
                        venceu = false;
                        break;
                    }
                    pontos += 100;
                    IO.println("");
                    IO.println("Inimigo derrotado! Pontos: " + pontos);
                    personagem.curar(30);
                }
                IO.println("");
                if (venceu) {
                    IO.println("VITÓRIA! Você derrotou todos os inimigos do Eclipse!");
                } else {
                    IO.println("DERROTA... " + personagem.getNome() + " caiu em batalha.");
                }
                IO.println("Pontuação final: " + pontos);
            }
            IO.println("-- Jogar Novamente --");
            jogarNovamente = readln("(s/n): ");

        } while (jogarNovamente.equalsIgnoreCase("s"));
        IO.println("");
        IO.println(" --- Obrigado por jogar Eclipse! --- ");
    }

    }

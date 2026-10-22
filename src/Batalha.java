import java.util.List;

import static java.lang.IO.readln;

public class Batalha {

 public static boolean lutar(Personagem heroi, Inimigo inimigo){
     IO.println("");
     IO.println("=== " + inimigo.getNome() + " apareceu! ===");

     while (heroi.estaVivo() && inimigo.estaVivo()){
         IO.println("");
         IO.println(heroi.getNome() + ": " + heroi.getVida() + " | " + inimigo.getNome() + ": " + inimigo.getVida());
         IO.println("1 - Atacar");
         IO.println("2 - Defender");
         IO.println("3 - Habilidade" );
         IO.println("sua Mana: " + heroi.getMana());
         String op = readln("Opção ");

         heroi.setDefendendo(false);

         if (op.equals("1")){
             heroi.atacar(inimigo);
             heroi.ganharMana(10);
         } else if (op.equals("2")) {
             heroi.setDefendendo(true);
             heroi.ganharMana(5);
             IO.println(heroi.getNome() + " se prepara para o golpe!");
         } else if (op.equals("3")) {
             if (!usarHabilidade(heroi, inimigo)){
                 continue;
             }
         } else {
             IO.println("Opção inválida!");
             continue;
         }
         if (inimigo.estaVivo()){
             inimigo.atacar(heroi);
         }
     }
     return heroi.estaVivo();
 }
 private static boolean usarHabilidade(Personagem heroi, Inimigo inimigo) {
     List<Habilidade> habilidades = heroi.getHabilidades();
     IO.println("Mana: " + heroi.getMana());
     for (int i = 0; i < habilidades.size(); i++){
         Habilidade h = habilidades.get(i);
         IO.println((i + 1 ) + " - " + h.getNome() + " (Custo: " + h.getcusto() + ")");
     }
     int escolha;
     try {
         escolha = Integer.parseInt(readln("Habilidade: "));
     } catch (NumberFormatException e){
         escolha = 0;
     }
     if (escolha < 1 || escolha > habilidades.size()){
         IO.println("Opção inválida!");
         return false;
     }
     Habilidade escolhida = habilidades.get(escolha - 1);
     if (!heroi.gastarMana(escolhida.getcusto())){
         IO.println("Mana insuficiente! ");
         return false;
     }
     escolhida.usar(heroi, inimigo);
     return true;
    }
}




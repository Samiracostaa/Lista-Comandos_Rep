/*
6. Em um campeonato de LOL, enquanto não há a tomada de território, o contador implementado
deve contar (que é contabilizado pelo jogo), o número de kills, deaths e assists. Se o número
de kills for menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais
“master”. Se o número de deaths chegar a 20 ou mais, ele mostra a mensagem “Houston,
we have a problem”. Se o número de assists chegar a 20 ou mais, é mostrada a mensagem:
“team work”. Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
• há kills, deaths e assists total e da rodada
• medite na frase: enquanto não há um vencedor, faça?
• pergunte a cada loop o número de cada medida comentada.
• você deve perguntar se há um vencedor a cada loop?
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalKills = 0, totalDeaths = 0, totalAssists = 0;

        while (true) {
           
            System.out.print("Digite o número de kills da rodada: ");
            int kills = scanner.nextInt();
            System.out.print("Digite o número de deaths da rodada: ");
            int deaths = scanner.nextInt();
            System.out.print("Digite o número de assists da rodada: ");
            int assists = scanner.nextInt();

          
            totalKills += kills;
            totalDeaths += deaths;
            totalAssists += assists;

            if (kills <= 5) {
                System.out.println("noob");
            } else if (kills >= 20) {
                System.out.println("master");
            }
            if (deaths >= 20) {
                System.out.println("Houston, we have a problem");
            }
            if (assists >= 20) {
                System.out.println("team work");   

            }

 
            System.out.print("Há um vencedor? (sim/não): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")) {
                break;
            }
        }
       System.out.println("Fim do jogo!");
    }
}

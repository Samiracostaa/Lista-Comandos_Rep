/*import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, n;

        // Exibir menu
        System.out.println("Escolha uma opção:");
        System.out.println("1. Retângulo");
        System.out.println("2. Diagonal superior esquerda");
        System.out.println("3. Diagonal superior direita");
        System.out.println("4. Diagonal inferior esquerda");
        System.out.println("5. Diagonal inferior direita");

        opcao = entrada.nextInt();

        // Solicitar tamanho
        System.out.print("Digite o tamanho (n): ");
        n = entrada.nextInt();

        // Laço principal para desenhar as figuras com base na opção
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                // Cálculo baseado na opção escolhida
                boolean imprimir = 
                    (opcao == 1) ||                     // Retângulo: imprime sempre
                    (opcao == 2 && i == j) ||           // Diagonal superior esquerda
                    (opcao == 3 && i + j == n - 1) ||   // Diagonal superior direita
                    (opcao == 4 && i == j) ||           // Diagonal inferior esquerda
                    (opcao == 5 && i + j == n - 1);     // Diagonal inferior direita

                // Imprime '*' ou espaço dependendo da condição
                if (imprimir) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        entrada.close();
    }
}
*/

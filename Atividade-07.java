/*
7. Crie um programa em Java que exiba formas geométricas na tela. Um menu deve ser exibido com as seguintes opções: retângulo, diagonal superior esquerda, diagonal superior direita,
diagonal inferior esquerda, diagonal inferior direita. As imagens devem ser formadas por asteriscos (*) e, a pessoa utilizadora deve informar a quantidade de colunas. Abaixo estão alguns
exemplos das formas:
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada= new Scanner(System.in);
    int n,op;
    
   System.out.println("Escolha uma opção:");
   System.out.println("1. Retângulo");
   System.out.println("2. Diagonal superior esquerda");
   System.out.println("3. Diagonal superior direita");
   System.out.println("4. Diagonal inferior esquerda");
   System.out.println("5. Diagonal inferior direita");
     
    op = entrada.nextInt();
    System.out.print("Digite o tamanho (n): ");
    n = entrada.nextInt();
    
    if(op ==1){
      for(int i = 0;i <= n;i++){
      for(int j= 0;j <= i; j++){
   		System.out.print("*");
    }
      System.out.println();
    }
   }else if (op== 2) {
          
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else if (op == 3) {
           
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else if (op == 4) {
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else if (op == 5) {
           
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            
            System.out.println("Opção inválida.");
        }
  }
}

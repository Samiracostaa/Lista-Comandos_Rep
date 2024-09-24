/*2-Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro),
ou seja, A*B, por intermédio de adições sucessivas. Tanto A quanto B devem ser fornecidos
pela pessoa utilizadora do programa.
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, resultado = 0;
        int B;

        System.out.println("Digite um número (A): ");
        A = entrada.nextDouble();
        System.out.println("Digite outro número inteiro (B): ");
        B = entrada.nextInt();

        if (B > 0) {
            for (int i = 0; i < B; i++) {
                resultado += A;
            }
        } else if (B < 0) {
            for (int i = 0; i < -B; i++) {
                resultado -= A;
            }
        } else {
            resultado = 0;
        }

        System.out.println("O produto de A * B é: " + resultado);
    }
}

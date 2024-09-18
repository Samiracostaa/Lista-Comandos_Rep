/* 3- Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo.
Sabendo-se que este perde 25% de sua massa a cada 30 segundos. Criar um programa que
calcule iterativamente e imprima o tempo necessário para que a massa deste material se torne
menor que 0,10 grama. O programa pode calcular o tempo para várias massas.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double massa;
        char cont;

        do {
            
            System.out.println("Digite a massa em gramas: ");
            massa = entrada.nextDouble();

            double temp = 0.0;
            int intervalo = 30; 

            while (massa >= 0.10) {
                massa *= 0.75; 
                temp += intervalo; 
            }

            System.out.printf("O tempo para a massa ser menor que 0,10 grama é: %.0f segundos%n", temp);
            System.out.printf("Massa final: %.5f gramas%n", massa);
            System.out.print("Deseja calcular para outra massa? (s/n): ");
            cont = entrada.next().charAt(0);

        } while (cont == 's' || cont == 'S');

    }
}

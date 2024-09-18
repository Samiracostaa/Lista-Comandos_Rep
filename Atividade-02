/*2-Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro),
ou seja, A*B, por intermédio de adições sucessivas. Tanto A quanto B devem ser fornecidos
pela pessoa utilizadora do programa.
*/


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada=new Scanner(System.in);
   double A,P = 0;
   int B;
    
    System.out.println("Digite um número: ");
   	A = entrada.nextDouble();
    System.out.println("Digite outro número: ");
    B = entrada.nextInt();
    
    //Math.abs - O loop funcione mesmo se for negativo.
    
 	for(int i=0; i<Math.abs(B);i++){
		P +=A;
    }
    System.out.println("O produto é : " + P);
    }
  }

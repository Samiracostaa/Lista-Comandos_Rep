/*1. Crie um programa que imprima a sequência dos 100 próximos números inteiros, seguintes a um
valor fornecido pela pessoa utilizadora.
*/

import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    Scanner entrada=new Scanner (System.in);
    int valorInicial;
    
    System.out.println("Informe o número: ");
    valorInicial = entrada.nextInt();
   
    for(int i= 0;i <100; i++){
	  System.out.println(i+1 + " º->"+ valorInicial);
      valorInicial = valorInicial + 1;
      
    }
  }
}

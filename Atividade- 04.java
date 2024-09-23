/*
4. Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números
ímpares e a soma dos números pares. Observação: O programa será encerrado quando um
valor negativo for inserido
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada=new Scanner (System.in);
 
    int n;
    int prod=1;
    int soma = 0;
    
    System.out.print("Digite um número: ");
    n = entrada.nextInt();
   
    while(n > 0){
    if(n % 2 == 0){
      soma += n;
    }else{
      prod *= n;
    }
    System.out.println("Digite outro número (número negativo para encerrar): ");
            n = entrada.nextInt();
        }
   /* if (prod == 1 && n % 2 != 0) {
            prod = 0;
        }
   */
    
     if (prod == 1) {
            prod = 0;
     }
    
    System.out.println("A soma dos números pares é: " + soma +"\nO produto dos números ímpares é: " + prod);
      
    }

}

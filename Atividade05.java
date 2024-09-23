/*
5. Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
(a) a quantidade de pessoas com idade superior a 50 anos;
(b) a média das alturas das pessoas com idade entre 10 e 20 anos;
(c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas
*/
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantMaior = 0;
        double soma = 0;
        int contadorAlt = 0;
        int contadorP= 0;
        int t = 10;

       
        for (int i = 1; i <= t; i++) {
            System.out.println("Pessoa " + i);

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.print("Digite a altura (em metros): ");
            double altura = entrada.nextDouble();

            System.out.print("Digite o peso (em quilos): ");
            double peso = entrada.nextDouble();

            if (idade > 50) {
                quantMaior++;
            }
          
            if (idade >= 10 && idade <= 20) {
                soma += altura;
                contadorAlt++;
            }
          
            if (peso < 40) {
                contadorP++;
            }
        }

       
        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + quantMaior);

        
        if (contadorAlt > 0) {
            double m = soma / contadorAlt;
            System.out.println("Média de altura das pessoas entre 10 e 20 anos: " + m);
        } else {
            System.out.println("Não há pessoas com idade entre 10 e 20 anos.");
        }

      
        double porcentagemPesoMenor40 = (double) contadorP / t * 100;
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: " + porcentagemPesoMenor40 + "%");

        entrada.close();
    }
}

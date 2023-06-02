/*Faça um programa para determinar quantos metros quadrados de grama são necessários para
preencher uma praça circular. O usuário deve entrar com o raio da praça, em metros.
Assuma que π = 3,14. */

import java.util.Scanner;

public class AreaPracaCircular {
    public static void main(String[] args) {
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor do raio da praça: ");
        double raio = input.nextDouble();
        
        input.close();

        System.out.printf("A área da praça circular é de %.2f metros!\n", pi*(Math.pow(raio, 2)));


    }
}

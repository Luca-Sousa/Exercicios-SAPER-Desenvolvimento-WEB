/*Defina um programa que recebe um número inteiro e diz o módulo desse número.
Por exemplo, o módulo de -5 é 5 e o módulo de 2 é 2. */

import java.util.Scanner;

public class ModuloNumeral {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        input.close();

        if (numero >= 0) {
            System.out.printf("O módulo de |%d| é: %d\n", numero, numero);
        } else {
            System.out.printf("O módulo de |%d| é: %d\n", numero, -1 * numero);
        }
    }
}

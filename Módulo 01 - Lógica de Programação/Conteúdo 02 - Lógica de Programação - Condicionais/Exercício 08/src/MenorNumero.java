/*Fazer um programa que diz o menor entre três números recebidos. */

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Primeiro Número: ");
        number1 = input.nextInt();

        System.out.print("Informe o Segundo Número: ");
        number2 = input.nextInt();

        System.out.print("Informe o Terceito Número: ");
        number3 = input.nextInt();

        input.close();

        if (number1 <= number2 && number1 <= number3) {
            System.out.printf("o %d é o menor número.\n", number1);
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.printf("O %d é o menor número.\n", number2);
        } else {
            System.out.printf("O %d é o menor número.\n", number3);
        }
    }
}

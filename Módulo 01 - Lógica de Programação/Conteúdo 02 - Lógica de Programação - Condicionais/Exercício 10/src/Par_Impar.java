/*Defina um programa que recebe um número natural e diz se o número é par ou ímpar. */
import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        int numero;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número natural: ");
        numero = input.nextInt();

        input.close();

        if (numero % 2 == 0) {
            System.out.print("O número é Par.\n");
        } else {
            System.out.print("O número é Ímpar.\n");
        }
    }
}

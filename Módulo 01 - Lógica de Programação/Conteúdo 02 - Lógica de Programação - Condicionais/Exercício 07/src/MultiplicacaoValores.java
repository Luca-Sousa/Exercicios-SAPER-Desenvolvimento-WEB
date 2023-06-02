/*Fazer um programa que execute a multiplicação de dois valores lidos. E se o resultado
da multiplicação for menor que 25 ou maior que 50, mostrar a metade do resultado.*/

import java.util.Scanner;

public class MultiplicacaoValores {
    public static void main(String[] args) {
        double valor1, valor2, resultadoMultiplicacao;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Primeiro Valor: ");
        valor1 = input.nextDouble();

        System.out.print("Informe o Segundo Valor: ");
        valor2 = input.nextDouble();

        input.close();

        resultadoMultiplicacao = valor1 * valor2;

        System.out.printf("resultado da multiplicação: %.2f!\n", resultadoMultiplicacao);

        if (resultadoMultiplicacao < 25 || resultadoMultiplicacao > 50) {
            System.out.printf("A metade do Resultado é: %.2f\n", resultadoMultiplicacao/2);
        }
    }
}

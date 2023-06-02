/*Faça um programa em que o usuário digita as duas notas de um aluno e mostra se o aluno foi
aprovado (média aritmética maior ou igual a 7). */

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        double nota1, nota2, mediaAritmetica;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a Primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a Segunda nota: ");
        nota2 = input.nextDouble();

        input.close();

        mediaAritmetica = (nota1 + nota2) / 2.0;

        if (mediaAritmetica >= 7) {
            System.out.printf("Média: %.2f. Aluno Aprovado!\n", mediaAritmetica);
        }
        else {
            System.out.printf("Média: %.2f. Aluno Reprovado!\n", mediaAritmetica);
        }
    }
}

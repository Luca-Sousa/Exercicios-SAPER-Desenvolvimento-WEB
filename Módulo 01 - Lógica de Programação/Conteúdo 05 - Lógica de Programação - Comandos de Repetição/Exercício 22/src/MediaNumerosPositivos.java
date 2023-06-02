/* Construa um algoritmo que calcula a média aritmética de um
conjunto de números positivos pares fornecidos pelo usuário. O
usuário pode digitar qualquer número inteiro e digita -1 para
terminar. */
import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) throws Exception {
        
        int numeroDigitado;
        double soma = 0;
        int contador = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite um número inteiro (-1 para encerrar): ");
            numeroDigitado = input.nextInt();

            if (numeroDigitado > 0 && numeroDigitado % 2 == 0) {
                System.out.print("O número digitado ENTRARÁ na média dos pares positivos\n");
                soma += numeroDigitado;
                contador++;
            }
            else {
                System.out.print("O número digitado NÃO ENTRARÁ na média dos pares positivos\n");
            }
        } while (numeroDigitado != -1);

        input.close();

        if (contador > 0) {
            System.out.printf("A soma dos pares positivos digitados é: %.2f\n", soma);
            System.out.printf("A média dos pares positivos digitados é: %.2f\n", soma/contador);
        }
        else {
            System.out.printf("Você não digitou nenhum par positivo!\n");
        }
    }
}
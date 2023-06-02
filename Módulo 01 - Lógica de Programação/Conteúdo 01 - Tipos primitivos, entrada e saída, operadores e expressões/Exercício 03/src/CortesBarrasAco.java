/*Uma empresa corta barras de aço em pedaços de tamanhos iguais.
Construa um programa em que o usuário digita o tamanho da barra de aço e o programa
mostra o que sobra da barra de aço depois de cortá-la em pedaços de 5 metros até não
ser mais possível. */

import java.util.Scanner;

public class CortesBarrasAco {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Tamanho da Barra de Aço: ");
        int tamanhoBarra = input.nextInt();

        input.close();

        System.out.printf("A Barra de Aço foi cortada em %d pedaços!\n", tamanhoBarra / 5);
        System.out.printf("O que sobrou da Barra de Aço: %d\n", tamanhoBarra % 5);
    }
}

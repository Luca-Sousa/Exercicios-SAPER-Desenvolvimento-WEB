/* Faça um programa em que o usuário insere a quantidade de
elementos de uma lista e o programa coloca o valor 0 nas
posições pares e 1 nas posições ímpares. */

import java.util.Scanner;

public class ElementosLista {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de Elementos da lista: ");
        int qtdeElementos = input.nextInt();

        int[] lista = new int[qtdeElementos];

        for (int i = 0; i < lista.length; i++) {
            if (i % 2 == 0) {
                lista[i] = 0;
            } else {
                lista[i] = 1;
            }
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.printf("Elemento na posição %d do vetor: %d%n", i, lista[i]);
        }

        input.close();
    }
}
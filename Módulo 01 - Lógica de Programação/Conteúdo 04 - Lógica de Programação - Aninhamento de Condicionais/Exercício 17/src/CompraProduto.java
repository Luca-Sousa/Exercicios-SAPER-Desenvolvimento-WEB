/* Faça um programa que calcula o que deve ser pago por um produto, considerando o preço
original e a forma de pagamento:
   Código        Pagamento
      1     Dinheiro: 10% de desconto
      2     1x no cartão: 5% de desconto
      3     2x no cartão: preço original
      4     3x no cartão: juros de 5% do original */

import java.util.Scanner;

public class CompraProduto {
    public static void main(String[] args) {

        Scanner inputDouble = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.print("Informe o preço do Produto: ");
        double preco_original = inputDouble.nextDouble();

        System.out.print("---------- Formas de Pagamento ----------\n");
        System.out.print("[1] - Dinheiro: 10% de desconto\n" +
                         "[2] - 1x no cartão: 5% de desconto\n" +
                         "[3] - 2x no cartão: preço original\n" +
                         "[4] - 3x no cartão: juros de 5% do original\n");
        System.out.print("Informe a sua escolha: ");
        int codigo = inputInt.nextInt();

        inputDouble.close();
        inputInt.close();

        switch (codigo) {
            case 1: preco_original -= preco_original * 0.1;
                System.out.printf("O valor do produto em dinheiro, com um desconto de 10%% vale: %.2f!\n", preco_original);
                break;
            case 2: preco_original -= preco_original * 0.05;
                System.out.printf("O valor do produto parcelado em 1x, com um desconto de 5%% vale: %.2f!\n", preco_original);
                break;
            case 3: 
                System.out.printf("O valor do produto parcelado em 2x vale: %.2f!\n", preco_original);
                break;
            case 4: preco_original += preco_original * 0.05;
                System.out.printf("O valor do produto parcelado em 3x, com juros de 5%% vale: %.2f!\n", preco_original);
                break;
            default: 
                System.out.print("Opção Inválida!\n");
                break;
        }
    }
}
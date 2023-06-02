/* Faça um programa que mostra o valor das vendas de uma loja e
a média de vendas de todos os vendedores. O usuário do
programa deve fornecer a quantidade de vendedores da loja e o
valor das vendas de cada vendedor. 

COMPLEMENTO: Modifique o programa anterior para mostrar o maior valor de
vendas e o número do vendedor que mais vendeu.*/

import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de vendedores da loja: ");
        int qtdeVendedores = input.nextInt();

        double valorVendas;
        double totalVendasLoja = 0;
        double maiorVenda = 0;
        int melhorVendedor = 0;

        for (int i = 0; i < qtdeVendedores; i++) {
            System.out.printf("Digite o valor das vendas do %dº vendedor(a): ", i + 1);
            valorVendas = input.nextDouble();
            totalVendasLoja += valorVendas;

            if (valorVendas > maiorVenda) {
                maiorVenda = valorVendas;
                melhorVendedor = i + 1;
            }

        }

        input.close();

        System.out.printf("Valor Total de vendas da loja: %.2f%n", totalVendasLoja);
        System.out.printf("Média de vendas dos vendedores: %.2f%n", totalVendasLoja/qtdeVendedores);
        System.out.printf("Maior valor de venda entre os vendedores: %.2f%n", maiorVenda);
        System.out.printf("Vendedor que mais vendeu: %dº vendedor(a)~%n", melhorVendedor);
    }
}
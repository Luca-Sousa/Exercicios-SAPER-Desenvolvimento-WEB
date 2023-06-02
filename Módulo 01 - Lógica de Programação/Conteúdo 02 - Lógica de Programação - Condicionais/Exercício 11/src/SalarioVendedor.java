/*Faça um programa que recebe o salário de um vendedor e o valor total das suas vendas.
Se o salário for menor que R$1500,00 e valor das vendas for maior que R$ 2000,00, o
programa deve aumentar o salário em 10% e mostrar o novo salário. Caso contrário, o 
programa deve informar que não teve aumento. */

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        double salarioVendedor, valorTotalVendas;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Salario do Funcionário: ");
        salarioVendedor = input.nextDouble();

        System.out.print("Informe o Valor Total das Vendas: ");
        valorTotalVendas = input.nextDouble();

        input.close();

        if (salarioVendedor < 1500 && valorTotalVendas > 2000) {
            salarioVendedor += salarioVendedor * (10/100.0);
            System.out.printf("O novo Salário é de: %.2f\n", salarioVendedor);
        } else {
            System.out.print("O Funcionário não teve aumento!\n");
        }
    }
}

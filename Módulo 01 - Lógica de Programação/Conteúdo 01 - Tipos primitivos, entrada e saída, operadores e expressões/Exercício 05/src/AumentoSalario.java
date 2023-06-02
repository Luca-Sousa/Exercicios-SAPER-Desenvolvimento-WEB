/*Escreva um programa para aumentar em 10% o salário do funcionário Carlos.
O usuário deve digitar o salário do Carlos e o programa deve mostrar o novo salário
e o valor do aumento em reais. 

COMPLEMENTO: Use a mesma variável que armazena o salário original
de Carlos para guardar o novo salário.*/

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        double salario, acrescimoSalario;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o Salário do Funcionário: ");
        salario = input.nextDouble();

        input.close();

        acrescimoSalario = salario * (10/100.0);

        salario += acrescimoSalario;

        System.out.printf("O novo Salário do Funcionário: R$%.2f!\nAcréscimo de R$%.2f!\n", salario, acrescimoSalario);
    }
}
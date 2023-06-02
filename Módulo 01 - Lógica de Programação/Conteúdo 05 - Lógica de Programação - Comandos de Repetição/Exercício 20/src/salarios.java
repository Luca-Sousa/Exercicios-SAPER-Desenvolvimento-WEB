/* Faça um programa que recebe do usuário o salário de todos os
20 funcionários de uma empresa. O programa deve mostrar o
gasto da empresa com o salário dos funcionários.

COMPLEMENTO: Modifique o programa anterior para também mostrar a média
salarial dos funcionários da empresa.*/

import java.util.Scanner;

public class salarios {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        double salario;
        double gasto = 0;
        int qtdeFuncionarios = 20;
        int i = 0;

        while (i < qtdeFuncionarios) {
            System.out.printf("Digite o salário do %d funcionário(a): ", i + 1);
            salario = input.nextDouble();
            gasto += salario;
            i++;
        }

        System.out.printf("O gasto da empresa com salários e: %.2f\n", gasto);
        System.out.printf("A média salarial da empresa e: %.2f\n", gasto/qtdeFuncionarios);

        input.close();
    }
}

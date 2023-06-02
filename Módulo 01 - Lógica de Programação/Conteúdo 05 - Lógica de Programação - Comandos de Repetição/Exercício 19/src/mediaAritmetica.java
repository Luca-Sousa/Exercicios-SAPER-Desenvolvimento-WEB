/* Faça um programa para calcular e mostrar a média aritmética
das duas notas de cada aluno de uma turma de 100 alunos. 

COMPLEMENTO: Modifique o programa anterior para poder ser utilizado em
qualquer turma. Ou seja, o programa deve poder ser utilizado
em turmas de qualquer quantidade de alunos.*/

import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) throws Exception {

        int counter = 1;
        double nota1, nota2;

        Scanner inputDouble = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.print("Informe a quantidade de Alunos da turma: ");
        int qtAlunos = inputInt.nextInt();

        while (counter <= qtAlunos) {
            System.out.printf("Informe a Primeira nota do aluno %d: ", counter);
            nota1 = inputDouble.nextDouble();

            System.out.printf("Informe a Segunda nota do aluno %d: ", counter);
            nota2 = inputDouble.nextDouble();

            System.out.printf("A média do aluno %d: %.2f\n", counter, (nota1 + nota2) / 2.0);
            
            counter++;
        }

        inputDouble.close();
        inputInt.close();
    }
}
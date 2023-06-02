/* Fazer um programa que recebe a nota de cada aluno de uma
turma. O programa deve mostrar a média geral da turma e a
quantidade de alunos com média maior ou igual a média da
turma. */

import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a Quantidade de Alunos da Turma: ");
        int qtdeAlunos = input.nextInt();

        double[] notasAlunos = new double[qtdeAlunos];
        double somaNotas = 0;

        for (int i = 0; i < notasAlunos.length; i++) { 
            System.out.printf("Digite a nota do %d° aluno: ", i + 1);
            notasAlunos[i] = input.nextDouble();

            somaNotas += notasAlunos[i];
        }

        input.close();

        double mediaTurma = somaNotas/qtdeAlunos;
        int contador = 0;

        // For melhorado: acessando diretamente os elementos do vetor notasAlunos
        for (double notasAluno : notasAlunos) { 

            if(notasAluno >= mediaTurma) {
                contador++;
            }
        }

        System.out.printf("Média Geral da Turma: %.2f%n", mediaTurma);
        System.out.printf("Quantidade de Alunos com nota maior ou igual a média da turma: %d%n", contador);
    }
}
/* Faça um programa que recebe as duas notas de cada aluno de
uma turma e mostra a média e a situação de cada um deles e a
média geral da turma. O usuário deve digitar a quantidade de
alunos na turma. As situações dos alunos são as seguintes:
• O aluno está aprovado direto se tiver a média maior ou igual 7.
• Reprovado direto se a média for menor que 5.
• Recuperação se a média for maior ou igual a 5 e menor que 7. */
import java.util.Scanner;

public class MediaGeral {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de Alunos da turma: ");
        int qtdeAlunos = input.nextInt();

        int counter = 0;
        double nota1;
        double nota2;
        double soma = 0;
        double mediaAluno;

        while (counter < qtdeAlunos) {
            
            System.out.printf("Digite a primeira nota do Aluno %d: ", counter + 1);
            nota1 = input.nextDouble();

            System.out.printf("Digite a segunda nota do Aluno %d: ", counter + 1);
            nota2 = input.nextDouble();

            mediaAluno = (nota1 + nota2)/2;

            soma += mediaAluno;

            if (mediaAluno >= 7) {
                System.out.printf("Aluno Aprovado com Média: %.2f%n", mediaAluno);
            } 
            else if (mediaAluno < 5) {
                System.out.printf("Aluno Reprovado com Média: %.2f%n", mediaAluno);
            }
            else {
                System.out.printf("Aluno em Recuperação com Média: %.2f%n", mediaAluno);
            }
            
            counter++;
        }

        input.close();

        System.out.printf("A média da turma é: %.2f%n", soma/qtdeAlunos);
    }
}

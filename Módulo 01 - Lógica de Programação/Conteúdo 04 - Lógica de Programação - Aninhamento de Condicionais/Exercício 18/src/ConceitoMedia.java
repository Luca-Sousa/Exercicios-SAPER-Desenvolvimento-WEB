/* Crie uma classe Student que inclui dois atributos: nome (String) e média (double).
Forneça um construtor que inicializa o nome e inicializa a média caso ela seja maior ou
igual a 0 e menor ou igual a 100. Forneça métodos set e get para cada atributo. No caso 
da média, o método set também deve fazer uma validação assim como no construtor. Além disso,
construa um método que associa um conceito à média do aluno conforme a tabela abaixo.
Em seguida, crie uma classe de teste.
Conceito            Média
    A       maior ou igual a 90
    B       maior ou igual a 80 e menor que 90
    C       maior ou igual a 70 e menor que 80
    D       maior ou igual a 60 e menor que 70
    F       menor que 60 */

import java.util.Scanner;

public class ConceitoMedia {
    public static void main(String[] args) {

        Scanner inputDoubles = new Scanner(System.in);
        Scanner inputStrings = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro Aluno: ");
        String nomeAluno = inputStrings.nextLine();

        System.out.print("Digite a média do primeiro Aluno: ");
        Double mediaAluno = inputDoubles.nextDouble();

        Aluno estudante1 = new Aluno(nomeAluno, mediaAluno);

        System.out.print("Digite o nome do segundo Aluno: ");
        nomeAluno = inputStrings.nextLine();

        System.out.print("Digite a média do segundo Aluno: ");
        mediaAluno = inputDoubles.nextDouble();

        Aluno estudante2 = new Aluno(nomeAluno, mediaAluno);

        inputDoubles.close();
        inputStrings.close();

        System.out.println("----- Conceitos -----");
        System.out.printf("Conceito do primeiro Aluno: %c\n", estudante1.conceito());
        System.out.printf("Conceito do primeiro Aluno: %c\n", estudante2.conceito());
    }
}

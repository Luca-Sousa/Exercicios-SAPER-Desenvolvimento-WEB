/* Construa uma classe chamada Date que inclui três atributos: mes (int), dia (int) e ano (int).
Forneça um construtor que inicializa os três atributos e assume que os valores fornecidos
são corretos. Forneça métodos set e get para cada atributo. Forneça um método displayDate que mostra
o dia, mês e ano separados por barra (/). Escreva um programa principal para demonstrar as características
 da classe Date */

import java.util.Scanner;

public class DisplayData {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia do mês de hoje: ");
        int dia = input.nextInt();

        System.out.print("Digite o mês atual: ");
        int mes = input.nextInt();

        System.out.print("Digite o ano atual: ");
        int ano = input.nextInt();

        Data dataHoje = new Data(dia, mes, ano);

        System.out.print("Digite o dia do mês do seu Aniversário: ");
        dia = input.nextInt();

        System.out.print("Digite o mês do seu Aniversário: ");
        mes = input.nextInt();

        System.out.print("Digite o ano do seu Aniversário: ");
        ano = input.nextInt();

        Data dataNiver = new Data(dia, mes, ano);

        input.close();

        System.out.printf("A data de Hoje: %02d/%02d/%04d%n", dataHoje.getDia(), dataHoje.getMes(), dataHoje.getAno());
        System.out.printf("A data de Aniversário: %02d/%02d/%04d%n", dataNiver.getDia(), dataNiver.getMes(), dataNiver.getAno());
    }
}

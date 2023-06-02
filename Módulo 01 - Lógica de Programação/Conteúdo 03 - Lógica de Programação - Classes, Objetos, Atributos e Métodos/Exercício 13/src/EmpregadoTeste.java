/* Crie uma classe Employee que inclui três atributos: um primeiro nome (String), um último
nome (String) e um salário mensal (double). Forneça um construtor que inicializa os três atributos. 
Forneça métodos set e get para cada atributo. Se o salário mensal não for positivo, não inicialize 
o seu valor. Escreva um programa EmployeeTest que demonstra as capacidades da classe Employee.
Crie dois objetos Employee e mostre o salário anual de cada objeto. Depois dê a cada empregado um
aumento de 10% e mostre o salário anual dos empregados novamente. */

public class EmpregadoTeste {
    public static void main(String[] args){
		Empregado chefe = new Empregado("José", "da Silva", 10000);
		Empregado gerente = new Empregado("Maria", "Sousa", 4000);

		System.out.print("Mostrando o salário anual dos empregados:\n");
		System.out.printf("Salário anual do %s %s é %.2f.%n", chefe.getPrimeiroNome(), chefe.getUltimoNome(), chefe.getSalarioMensal()*12);
		System.out.printf("Salário anual do %s %s é %.2f.%n", gerente.getPrimeiroNome(), gerente.getUltimoNome(), gerente.getSalarioMensal()*12);

		System.out.print("Aumentando em 10% os salários dos empregados ...\n");

		chefe.setSalarioMensal(chefe.getSalarioMensal() * 1.1);
		gerente.setSalarioMensal(gerente.getSalarioMensal() * 1.1);

		System.out.print("Mostrando o salário anual dos empregados:\n");
		System.out.printf("Salário anual do %s %s é %.2f.%n", chefe.getPrimeiroNome(), chefe.getUltimoNome(),chefe.getSalarioMensal()*12);
		System.out.printf("Salário anual do %s %s é %.2f.%n", gerente.getPrimeiroNome(), chefe.getUltimoNome(), gerente.getSalarioMensal()*12);
    }
}

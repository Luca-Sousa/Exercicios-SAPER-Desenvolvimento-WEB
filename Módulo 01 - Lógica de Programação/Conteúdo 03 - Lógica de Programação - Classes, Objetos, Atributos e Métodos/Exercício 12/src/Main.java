/*Adaptar a classe Account para armazenar o saldo da conta. Sua classe deve ter um construtor
que recebe um nome e um saldo inicial e o construtor deve validar se o saldo inicial é maior ou
igual a 0. Caso o saldo inicial do construtor seja negativo, inicializar o saldo com 0. Você
também deve criar um método para fazer um depósito de forma que o depósito só seja efetivado se 
for válido, ou seja, se o depósito for maior que 0. Além disso, você deve criar um método get
para recuperar o saldo. Em seguida, crie uma classe como programa principal para usar a classe
Account com valores válidos e inválidos de saldo. 

COMPLEMENTO: Modifique a classe Account para fornecer um método chamado saque para retirar 
dinheiro de uma conta. Garante que a quantidade a ser retirada não exceda o saldo da conta. Se
exceder, o saldo deve permanecer inalterado e o método deve mostrar uma mensagem "Valor de saque
excede o saldo da conta". Cria uma classe com um método main para testar o seu método saque.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputStrings = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        //CRIAÇÃO DA CONTA DO CLIENTE 01
        System.out.print("-- Criando a conta do cliente 1 --\n");
        System.out.print("Digite o nome do cliente 1: ");
        String nomeCliente = inputStrings.nextLine();
        System.out.print("Digite o Saldo inicial do cliente 1: ");
        double saldoInicialCliente = input.nextDouble();

        Account cliente = new Account(nomeCliente, saldoInicialCliente);

        //DADOS DO CLIENTE 01 APÓS A CRIAÇÃO DA CONTA
        System.out.print(" -- Conta do cliente 1 criada: --\n");
        System.out.printf("Nome do cliente 1: %s%n", cliente.getName());
        System.out.printf("Saldo do cliente 1: %.2f%n", cliente.getSaldo());

        //CRIAÇÃO DA CONTA DO CLIENTE 02
        System.out.print("-- Criando a conta do cliente 2 --\n");
        System.out.print("Digite o nome do cliente 2: ");

        Account cliente2 = new Account(inputStrings.nextLine(), 100);

        //DADOS DO CLIENTE 01 APÓS A CRIAÇÃO DA CONTA
        System.out.print(" -- Conta do cliente 2 criada: --\n");
        System.out.printf("Nome do cliente 2: %s%n", cliente2.getName());
        System.out.printf("Saldo do cliente 2: %.2f%n", cliente2.getSaldo());

        //OPERAÇÕES DE DEPÓSITO DOS CLIENTES
        System.out.print(" -- Operações de Depósito --\n");
        System.out.print("Cliente 1 fazendo um depósito ... \n");
        cliente.deposito(50.60);

        System.out.print("Cliente 2 fazendo um depósito ... \n");
        cliente.deposito(-10);

        //DADOS DOS CLIENTES APÓS O DEPÓSITO
        System.out.print(" -- Contas depois dos depósitos --\n");
		System.out.printf("Nome do cliente 1: %s%n", cliente.getName());
		System.out.printf("Saldo do cliente 1: %.2f%n", cliente.getSaldo());

		System.out.printf("Nome do cliente 2: %s%n", cliente2.getName());
		System.out.printf("Saldo do cliente 2: %.2f%n", cliente2.getSaldo());

        //OPERAÇÕES DE SAQUE DOS CLIENTES
        System.out.print(" -- Operações de saque --\n");
		System.out.print("Cliente 1 fazendo um saque ...\n");
		cliente.saque(45.99);

		System.out.print("Cliente 2 fazendo um saque ...\n");
		cliente2.saque(102.36);

        //DADOS DOS CLIENTES APÓS O SAQUE
        System.out.print(" -- Contas depois dos saques --\n");
		System.out.printf("Nome do cliente 1: %s%n", cliente.getName());
		System.out.printf("Saldo do cliente 1: %.2f%n", cliente.getSaldo());

		System.out.printf("Nome do cliente 2: %s%n", cliente2.getName());
		System.out.printf("Saldo do cliente 2: %.2f%n", cliente2.getSaldo());

        inputStrings.close();
        input.close();
    }
}
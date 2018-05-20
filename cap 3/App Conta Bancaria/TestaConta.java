/**
 * Classe que cria e utiliza os objetos da classe ContaBancaria
 * Class that creates and uses the objects of the BankAccount class
 */

import java.util.Scanner;

public class TestaConta{

	public static void main(String[] args){

		// objeto do tipo Scanner para leitura de dados
		Scanner input = new Scanner(System.in);

		double valor_deposito, valor_saque;

		// criando novos objetos conta do tipo ContaBancaria
		ContaBancaria conta1 = new ContaBancaria("Darth Vader", 50.00);
		ContaBancaria conta2 = new ContaBancaria("Luke Skywalker", -7.53); // *inserindo um valor invalido

		// exibindo o saldo inicial de cada objeto
		System.out.println("\nSaldo do(a) " + conta1.getNome() + ": R$ " + conta1.getSaldo());
		System.out.println("Saldo do(a) " + conta2.getNome() + ": R$ " + conta2.getSaldo());
		
		//
		//
		// depositando valor na conta1:
		
		System.out.print("\nInsira o valor do deposito para a conta1: ");
		valor_deposito = input.nextDouble();
		
		System.out.println("\nAdicionando R$ " + valor_deposito + " para o saldo do(a) " + conta1.getNome() +" ...");
		// adicionando o deposito realizado para o saldo da conta1:
		conta1.depositar(valor_deposito);
		
		// exibindo novamente os saldos
		System.out.println("\nSaldo do(a) " + conta1.getNome() + ": R$ " + conta1.getSaldo());
		System.out.println("Saldo do(a) " + conta2.getNome() + ": R$ " + conta2.getSaldo());

		//
		//
		// depositando valor na conta2:
		
		System.out.print("\nInsira o valor do deposito para a conta2: ");
		valor_deposito = input.nextDouble();

		System.out.println("\nAdicionando R$ " + valor_deposito + " para o saldo do(a) " + conta2.getNome() +" ...");
		// adiciona o deposito realizado para o saldo da conta1:
		conta2.depositar(valor_deposito);

		// exibe os saldos novamente
		System.out.println("\nSaldo do(a) " + conta1.getNome() + ": R$ " + conta1.getSaldo());
		System.out.println("Saldo do(a) " + conta2.getNome() + ": R$ " + conta2.getSaldo());

		//
		// * Teste do metodo de saque das contas
		// 
		// sacando valor da conta1:

		System.out.print("\nInsira o valor do saque da conta1: ");
		valor_saque = input.nextDouble();

		System.out.println("\nSacando R$ " + valor_saque + " da conta do " + conta1.getNome());
		conta1.sacar(valor_saque);

		System.out.println("\nSaldo do(a) " + conta1.getNome() + ": R$ " + conta1.getSaldo());
		System.out.println("Saldo do(a) " + conta2.getNome() + ": R$ " + conta2.getSaldo());

		//
		//
		// sacando valor da conta2:

		System.out.print("\nInsira o valor do saque da conta2: ");
		valor_saque = input.nextDouble();

		System.out.println("\nSacando R$ " + valor_saque + " da conta do " + conta2.getNome());
		conta2.sacar(valor_saque);

		System.out.println("\nSaldo do(a) " + conta1.getNome() + ": R$ " + conta1.getSaldo());
		System.out.println("Saldo do(a) " + conta2.getNome() + ": R$ " + conta2.getSaldo());
	}
}
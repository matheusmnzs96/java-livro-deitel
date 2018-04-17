/**
 * Construção de uma classe que simula uma conta bancaria
 * Building a class that simulates a bank account 
 *
 * @author Matheus dos S. Menezes
 * @since 2018-02-21
 * Icomp - UFAM
 * Manaus, Brazil
 */

public class ContaBancaria{
	
	// variáveis de instância
	private String nome;
	private double saldo;

	/* Método construtor inicializando os objetos da classe
	com parâmetros */
	public ContaBancaria(String novo_nome, double novo_saldo){
		this.nome = novo_nome;
		
		/* valida se o saldo é maior que 0.0; caso contrário, a variável
		de instância 'saldo' mantém seu valor inicial padrão de 0.0 */
		if(novo_saldo > 0.0){
			this.saldo = novo_saldo;
		}
	}

	// método modificador do nome
	public void setNome(String novo_nome){
		this.nome = novo_nome;
	}

	// método de retorno do nome
	public String getNome(){
		return this.nome;
	}

	// método retorna o saldo da conta
	public double getSaldo(){
		return this.saldo;
	}

	// método faz depósito somente de valores válidos no saldo
	public void depositar(double total_deposito){
		if(total_deposito > 0.0){
			this.saldo += total_deposito;
		}
	}

	// método de saque da conta
	public void sacar(double total_saque){
		// verifica se o valor de saque nao excede o saldo bancario: 
		if(total_saque <= this.saldo){
			this.saldo -= total_saque;
		}
		// caso contrario o usuario e alertado:
		else{
			System.out.println("\nValor de debito excedeu o saldo da conta!");
		}
	}
}
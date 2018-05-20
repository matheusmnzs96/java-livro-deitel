// Teste da classe Empregado

import java.util.Scanner;

public class TestaEmpregado{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o nome, sobrenome e salario mensal do empregado 1:");
		String nome1 = input.next();
		String sobrenome1 = input.next();
		double salario1 = input.nextDouble();
		
		System.out.println("\n");

		System.out.println("Informe o nome, sobrenome e salario mensal do empregado 2:");
		String nome2 = input.next();
		String sobrenome2 = input.next();
		double salario2 = input.nextDouble();

		// inicializando os objetos Empregado:
		Empregado e1 = new Empregado(nome1, sobrenome1, salario1);
		Empregado e2 = new Empregado(nome2, sobrenome2, salario2);

		System.out.println("\n");

		// exibindo dados do empregado 1
		System.out.println("------ Dados do empregado 1 ------\n");
		System.out.printf("Nome: %s\nSobrenome: %s\nSalario Mensal: %.2f\n", e1.getNome(), e1.getSobreNome(), e1.getSalarioMensal());
		System.out.printf("Salario Anual: %.2f\nSalario Anual com aumento de 10%%: %.2f\n",
		e1.getSalarioMensal()*12, (e1.getSalarioMensal()*12)*1.10);

		System.out.println("\n");

		// exibindo dados do empregado 2
		System.out.println("------ Dados do empregado 2 ------\n");
		System.out.printf("Nome: %s\nSobrenome: %s\nSalario Mensal: %.2f\n", e2.getNome(), e2.getSobreNome(), e2.getSalarioMensal());
		System.out.printf("Salario Anual: %.2f\nSalario Anual com aumento de 10%%: %.2f\n",
		e2.getSalarioMensal()*12, (e2.getSalarioMensal()*12)*1.10);
	}
}
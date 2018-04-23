/**
 * @author Matheus dos Santos Menezes
 * @since 2018-04-17
 */

import java.util.Scanner;

public class TesteFrequenciaCardiaca{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("\n------------ Seja bem vindo ao Heart Rate Test! ------------\n");

		System.out.print("\nPor favor, informe seu nome e sobrenome: ");
		String nome = input.next();
		String sobrenome = input.next();
		System.out.println();

		System.out.print("Informe sua data de nascimento (Ex: 01/01/99): ");
		String data = input.next();
		System.out.println("\n");


		FrequenciaCardiaca usuario = new FrequenciaCardiaca(nome, sobrenome, data);

		System.out.println("-----------------------------------------------------");
		System.out.println("\nSeu teste de frequencia cardiaca esta em andamento...");
		System.out.println("...\n");


		System.out.printf("Caro %s %s, esses sao seus seguintes dados:\n", usuario.getNome(), usuario.getSobrenome());

		System.out.println("\n-------------------------------------------------");
		System.out.printf("|Idade: %d\n|Frequencia Cardiaca Maxima (FCM): %d\n", usuario.getIdade(), usuario.fcMaxima());
		System.out.printf("|Frequencia Cardiaca Alvo (Minima): %.2f\n|Frequencia Cardiaca Alvo (Maxima): %.2f\n", usuario.fcAlvoMin(), usuario.fcAlvoMax());
		System.out.println("-------------------------------------------------");
	}
}
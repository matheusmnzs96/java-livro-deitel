/**
 * "Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
 * sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
 * método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de
 * teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
 * de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee."
 *
 * @author Matheus Menezes
 * created on 2018-04-11
 * Manaus, Brazil
 */

public class Empregado{

	private String nome, sobrenome;
	private double salario;

	public Empregado(String nome, String sobrenome, double salario){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setSobreNome(String sobrenome){
		this.sobrenome = sobrenome;
	}

	public String getSobreNome(){
		return this.sobrenome;
	}

	public void setSalarioMensal(double salario){
		this.salario = salario;
	}

	public double getSalarioMensal(){
		if(this.salario < 0){
			setSalarioMensal(0.0);
		}

		return this.salario;
	}
}
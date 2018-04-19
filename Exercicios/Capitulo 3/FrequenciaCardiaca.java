import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

/**
 * Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome,
 * sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um
 * construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve incluir um método
 * que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência
 * cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e
 * imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade
 * da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.
 *
 *
 * @author Matheus dos Santos Menezes
 * @since 2018-04-17
 */


public class FrequenciaCardiaca{

	private String nome;
	private String sobrenome;
	private String dataNascimento;

	public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}

	public String getSobrenome(){
		return this.sobrenome;
	}

	public void setDataNascimento(String dataNascimento){
		this.dataNascimento = dataNascimento;
	}

	public String getDataNascimento(){
		return this.dataNascimento;
	}

	// retorna a idade do usuario em anos a partir da data de nascimento
	public int getIdade(){
    	String data = getDataNascimento();
		
		// converte a data de nascimento (String) para LocalDate 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNascimento = LocalDate.parse(data,formatter);
		
		// variavel (tipo LocalDate) contendo a data atual
		LocalDate dataAtual = LocalDate.now();

		// variavel (tipo Period) que calcula o periodo entre as duas datas
		Period idade = Period.between(dataNascimento, dataAtual);

		// por fim retorna o numero de anos entre as datas
		return idade.getYears();
	}

	// retorna a frequência cardíaca MAXIMA
	public int fcMaxima(){
		return 220 - getIdade();
	}

	// retorna a frequencia cardíaca ALVO mínima
	public double fcAlvoMin(){
		return fcMaxima() * 0.50;
	}

	// retorna a frequencia cardíaca ALVO máxima
	public double fcAlvoMax(){
		return fcMaxima() * 0.85;
	}

}
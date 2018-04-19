/**
 * Classe construida para representar a fatura da venda de itens de uma loja de informatica
 * @author Matheus Menezes
 * 2018-03-18
 */

public class Fatura{

	// informacoes do produto:
	private String numeroFatura, descricao;
	private int quantidade;
	private double preco;

	// metodo construtor
	public Fatura(String numeroFatura, String descricao, int quantidade, double preco){
		this.numeroFatura = numeroFatura;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public void setNumeroFatura(String numeroFatura){
		this.numeroFatura = numeroFatura;
	}

	public String getNumeroFatura(){
		return this.numeroFatura;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao(){
		return this.descricao;
	}

	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}

	public int getQuantidade(){
		return this.quantidade;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public double getPreco(){
		return this.preco;
	}

	public double getFaturaTotal(){
		if(getQuantidade() < 0){
			setQuantidade(0);
		}
		
		if(getPreco() < 0){
			setPreco(0.0);
		}

		return getQuantidade() * getPreco();
	} 
}
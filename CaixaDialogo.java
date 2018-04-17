/**
 * Usando 'JOptionPane' para exibir múltiplas linhas em uma caixa de diálogo.
 *
 * @author Matheus dos S. Menezes
 * @since 2018-02-21
 * Manaus - AM, Brazil
 */

// utiliza a classe JOptionPane do pacote javax.swing
import javax.swing.JOptionPane;

public class CaixaDialogo{
	
	public static void main(String[] args){

		// inserindo dados do usuario com 'showInputDialog'
		String nome = JOptionPane.showInputDialog("Insira seu nome:");

		// convertendo a string em um inteiro com 'Integer.parseInt'
		String s_idade = JOptionPane.showInputDialog("Insira sua idade:");
		int idade = Integer.parseInt(s_idade);

		// cria as mensagens que serao exibidas
		String mensagem = ("Bem vindo a linguagem de programacao Java, " + nome + "!");
		String mensagem_2 = ("Voce tem " + idade + " anos de idade!");

		// exibindo a mensagens com 'showMessageDialog'. Obs* null é posicao da caixa de dialogo
		JOptionPane.showMessageDialog(null, mensagem);
		JOptionPane.showMessageDialog(null, mensagem_2);
	}
}
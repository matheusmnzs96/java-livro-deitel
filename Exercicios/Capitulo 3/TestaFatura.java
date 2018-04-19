// Teste da classe Fatura

public class TestaFatura{

	public static void main(String[] args){

		Fatura fat = new Fatura("248679", "Teclado Razer", 3, 365.50);

		// exibindo a fatura do item
		System.out.printf("%.2f\n", fat.getFaturaTotal());
	}
}
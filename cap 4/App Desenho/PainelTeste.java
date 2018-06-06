// Classe que cria uma janela onde sera exibido o desenho
// Created by Matheus Menezes on 2018-06-05

import javax.swing.JFrame;

public class PainelTeste{
    
    public static void main(String[] args) {
		
		// Cria um objeto painel que contém o desenho da classe PainelDesenho
		PainelDesenho painel = new PainelDesenho();

		// Cria uma nova janela (frame) para armazenar o painel
		JFrame framePrincipal = new JFrame("Aplicativo Draw Panel"); // o frame contém título

		// Configura a janela para ser encerrado quando ele é fechado [X]
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		framePrincipal.add(painel); // adiciona o 'painel' ao frame
		framePrincipal.setSize(450, 450); // configura o tamanho do frame
		framePrincipal.setVisible(true); // torna o frame visível
    }
}
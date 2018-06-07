// Classe que realiza um desenho
// Created by Matheus Menezes on 2018-05-15

import java.awt.Graphics; // fornece metodos para desenhar textos e formas na tela
import javax.swing.JPanel; // fornece uma area (painel) para inserir desenhos, botoes, caixas de texto, etc...

public class PainelDesenho extends JPanel{

	// metodo desenha um 'X' a partir dos cantos do painel
	public void paintComponent(Graphics g){

		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);

		int largura = getWidth(); // largura total
		int altura = getHeight(); // altura total

        // drawline(x1, y1, x2, y2)

		// desenha uma linha a partir do canto superior esquerdo até o inferior direito
    	g.drawLine(0, 0, largura, altura);
          
        // desenha uma linha a partir do canto inferior esquerdo até o superior direito
        g.drawLine(0, altura, largura, 0);
	}
}
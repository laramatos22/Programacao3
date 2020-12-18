package JFrame;

import javax.swing.*;

public class HelloWorldSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("HelloWorldSwing");
		final JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); 	//pack() faz com que a janela seja ajustada 
						//para o tamanho preferido de todos dos seus
						//sub-components
		frame.setVisible(true);

	}

}

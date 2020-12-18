package Swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class Win2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Teste Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 100);
		JLabel label = new JLabel ("Hello World");
		label.setBackground(Color.CYAN);
		label.setOpaque(true);
		frame.getContentPane().add(label);
		
		
		frame.setVisible(true);

	}

}

package Swing.Paineis;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class Win3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Teste Swing");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 150);
		
		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.setLayout(new FlowLayout());
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		content.add(b1);
		content.add(b2);
		f.setContentPane(content);
		
		f.setVisible(true);

	}

}

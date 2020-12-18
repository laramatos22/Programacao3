package aula8.ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JToggleButton;

public class JogoDoGalo {
	
	public static void main(String[] args) {
		
		Game game = new Game(args[0]);
		
		JFrame f = new JFrame("Jogo do Galo!");
		
		f.setSize(300, 300);
		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.WHITE);
		
		panel.setLayout (new GridLayout(3, 3));
		
		JToggleButton b1 = new JToggleButton("");
		JToggleButton b2 = new JToggleButton("");
		JToggleButton b3 = new JToggleButton("");
		JToggleButton b4 = new JToggleButton("");
		JToggleButton b5 = new JToggleButton("");
		JToggleButton b6 = new JToggleButton("");
		JToggleButton b7 = new JToggleButton("");
		JToggleButton b8 = new JToggleButton("");
		JToggleButton b9 = new JToggleButton("");
		
		b1.setFont(new Font("Arial", Font.BOLD, 50));
		b2.setFont(new Font("Arial", Font.BOLD, 50));
		b3.setFont(new Font("Arial", Font.BOLD, 50));
		b4.setFont(new Font("Arial", Font.BOLD, 50));
		b5.setFont(new Font("Arial", Font.BOLD, 50));
		b6.setFont(new Font("Arial", Font.BOLD, 50));
		b7.setFont(new Font("Arial", Font.BOLD, 50));
		b8.setFont(new Font("Arial", Font.BOLD, 50));
		b9.setFont(new Font("Arial", Font.BOLD, 50));
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				game.play(b1, 0, 0);
				b1.setEnabled(false);
			}
		});
		
		b2.addActionListener(e -> {game.play(b2, 0, 1); b2.setEnabled(false);});
		b3.addActionListener(e -> {game.play(b3, 0, 2); b3.setEnabled(false);});
		b4.addActionListener(e -> {game.play(b4, 1, 0); b4.setEnabled(false);});
		b5.addActionListener(e -> {game.play(b5, 1, 1); b5.setEnabled(false);});
		b6.addActionListener(e -> {game.play(b6, 1, 2); b6.setEnabled(false);});
		b7.addActionListener(e -> {game.play(b7, 2, 0); b7.setEnabled(false);});
		b8.addActionListener(e -> {game.play(b8, 2, 1); b8.setEnabled(false);});
		b9.addActionListener(e -> {game.play(b9, 2, 2); b9.setEnabled(false);});
		
		f.add(panel);
		f.setVisible(true);
		
	}
	
	public static void PrintResult(String player, boolean win) {
		if(win) {
			JOptionPane.showMessageDialog(null, "Ganhou o jogador " + player + "!");
			System.exit(1);
		} else {
			JOptionPane.showMessageDialog(null, "Empate!");
			System.exit(1);
		}
	}

}

package JogoDoGalo;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Janela implements ActionListener {
	protected Jogo game;
	protected JPanel panel = new JPanel();
	protected JToggleButton[] btn = new JToggleButton[9];
	
	public Janela(Jogo game) {
		this.game = game;
	}
	
	public void makeWindow() {
		JFrame frame = new JFrame("Jogo do Galo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(210,210);
		Font myFont = new Font("SansSerif", Font.LAYOUT_LEFT_TO_RIGHT | Font.BOLD,40);
		panel.setLayout(new GridLayout(3,3));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JToggleButton();
			btn[i].addActionListener(this);
			btn[i].setFont(myFont);
			panel.add(btn[i]);
		}
		frame.setContentPane(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JToggleButton button = (JToggleButton) e.getSource();
		button.setEnabled(false);
		
		if(button==btn[0])
			game.makeMove(0,0);
		else if(button==btn[1])
			game.makeMove(0, 1);
		else if(button==btn[2])
			game.makeMove(0, 2);
		else if(button==btn[3])
			game.makeMove(1, 0);
		else if(button==btn[4])
			game.makeMove(1, 1);
		else if(button==btn[5])
			game.makeMove(1, 2);
		else if(button==btn[6])
			game.makeMove(2, 0);
		else if(button==btn[7])
			game.makeMove(2, 1);
		else if(button==btn[8])
			game.makeMove(2, 2);
		
		button.setText(game.lastPlayer());
		
		
		if(game.gameEnded().equals(game.Player1())) {
			JOptionPane.showMessageDialog(panel, "Resultado: venceu o jogador X");
			System.exit(0);
		}
		else if(game.gameEnded().equals(game.Player2())) {
			JOptionPane.showMessageDialog(panel, "Resultado: venceu o jogador O");
			System.exit(0);
		}
		else if(game.gameEnded().equals("Empate")) {
			JOptionPane.showMessageDialog(panel, "Resultado: empate");
			System.exit(0);
		}		
	}
	
}

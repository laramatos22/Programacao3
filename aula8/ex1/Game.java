package aula8.ex1;

/**Sugere-se a utilização da classe JToggleButton para implementar cada casa e o
JPanel com o layout GridLayout para dispor essa casa no tabuleiro do jogo.*/
import javax.swing.JToggleButton;

public class Game {
	
	private String symbol;
	private int count;
	private String[][] game;
	
	public Game(String symbol) {
		this.symbol = symbol;
		this.count = 0;
		game = new String[3][3];
	}
	
	public String getActualSymbol() {return symbol;}
	
	public void play(JToggleButton casa, int i, int j) {
		count++;
		
		if(symbol.equals("X")) {
			if(casa.getText() == "") {
				casa.setText(symbol);
				game[i][j] = "X";
			}
			
			boolean win = Win();
			
			if(win == true) {
				JogoDoGalo.PrintResult(symbol, true);
			} else if(count == 9) {
				JogoDoGalo.PrintResult(symbol, false);
			}
			
			symbol = "O";
				
		} else if(symbol.equals("O")) {
			if(casa.getText() == "") {
				casa.setText(symbol);
				game[i][j] = "O";
			}
			
			boolean win = Win();
			
			if(win == true) {
				JogoDoGalo.PrintResult(symbol, true);
			} else if(count == 9) {
				JogoDoGalo.PrintResult(symbol, false);
			}
			
			symbol = "O";
			
		}
	}
		
		private boolean Win() {
			boolean win = true;
			
			//check linhas
			for(int i=0; i<3; i++) {
				win = true;
				for(int j=0; j<3; j++) {
					if(game[i][j] != (symbol))
						win = false;
				}
				if(win) return true;
			}
			
			//check colunas
			for(int i=0; i<3; i++) {
				win = true;
				for(int j=0; j<3; j++) {
					if(game[j][i] != (symbol))
						win = false;
				}
				if(win) return true;
			}
			
			//check diagonal
			if(game[0][0] == (symbol) && game[1][1] == (symbol) && game[2][2] == (symbol)) return true;
			if(game[0][2] == (symbol) && game[1][1] == (symbol) && game[2][0] == (symbol)) return true;
			return false;
			
		}
	
		
		
}

package JogoDoGalo;

public class Jogo {
	
	private String Player1;
	private String Player2;
	private String[][] board;
	private int numJogadas;
	private String first;
	
	public Jogo(String first) {
		this.Player1 = "X";
		this.Player2 = "O";
		this.board = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = " ";
			}
		}
		this.first = first;
		numJogadas = 0;
	}
	
	public String Player1() { return Player1; }
	public String Player2() { return Player2; }
	@SuppressWarnings("unused")
	private String[][] board() { return board; }
	private int numJogadas() { return numJogadas; }
	@SuppressWarnings("unused")
	private String first() { return first; }
	
	public int makeMove(int l, int c) {
		if (first.equals(Player1)) {
			if (board[l][c].equals(" ")) {
				if(numJogadas % 2 == 0) {
					board[l][c] = Player1();
				}
				else {
					board[l][c] = Player2();
				} 
				numJogadas++;
			}
			return numJogadas;
		}
		else {
			if(board[l][c].equals(" ")) {
				if(numJogadas % 2 == 0) {
					board[l][c] = Player2();
				}
				else {
					board[l][c] = Player1();
				}
				numJogadas++;
			}
		}
		return numJogadas;
	}
	
	public String lastPlayer() {
		if(first.equals(Player1)) {
			if(numJogadas % 2 == 0) {
				return Player2();
			}
			else {
				return Player1();
			}
		}
		else {
			if(numJogadas % 2 == 0) {
				return Player1();
			}
			else {
				return Player2();
			}
		}
	}
	
	public boolean winner(String v) {
		
		if(board[0][0].equals(v) && board[0][1].equals(v) && board[0][2].equals(v))
			return true;
		else if(board[1][0].equals(v) && board[1][1].equals(v) && board[1][2].equals(v))
			return true;
		else if(board[2][0].equals(v) && board[2][1].equals(v) && board[2][2].equals(v))
			return true;
		else if(board[0][0].equals(v) && board[1][0].equals(v) && board[2][0].equals(v))
			return true;
		else if(board[0][1].equals(v) && board[1][1].equals(v) && board[2][1].equals(v))
			return true;
		else if(board[0][2].equals(v) && board[1][2].equals(v) && board[2][2].equals(v))
			return true;
		else if(board[0][2].equals(v) && board[1][1].equals(v) && board[2][0].equals(v))
			return true;
		else if(board[0][0].equals(v) && board[1][1].equals(v) && board[2][2].equals(v))
			return true;
		else
			return false;
	}
	
	public String gameEnded() {
		if(winner(Player1)) {
			return Player1;
		}
		else if (winner(Player2)) {
			return Player2;
		}
		else if(numJogadas() == 9) {
			return "Empate";
		}
		else {
			return " ";
		}
	}
}

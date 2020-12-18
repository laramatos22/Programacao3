package JogoDoGalo;

public class JogoDoGalo {
	
	public static void main(String[] args) {
		String f = "";
		if(args.length == 0) {
			f = "X";
		}
		else {
			if(args[0].equals("Player1")) {
				f = "O";
			}
			else if (args[0].equals("Player2")) {
				f = "X";
			}
		}
		
		Jogo game = new Jogo(f);
		Janela window = new Janela(game);
		window.makeWindow();
	}
}

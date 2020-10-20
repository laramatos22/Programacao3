package aula2;

import static java.lang.System.*;

public class Prob22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			for(int i=0; i<args.length; i++) {
				System.out.printf("Ficheiro: ", args[i]);
				soupOfLetters game = new soupOfLetters(args[i]);
				game.jogar();
				game.fim();
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("Não foram introduzidos argumentos");
		}
		
	}

}

package tp10.ExemploDecorador;

public class TesteJogador {
	
	public static void main(String[] args) {
		JogadorInterface j1 = new Jogador("Rui");
		Futebolista f1 = new Futebolista(new Jogador("Luis"));
		Xadrezista x1 = new Xadrezista(new Jogador("Ana"));
		Xadrezista x2 = new Xadrezista(j1);
		Xadrezista x3 = new Xadrezista(f1);
		Tenista t1 = new Tenista(j1);
		Tenista t2 =
				new Tenista(
						new Xadrezista(
								new Futebolista(
										new Jogador("Bruna"))));
		JogadorInterface lista[] = {j1, f1, x1, x2, x3, t1, t2};
		for(JogadorInterface ji : lista)
			ji.joga();
	}

}

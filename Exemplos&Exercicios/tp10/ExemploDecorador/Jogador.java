package tp10.ExemploDecorador;

public class Jogador implements JogadorInterface {
	
	private String name;
	Jogador(String n) {name = n;}
	
	@Override public void joga() {
		System.out.print("\n"+name+" joga ");
	}

}

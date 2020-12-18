package tp10.ExemploDecorador;

public class Xadrezista extends JogDecorator {
	Xadrezista(JogadorInterface j) {super(j);}
	@Override public void joga() {j.joga();
		System.out.print("xadrez ");
	}

}

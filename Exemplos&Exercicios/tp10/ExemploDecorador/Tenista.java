package tp10.ExemploDecorador;

public class Tenista extends JogDecorator {
	Tenista(JogadorInterface j) {super(j);}
	@Override public void joga() {
		j.joga();
		System.out.print("tenis ");
	}
	public void serve() {System.out.println("-- Serve!");}

}

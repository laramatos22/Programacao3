package tp10.ExemploDecorador;

public class Futebolista extends JogDecorator {
	Futebolista(JogadorInterface j) {super(j);}
	@Override public void joga() {
		j.joga();
		System.out.print("futebol ");
	}
	public void remata() {System.out.println("-- Remata!");}

}

package tp10.ExemploDecorador;

public abstract class JogDecorator implements JogadorInterface {
	
	protected JogadorInterface j;
	JogDecorator(JogadorInterface j) {this.j = j;}
	public void joga() {j.joga();}

}

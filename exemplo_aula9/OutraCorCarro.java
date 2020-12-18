package exemplo_aula9;

public class OutraCorCarro extends DecoratorCarro {
	
	private String cor;
	
	public OutraCorCarro(Carro c, String cor) {
		super(c);
		this.cor = cor;
	}
	
	public void tipo(String s) {
		c.tipo(s);
		System.out.print(" " + cor);
	}

}

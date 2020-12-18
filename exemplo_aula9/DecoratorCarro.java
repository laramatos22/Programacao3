package exemplo_aula9;

public class DecoratorCarro implements Carro {
	
	protected Carro c;
	
	public DecoratorCarro(Carro c) {
		this.c = c;
	}
	public void tipo(String s) {
		c.tipo(s);
	}

}

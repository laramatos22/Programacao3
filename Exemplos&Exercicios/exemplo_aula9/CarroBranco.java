package exemplo_aula9;

public class CarroBranco extends DecoratorCarro { 
	
	public CarroBranco(Carro c) {
		super(c);
	}
	
	public void tipo(String s) {
		c.tipo(s);
		System.out.println("Branco");
	}

}

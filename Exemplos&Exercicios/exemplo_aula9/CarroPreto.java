package exemplo_aula9;

public class CarroPreto extends DecoratorCarro {
	
	public CarroPreto(Carro c) {
		super(c);
	}
	
	public void tipo(String s) {
		c.tipo(s);
		System.out.println("Preto");
	}

}

package exemplo_aula9;

public class CarroSimples implements Carro {
	
	private String marca;
	
	public CarroSimples (String marca) {
		this.marca = marca;
	}
	
	public void tipo(String s) {
		System.out.print("\nCarro " + marca + " do tipo " + s);
	}

}

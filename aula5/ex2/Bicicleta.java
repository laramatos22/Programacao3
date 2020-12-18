package aula5.ex2;

public class Bicicleta extends Veiculo {
	
	private String marca;

	public Bicicleta (int numRodas, String cor, int ano, String marca) {
		super(numRodas, cor, ano);
		this.marca = marca;
	}
	
	public String marca() {return marca;}
	
	public String toString() {
		return "Bicicleta: \n" + super.toString() + " | Marca " + this.marca;
	}
	
}

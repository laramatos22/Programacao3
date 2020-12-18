package aula5.ex2;

public class BicicletaPolicia extends Bicicleta implements Policia {

	public BicicletaPolicia (int numRodas, String cor, int ano, String marca) {
		super(numRodas, cor, ano, marca);
	}
	
	public Emergencia getTipo() {
		return Emergencia.PSP;
	}
	
	public String toString() {
		return "Bicicleta de Policia: " + super.toString();
	}
	
	public int getID() {
		return "Bicicleta Policia " + super.getID();
	}
	
}

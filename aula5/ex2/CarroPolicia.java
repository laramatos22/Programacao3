package aula5.ex2;

public class CarroPolicia extends Automovel implements Policia {

	public CarroPolicia(int numR, String cor, int ano, int vlM, int cilindrada, String matricula, int lotacao) {
		super(numR, cor, ano, vlM, cilindrada, matricula, lotacao);
	}

	@Override
	public Emergencia getTipo() {
		return Emergencia.PJ;
	}

	@Override
	public int getID() {
		return "Carro Policia " + super.getID();
	}

	@Override
	public String toString() {
		return "Carro de Polica: " + super.toString();
	}
	
}

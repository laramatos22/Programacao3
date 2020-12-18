package aula5.ex2;

public class MotoPolicia extends Moto implements Policia  {

	public MotoPolicia(int numRodas, String cor, int ano, int velocidadeMaxima, int cilindrada, String matricula, boolean sidecar) {
		super(numRodas, cor, ano, velocidadeMaxima, cilindrada, matricula, sidecar);
	}
	
	public Emergencia getTipo() {
		return Emergencia.PSP;
	}
	
	public int getID() {
		return "Moto Policia " + super.getID();
	}
	
	public String toString() {
		return "Moto Policia: " + super.toString();
	}
	
}

package aula5.ex2;

public class Moto extends Motorizado {
	
	private boolean sidecar;
	
	public Moto(int numRodas, String cor, int ano, int velocidadeMaxima, int cilindrada, String matricula, boolean sidecar) {
		super(numRodas, cor, ano, velocidadeMaxima, cilindrada, matricula);
		this.sidecar = sidecar;
	}
	
	public boolean sidecar() {return sidecar;}
	
}

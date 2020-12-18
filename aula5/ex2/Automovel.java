package aula5.ex2;

public class Automovel extends Motorizado {
	
	private int lotacao;
	
	public Automovel(int numRodas, String cor, int ano, int velocidadeMaxima, int cilindrada, String matricula, int lotacao) {
		super(numRodas, cor, ano, velocidadeMaxima, cilindrada, matricula);
		this.lotacao = lotacao;
	}
	
	public int lotacao() {return lotacao;}

}

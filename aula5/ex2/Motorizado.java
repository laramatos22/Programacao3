package aula5.ex2;

public class Motorizado extends Veiculo {
	
	private int cilindrada;
	private int velocidadeMaxima;
	private String matricula;
	
	public Motorizado (int numRodas, String cor, int ano, int velocidadeMaxima, int cilindrada, String matricula) {
		super(numRodas, cor, ano);
		this.velocidadeMaxima = velocidadeMaxima;
		this.cilindrada = cilindrada;
		this.matricula = matricula;
	}
	
	public int cilindrada() {return cilindrada;}
	public int velocidadeMaxima() {return velocidadeMaxima;}
	public String matricula() {return matricula;}
	
	public String toString() {
		return "Motorizado: \n" + super.toString() 
				+ " | Cilindrada: " + cilindrada
				+ " | Velocidade Máxima: " + velocidadeMaxima
				+ " | Matrícula: " + matricula;
	}

}

package aula5.ex2;

public abstract class Veiculo implements Comparable<Veiculo>{
	static int ID = 1;
	private int id;
	private int ano;
	private int numRodas;
	private String cor;
	
	public Veiculo(int numRodas, String cor, int ano) {
		this.numRodas = numRodas;
		this.cor = cor;
		this.ano=ano;
		this.id = ID++;
	}
	
	public int numRodas() {return numRodas;}
	public String cor() {return cor;}
	public int getID() {return id;}
	public int ano() {return ano;}
	
	public int compareTo(Veiculo veiculo) {
		return this.ano - veiculo.ano;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d, Ano: %d, Número de Rodas: %d, Cor: %s ", this.id, this.ano, this.numRodas, this.cor);
	}
}

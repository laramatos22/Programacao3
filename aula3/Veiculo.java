package aula3;

public class Veiculo {
	
	private int cilindrada;
	private int potencia;
	private int lotacao;
	private double pesoBruto;
	private int passageiros;
	
	public Veiculo(int cilindrada, int potencia, int lotacao, double pesoBruto) {
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.lotacao = lotacao;
		this.pesoBruto = pesoBruto;
		this.passageiros = 0; //no início o veículo está sem passageiros	
	}
	
	public int cilindrada() {return cilindrada;}
	public int potencia() {return potencia;}
	public int lotacao() {return lotacao;}
	public double pesoBruto() {return pesoBruto;}
	public int passageiros() {return passageiros;}
	
	//Adicionar passageiro ao veículo
	public void addPassageiro() {
		if(lotacao > passageiros) {
			this.passageiros++;
			System.out.println("Passageiro adicionado com sucesso!");
			System.out.printf("Possui %d passageiros no veículo", this.passageiros);
		} else {
			System.out.println("Impossível adicionar passageiro. Limite máximo atingido");
		}
	}
	
	//Remover passageiro
	public void removePassageiro() {
		if(passageiros > 0) {
			this.passageiros--;
			System.out.println("Passageiro removido com sucesso!");
			System.out.printf("Possui %d passageiros no veículo", this.passageiros);
		} else {
			System.out.println("Não contém passageiros no veículo!");
		}
	}


}

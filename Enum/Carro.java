package Enum;

public class Carro {
	
	private String marca;
	private Enum cor;
	
	public Carro(String marca, Enum cor) {
		this.marca = marca;
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Enum getCor() {
		return cor;
	}

	public void setCor(Enum cor) {
		this.cor = cor;
	}
	
	

}

package aula1;

public class Retangulo {
	
	private double comprimento, largura, area, perimetro;
	private Ponto centro;
	
	public Retangulo (double x, double y, double l, double c) {
		centro = new Ponto (x, y);
		this.comprimento = c;
		this.largura = l;
		area = this.comprimento * this.largura;
		perimetro = 2*this.comprimento + 2*this.largura;
	}
	
	public Retangulo (Ponto p, double l, double c) {
		this.centro = p;
		this.comprimento = c;
		this.largura = l;
		area = this.comprimento * this.largura;
		perimetro = 2*this.comprimento + 2*this.largura;
	}
	
	public double comprimento() {return comprimento;}
	public double largura() {return largura;}
	public double area() {return area;}
	public double perimetro() {return perimetro;}
	public Ponto centro() {return centro;}
	
	public String toString() {
		return "Tipo: Retangulo \nComprimento: " + comprimento + "\nLargura: " + largura  + "\nCentro: " + centro 
				+ "\nÁrea: " + area + "\nPerímetro: " + perimetro;
	}

}

package aula1;

public class Quadrado {
	
	private double lado, area, perimetro;
	private Ponto centro;
	
	public Quadrado (double x, double y, double l) {
		centro = new Ponto (x, y);
		this.lado = l;
		area = this.lado * this.lado;
		perimetro = 4*this.lado;
	}
	
	public Quadrado (Ponto p, double l) {
		this.centro = p;
		this.lado = l;
		area = this.lado * this.lado;
		perimetro = 4*this.lado;
	}
	
	public double lado() {return lado;}
	public double area() {return area;}
	public double perimetro() {return perimetro;}
	public Ponto centro() {return centro;}
	
	public String toString() {
		return "Tipo: Quadrado \nComprimento: " + lado + "\nCentro: " + centro + "\nÁrea: " + area + "\nPerímetro: " + perimetro;
	}

}

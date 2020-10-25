package aula3;

public class Ponto {
	
	private double x, y;
	
	public Ponto (double x, double y) {
		this.x = x;
		this.y =y;
	}
	
	public double x() {return this.x;}
	public double y() {return this.y;}
	
	public double distancia(Ponto c) {
		return Math.sqrt(Math.pow(this.x - c.x(), 2) + Math.pow(this.y - c.y(), 2));
	}
	
	public String toString() {
		return String.format("X: %f | Y: %f", this.x, this.y);
	}

}

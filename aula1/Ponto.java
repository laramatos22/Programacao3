package aula1;

public class Ponto {
	
	private double x, y;
	
	public Ponto (double x, double y) {
		this.x = x;
		this.y =y;
	}
	
	public double x() {return this.x;}
	public double y() {return this.y;}
	
	public String toString() {
		return String.format("X: %f | Y: %f", this.x, this.y);
	}

}

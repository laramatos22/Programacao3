package aula3;

public class Quadrado extends Figura {
	
	public Quadrado(double lado) {
		super(lado, lado);
	}
	
	public Quadrado(double lado, Ponto ponto) {
		super(lado, lado, ponto);
	}
	
	public Quadrado(double x, double y, double lado) {
		super(lado, lado, new Ponto(x,y));
	}
	
	public Quadrado(Quadrado q) {
		super(q.x(), q.y(), q.centro());
	}
	
	public String toString() {
		return ("Centro: " + super.centro + "\nLado: " + super.x() 
				+ "\nArea: " + super.area() + "\nPerimento: " + super.perimetro());
	} 
	
}

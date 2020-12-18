package aula10.ex1;

public abstract class Figura {

	private Ponto centro;
	
	public Figura(Ponto c){
		centro = c;
	}
	
	public Ponto centro() { return centro; }
	public abstract double area();
	public abstract double perimetro();

	public int compareTo(Figura figura){
		return (int)(this.area()-figura.area());
	}
	
	
}

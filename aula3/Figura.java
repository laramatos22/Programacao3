package aula3;

public class Figura {
	
	public double x;		//coordenada x
	public double y;		//coordenada y
	public Ponto centro;	//centro da figura
	
	//Quando o centro da figura é a origem do referencial cartesiano
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
		this.centro = new Ponto(0,0); 
	}
	
	//Quando o centro da figura não é a origem do referencial
	public Figura(double x, double y, Ponto centro) {
		this.x = x;
		this.y = y;
		this.centro = centro;
	}
	
	public double x() {return x;}
	public double y() {return y;}
	public Ponto centro() {return centro;}
	
	//calculo área da figura
	public double area() {
		return x*y;
	}
	
	//calculo perímetro da figura
	public double perimetro() {
		return ((x*2) + (y*2));
	}
	
	//função booleana para saber se as figuras são iguais
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		Figura fig = (Figura) obj;
		
		if(centro == null) {
			if(fig.centro != null) {
				return false;
			}
		} else if(!(centro.equals(fig.centro))) {
			return false;
		}
		
		if(x != fig.x || y != fig.y) return false;
		
		return true;
	}
	
	public String toString() {
		return ("Lado x: " + this.x + "\nLado y: " + this.y 
				+ "\nCentro: " + this.centro + "\nArea: " + this.area()
				+ "\nPerimetro: " + this.perimetro());
	}

}

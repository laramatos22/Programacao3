package aula12.ex1;

public class Circulo extends Figura {
	
private double raio;
	
	public Circulo(double x, double y, double r) {
		super(new Ponto(x,y));
		raio=r;
	}
	public Circulo(Ponto p , double r) {
		super(p);
		raio=r;
	}
	public Circulo (Circulo c) {
		this(c.centro(),c.raio());
	}
	
	public Circulo (double r) {
		super(new Ponto());
		raio=r;
		
	}
	public double raio() {return raio;}
	
	public double perimetro() {					//calculo do perimetro
		return 2 * Math.PI * raio();     
	}
	
	public double area() {						//calculo da area
		return Math.PI * Math.pow(raio(), 2); 
	}
	
	//Dados todos numa String
	public String toString() {
		return "Circulo de " +  "raio: " + raio + " e de centro: " + super.centro(); 
	}
	
	//verificar se 2 circulos sao iguais
	public boolean equals(Circulo c) {
		if(c.raio() == raio && c.centro() == centro() && c.area()==area() && c.perimetro()==perimetro()) {
			return true;
		}else {
			return false;
		}
	}
	
	//verificar se 2 circulos se intercetam
	public boolean circulosintercetam (Circulo c) {
		//Se a distancia entre os centros dos circulos for menos ou igual a soma dos dois raios, 
		//entao e porque se intercetaom
		double soma= raio + c.raio();
		if(super.centro().distTo(c.centro()) <= soma) {
			return true;
		}else {
			return false;
		}

	}

}

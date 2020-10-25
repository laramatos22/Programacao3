package aula3;

public class Circulo extends Figura {

	public Circulo (Ponto centro, double raio) {
		super(raio, 0, centro);
	}
	
	public Circulo (double raio) {
		super(raio, 0, new Ponto(0,0));
	}
	
	public Circulo (double x, double y, double raio) {
		super(raio, 0, new Ponto(x, y));
	}
	
	public Circulo (Circulo c) {
		super(c.x(), 0, c.centro());
	}
	
	//CÁLCULO DA ÁREA DO CÍRCULO
	public double area() {
		return 3.14*this.x*this.y;
	}
	
	//CÁLCULO DO PERÍMETRO DO CÍRCULO
	public double perimetro() {
		return 2*3.14*this.x;
	}
	
	//VERIFICAR SE DOIS CÍRCULOS SE INTERCETAM
	public boolean intersecaoCirculos(Circulo c2) {
		double distancia = Math.sqrt(Math.pow((this.centro.x() - c2.centro.x()), 2) + Math.pow((this.centro.y() - c2.centro.y()), 2));
		if (this.x + c2.x > distancia) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Tipo: Círculo \nCentro: " + centro  + "\nÁrea: " + area() + "\nPerimetro: " + perimetro();
	}

}


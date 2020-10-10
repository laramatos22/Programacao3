package aula1;

public class Circulo {
	
	private double raio;
	private double area, perimetro;
	private Ponto centro;
	
	public Circulo (Ponto c, double r) {
		this.centro = c;
		this.raio = r;
		area = Math.PI*this.raio*this.raio;
		perimetro = Math.PI*this.raio;
	}
	
	public Circulo (double x, double y, double r) {
		Ponto p = new Ponto (x, y);
		this.centro = p;
		this.raio = r;
		area = Math.PI*this.raio*this.raio;
		perimetro = Math.PI*this.raio;
	}
	
	public double raio() {return this.raio;}
	public Ponto centro() {return this.centro;}
	
	//CÁLCULO DA ÁREA DO CÍRCULO
	public double area() {
		return area;
	}
	
	//CÁLCULO DO PERÍMETRO DO CÍRCULO
	public double perimetro() {
		return perimetro;
	}
	
	//VERIICAR SE DOIS CÍRCULOS SÃO IGUAIS
	public boolean equalCircles (Circulo c2) {
		if (this.raio == c2.raio) {return true;}
		else {return false;}
	}
	
	//VERIFICAR SE DOIS CÍRCULOS SE INTERCETAM
	public boolean intersecaoCirculos(Circulo c2) {
		double distancia = Math.sqrt(Math.pow((this.centro.x() - c2.centro.x()), 2) + Math.pow((this.centro.y() - c2.centro.y()), 2));
		if (this.raio + c2.raio > distancia) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Tipo: Círculo \nCentro: " + centro + "\nRaio: " + raio + "\nÁrea: " + area + "\nPerimetro: " + perimetro;
	}

}

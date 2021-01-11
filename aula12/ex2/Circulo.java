package aula12.ex2;

public class Circulo extends Figura {
	
	private int raio; //raio do circulo
	
	//------------vários construtores possíveis----------//
	
	public Circulo(int raio, Ponto centro) {
		super(centro);
		this.raio = raio;
	}
	
	public Circulo(int raio, int x, int y) {
		this(raio, new Ponto(x, y));
	}
	
	public Circulo(int raio) {
		this(raio, new Ponto(0, 0));
	}
	
	public Circulo() {
		this(1, 0, 0);
	}
	
	public Circulo(Circulo c) {
		this(c.raio, c.getCentro());
	}
	
	//---------------------------------------------------//

	//area do circulo
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	//perimetro do circulo
	public double perimetro() {
		return 2 * Math.PI * raio;
	}
	
	public String toString() {
		return "Circulo de raio: " + raio + " e centro em: " + this.getCentro();
	}
	
	//---------------------------------------------------//
	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + raio;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (!super.equals(obj))	return false;
		if (getClass() != obj.getClass())	return false;
		Circulo other = (Circulo) obj;
		if (raio != other.raio)	return false;
		return true;
	}
	
}

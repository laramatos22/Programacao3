package aula11.ex1.alineaA;

public class Circulo extends Figura {
	
private double raio;
	
	//Construtores
	public Circulo(Ponto centro, double raio)
	{
		super(centro);
		this.raio = raio;
	}
	public Circulo(double raio)
	{
		super(0,0);
		this.raio = raio;
	}
	public Circulo(double x, double y, double raio)
	{
		super(x, y);
		this.raio = raio;
	}
	public Circulo(Circulo c)
	{
		super(c.centro);
		this.raio = c.raio;
	}
	
	public double raio() { return raio; }
	
	//Fun��o da �rea
	public double area()
	{
		return Math.PI * Math.pow(raio, 2);
	}
	//Fun��o do Per�metro
	public double perimetro()
	{
		return 2 * Math.PI * raio;
	}
	//Fun��o que devolve as caracter�sticas numa String
	@Override public String toString()
	{
		return "C�rculo| Centro: " + centro().toString() + " | Raio: " + raio() + " | �rea: " + area() + " | Per�metro: " + perimetro();
	}
	//Fun��o que verifica se dois c�rculos s�o iguais (s�o iguais se o seu raio for igual)
	public boolean equals(Circulo c)
	{
		return c.raio == raio;
	}
	//Fun��o para verificar se dois c�rculos se intersetam (se a dist�ncia entre os seus centros for menor que a soma dos seus raios)
	public boolean intersectCircle(Circulo c)
	{
		return c.raio + raio > centro.distPoint(c.centro().x(), c.centro().y());
	}

}

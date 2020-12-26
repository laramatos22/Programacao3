package aula11.ex1.alineaA;

public class Quadrado extends Rectangulo{
	
private double l;
	
	//Construtores
	public Quadrado(double l)
	{
		super(0, 0);
		this.l = l;
	}
	public Quadrado(double x, double y, double l)
	{
		super(x, y);
		this.l = l;
	}
	
	public double l() { return l; }
	
	//Fun��o para a �rea
	public double area()
	{
		return l*l;
	}
	//Fun��o para o Per�metro
	public double perimetro()
	{
		return l*4;
	}
	//Fun��o que devolve os dados numa String
	@Override public String toString()
	{
		return "Quadrado| Centro: " + centro().toString() + " | Comprimento: " + l() + " | �rea: " + area() + " | Per�metro: " + perimetro();
	}
	//Fun��o que verifica se dois quadrados s�o iguais
	public boolean equals(Quadrado q)
	{
		return q.l == l && (q.centro == centro);
	}

}

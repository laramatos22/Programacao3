package aula11.ex1.alineaA;

public class Ponto {
	
	private double x;
	private double y;
	
	//Construtores
	public Ponto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double x() { return x; }
	public double y() { return y; }
	
	//Fun��o para calcular a dist�ncia entre dois pontos
	public double distPoint(double x1, double y1)
	{
		return Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
	}
	//Fun��o que devolve o ponto numa String
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	//Fun��o que verifica se dois pontos s�o iguais
	public boolean equals(Ponto p)
	{
		return (x==p.x && y==p.y);
	}

}

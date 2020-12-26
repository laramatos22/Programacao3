package aula11.ex1.alineaA;

public class Rectangulo extends Figura {
	
	private double largura;
	private double comprimento;
	
	//Construtores
	public Rectangulo(double largura, double comprimento)
	{
		super(0,0);
		this.largura = largura;
		this.comprimento = comprimento;
	}
	public Rectangulo(double x, double y, double largura, double comprimento)
	{
		super(x,y);
		this.largura = largura;
		this.comprimento = comprimento;
	}
	public Rectangulo(Ponto p, double largura, double comprimento)
	{
		super(p);
		this.largura = largura;
		this.comprimento = comprimento;
	}
	public Rectangulo(Rectangulo r)
	{
		super(r.centro);
		this.largura = r.largura;
		this.comprimento = r.comprimento;
	}
	
	public double largura() { return largura; }
	public double comprimento() { return comprimento; }
	
	//Fun��o para a �rea
	public double area()
	{
		return largura*comprimento;
	}
	//Fun��o para o per�metro
	public double perimetro()
	{
		return (largura*2) + (comprimento*2);
	}
	//Fun��o que devolve as caracter�sticas numa String
	@Override public String toString()
	{
		return "Centro: " + centro().toString() + " | Comprimento: " + comprimento() + " | Largura " + largura() + " | �rea: " + area() + " | Per�metro: " + perimetro();
	}
	//Fun��o para verificar se dois retangulos s�o iguais
	public boolean equals(Rectangulo r)
	{
		return (r.largura == largura && r.comprimento == comprimento && r.centro == centro);
	}

}

package aula12.ex2;

public class Retangulo extends Figura {
	
	private double comprimento;		//comprimento do retangulo
	private double largura;			//largura do retangulo
	
	//----------------vários construtores----------------//
	public Retangulo(double comp, double larg, Ponto c) {
		super(c);
		comprimento = comp;
		largura = larg;
	}
	
	public Retangulo(double comp, double larg, int x, int y) {
		this(comp, larg, new Ponto(x, y));
	}
	
	public Retangulo(double comp, double larg) {
		this(comp, larg, new Ponto(0, 0));
	}
	
	public Retangulo(Retangulo r) {
		this(r.comprimento, r.largura, r.getCentro());
	}
	//---------------------------------------------------//
	
	public double getComprimento() {return comprimento;}
	public double getLargura() {return largura;}
	
	public String toString() {
		return "Retangulo:\n Comprimento: " + comprimento 
							+ " Largura: " + largura
							+ " Centro: " + this.getCentro();
	}
	
	//area do retangulo
	public double area() {
		return comprimento * largura;
	}
	
	//perimetro do retangulo
	public double perimetro() {
		return 2 * comprimento + 2 * largura;
	}
	
	//---------------------------------------------------//
	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(comprimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(largura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (!super.equals(obj))	return false;
		if (getClass() != obj.getClass())	return false;
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura))
			return false;
		return true;
	}

}

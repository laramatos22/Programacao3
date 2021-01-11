package aula12.ex2;

public abstract class Figura {
	
	private Ponto centro;	//centro da figura
	
	//construtor
	public Figura(Ponto c) {
		centro = c;
	}
	
	public Ponto getCentro() {return centro;}
	
	public abstract double area();		//area da figura
	public abstract double perimetro(); //perimetro da figura
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		return result;
	}

	public boolean equals(Object obj)
	{
		if (this == obj)	return true;
		if (obj == null)	return false;
		if (getClass() != obj.getClass())	return false;
		Figura other = (Figura) obj;
		if (centro == null)
		{
			if (other.centro != null)	return false;
		} else if (!centro.equals(other.centro))	return false;
		return true;
	}
	
	//função compareTo para comparar figuras
	public int compareTo(Figura f) {
		int n=0;
		if(this.area() > f.area())	n = 1;
		else if(this.area() < f.area())	n = -1;
		return n;
	}

}

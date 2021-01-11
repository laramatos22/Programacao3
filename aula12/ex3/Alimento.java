package aula12.ex3;

public abstract class Alimento implements Comparable<Alimento> {
	
	private double proteina;
	private double calorias;
	private double peso;
	
	//Construtor
	public Alimento(double p, double c, double ps) {
		proteina = p;
		calorias = c;
		peso = ps;
	}

	//Getters
	public double getProteina() {return proteina;}
	public double getCalorias() {return calorias;}
	public double getPeso() {return peso;}
	
	//Comparar calorias entre 2 alimentos
	@Override
	public int compareTo(Alimento alimento){
		return (int)(calorias-alimento.calorias);
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(proteina);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (obj == null)	return false;
		if (getClass() != obj.getClass())	return false;
		Alimento other = (Alimento) obj;
		if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (Double.doubleToLongBits(proteina) != Double.doubleToLongBits(other.proteina))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "Alimento: \nProteinas " + proteina + ", Calorias " + calorias + ", Peso " + peso;
	}

}

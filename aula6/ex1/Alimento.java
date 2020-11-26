package aula6.ex1;

public abstract class Alimento  implements Comparable<Alimento> {

	private double proteinas;
	private double calorias;
	private double peso;
	
	public Alimento(double proteinas, double calorias, double peso) {
		this.proteinas = proteinas;
		this.calorias = calorias;
		this.peso = peso;
	}
	
	public double proteinas() {return proteinas;}
	public double calorias() {return calorias;}
	public double peso() {return peso;}
	
	public int compareTo(Alimento alimento) {
		return (int)(calorias - alimento.calorias);
	}
	
	//Implemente os métodos hashCode(), equals(), toString() em todas as classes
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		
		temp = Double.doubleToLongBits(calorias);
		result = prime * result + (int)(temp ^ (temp >>> 32));
				
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int)(temp ^ (temp >>> 32));
				
		temp = Double.doubleToLongBits(proteinas);
		result = prime * result + (int)(temp ^ (temp >>> 32));
		
		return result;
		
	}
	
	public boolean equals (Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Alimento alimento = (Alimento) obj;
		if(this.calorias != alimento.calorias)
			return false;
		if(this.proteinas != alimento.proteinas)
			return false;
		if(this.peso != alimento.peso)
			return false;
		return true;
	}
	
	public String toString() {
		return ("Alimento:\nProteinas: " + this.proteinas
						+"\nCalorias: " + this.calorias
						+"\nPeso: " + this.peso);
	}
	
}

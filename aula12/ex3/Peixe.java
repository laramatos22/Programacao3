package aula12.ex3;

public class Peixe extends Alimento {
	
	private tipoPeixe tipo;
	
	public Peixe(tipoPeixe t, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		tipo = t;
	}
	
	public tipoPeixe getTipo() {return tipo;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peixe other = (Peixe) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Peixe " + tipo;
	}

}

//CLASSE ENUM
enum tipoPeixe {
	congelado, fresco;
}

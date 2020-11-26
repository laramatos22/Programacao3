package aula6.ex1;

/**Cereal, tem nome (String), proteínas (double), calorias (double), peso (double).
É um alimento vegetariano.*/

public class Peixe extends Alimento {
	private TipoPeixe peixe;
	
	public Peixe(TipoPeixe peixe, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		// TODO Auto-generated constructor stub
		this.peixe=peixe;
	}
	
	public TipoPeixe getFish() {
		return this.peixe;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((peixe == null) ? 0 : peixe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peixe other = (Peixe) obj;
		if (peixe != other.peixe)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Peixe --> Variedade %s", peixe);
	}
	
}

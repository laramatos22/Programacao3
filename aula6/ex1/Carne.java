package aula6.ex1;

/**Carne, tem variedade (vaca, porco, peru, frango, outra), proteínas (double),
calorias (double), peso (double).*/

public class Carne extends Alimento {
	private variedadeCarne carne;
	
	public Carne(variedadeCarne carne, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		this.carne = carne;
		// TODO Auto-generated constructor stub
	}
	
	public variedadeCarne getCarneType() {
		return this.carne;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((carne == null) ? 0 : carne.hashCode());
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
		Carne other = (Carne) obj;
		if (this.carne != other.carne)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Carne --> Variedade %s", carne);
	}
}

package aula6.ex1;

/**PratoDieta, tem um nome (String) e composição (conjunto de alimentos) e
limite máximo de calorias (double).*/

public class PratoDieta extends Prato {
	private double limcalorias;
	
	public PratoDieta(String nome, double limcalorias) {
		super(nome);
		this.limcalorias=limcalorias;
	}
	
	@Override
	public boolean addIngrediente(Alimento a) {
		if(this.limcalorias >= super.getCalTotal() + a.calorias()) {
			super.addCalorias(a.calorias());
			return alimentos.add(a);

		}
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(super.getCalTotal());
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		PratoDieta other = (PratoDieta) obj;
		if (limcalorias != other.limcalorias)
			return false;
		return true;
	}
	
	@Override
	public boolean removeIngrediente(Alimento a) {
		this.limcalorias = this.limcalorias - a.calorias();
		return alimentos.remove(a);
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" PRATO DIETA, Total de calorias %3.2f o limite de cal. é %3.2f", this.getCalTotal(), this.limcalorias);
	}
}

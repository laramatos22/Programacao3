package aula12.ex3;

//Classe para carne

public class Carne extends Alimento {
	
	private variedadeCarne variedade;
	
	//Construtor
	public Carne(variedadeCarne v, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		variedade = v;
	}
	
	//Getter
	public variedadeCarne getVariedadeCarne() {return variedade;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((variedade == null) ? 0 : variedade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (!super.equals(obj))	return false;
		if (getClass() != obj.getClass())	return false;
		Carne other = (Carne) obj;
		if (variedade != other.variedade)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carne "+variedade+", "+super.toString();
	}

}

//CLASSE ENUM
enum variedadeCarne {
	vaca, frango, porco, peru, outra;
}

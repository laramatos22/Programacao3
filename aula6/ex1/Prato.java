package aula6.ex1;

import java.util.LinkedList;

/**Prato, tem um nome (String) e composição (conjunto de alimentos)*/

public class Prato {
	private String nome;
	LinkedList<Alimento> alimentos;
	private double totalCalorias;
	public Prato(String nome) {
		this.nome=nome;
		this.totalCalorias  = 0;
		alimentos = new LinkedList<>();
		
	}
	
	public double getCalTotal() {
		return totalCalorias;
	}
	
	public void addCalorias(Double calorias) {
		this.totalCalorias += calorias;
	}
	
	public String getNome() {
		return this.nome;
	}

	public boolean addIngrediente(Alimento a) {
		this.totalCalorias += a.calorias();
		return alimentos.add(a);	
	}

	public boolean removeIngrediente(Alimento a) {
		this.totalCalorias -= a.calorias();
		return alimentos.remove(a);
	}
	
	@Override
	public String toString() {
		String s = String.format("	-> Prato --> Nome: %s; Ingredientes: \n",this.nome);
		for(Alimento a: alimentos) {
			s += "		--> " + a + " \n";
		}
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prato other = (Prato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		else if (totalCalorias != other.totalCalorias)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	public int compareTo(Prato prato2) {
		return (int)(totalCalorias - prato2.totalCalorias);
	}
	
}
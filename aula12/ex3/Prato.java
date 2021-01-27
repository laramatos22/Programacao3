package aula12.ex3;

import java.util.*;

public class Prato implements Comparable<Prato> {
	
	private final String nome;
	private final List<Alimento> composicao;
	private double totalCalorias = 0;
	
	public Prato(String nome) {
		this.nome = nome;
		composicao = new LinkedList<>();
	}

	public String getNome() {return nome;}
	public double getTotalCalorias() {return totalCalorias;}
	public int getNumIngredientes() {return composicao.size();}
	
	public boolean addIngrediente(Alimento alimento) {
		if(alimento == null)	return false;
		composicao.add(alimento);
		totalCalorias += alimento.getCalorias();
		return true;
	}
	
	public boolean exists(Alimento alimento) {
		return composicao.contains(alimento);
	}
	
	public Alimento[] getAlimentos() {
		return composicao.toArray(new Alimento[0]);
	}
	
	@Override
	public int compareTo(Prato prato2) {
		return (int)(totalCalorias-prato2.totalCalorias);
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (obj == null)	return false;
		if (getClass() != obj.getClass())	return false;
		Prato other = (Prato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(totalCalorias) != Double.doubleToLongBits(other.totalCalorias))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Prato '"+nome+"' composto por "+getNumIngredientes()+" Ingredientes";
	}
	

}
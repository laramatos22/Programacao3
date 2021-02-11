package ex1;

//País: caracterizado por um nome (String), uma capital (Localidade) e por um
//conjunto pré-definido de regiões (Região).

import java.util.*;

public class Pais extends Estado {
	
	private List<Regiao> regioes;
	private int totalPopulacao;
	
	//Vários construtores possiveis
	
	public Pais(String nome, Localidade capital, List<Regiao> regioes, int totalPopulacao) {
		super(nome, 0, capital);
		this.regioes = regioes;
		this.totalPopulacao = totalPopulacao;
		pop();
	}
		
		//para atualizar sempre o numero total de pessoas de uma dada regiao
		//e fazer a soma de todas as regioes
		private void pop() {
			for(Regiao regiao : regioes)
				totalPopulacao += regiao.getPopulacao();
		}
		
	public Pais(String string, Localidade capital2) {
		this(string, capital2, new ArrayList<>(), 0);
	}
	
	public Pais(String string) {
		this(string, null, new ArrayList<>(), 0);
	}
	
	//Getter
	public List<Regiao> getRegioes() {return regioes;}
	
	//Método para adicionar uma nova regiao
	public void addRegiao(Regiao reg) {
		regioes.add(reg);
		totalPopulacao += reg.getPopulacao(); //somar a população ao valor total desse dado país
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((regioes == null) ?= 0 : regioes.hashCode());
		result = prime * result + totalPopulacao;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(getClass() != obj.getClass()) return false;
		
		Pais other = (Pais) obj;
		
		if(regioes == null) {
			if(other.regioes != null)
				return false;
		} else if(!regioes.equals(other.regioes))
			return false;
		
		if(totalPopulacao != other.totalPopulacao)
			return false;
		
		return true;
		
	}
	
	@Override
	public String toString() {
		return "Pais: " + super.getNome() + ", Populacao: " + totalPopulacao
				+ "(Capital: " + (super.getCapital() == null ? "*Indefinida*)" : super.getCapital().toString() + ")");
	}
		
}

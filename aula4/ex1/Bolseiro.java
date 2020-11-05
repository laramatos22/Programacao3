package aula4.ex1;

import aula4.*;

public class Bolseiro extends Estudante {
	
	public int bolsa;	//valor da bolsa de estudante
	
	public Bolseiro (String nome, int cc, Data bDay, Data dataInscricao) {
		super(nome, cc, bDay, dataInscricao);
	}
	
	public Bolseiro(String nome, int cc, Data bDay) {
		super(nome, cc, bDay, Data.today());
	}
	
	public int bolsa() {return this.bolsa;}
	
	public String toString() {
		return (super.toString() + "\nValor da Bolsa: " + this.bolsa);
	}
	
	public void setBolsa(int i) {
		this.bolsa = i;
	}
	
}

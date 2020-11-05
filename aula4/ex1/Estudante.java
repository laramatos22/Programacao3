package aula4.ex1;

import aula4.*;

public class Estudante extends Person {
	
	private static int var=1; //o 1º Nmec vai começar a 1 e o 2º Nmec vai ser 2
							  //a atribuição é sequencial
	private int Nmec;
	private Data dataInscricao;
	
	public Estudante (String nome, int cc, Data bDay, Data dataInscricao) {
		super(nome, cc, bDay);
		this.Nmec = var++;
		this.dataInscricao = dataInscricao;
	}
	
	public Estudante (String nome, int cc, Data bDay) {
		super(nome, cc, bDay);
		this.Nmec = var++;
		this.dataInscricao = Data.today();
	}
	
	public int Nmec() {return this.Nmec;}
	public Data dataInscricao() {return this.dataInscricao;}
	
	public String toString() {
		return (super.toString() + " Número Mecanográfico: " + this.Nmec 
				+ " Data de Inscrição: " + this.dataInscricao);
	}
	
}

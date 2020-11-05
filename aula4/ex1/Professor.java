package aula4.ex1;

import aula4.Data;
import aula4.Person;

public class Professor extends Person {
	
	private int numFunc;			//Um professor é considerado um funcionário
	private static int nF = 100;	//O número de funcionário é dado sequencialmente, por isso nF é static
	private Data dataAdmissao;		//data de admissão - data em que o professor foi admitido para trabalhar
	
	public Professor(String nome, int cc, Data bDay) {
		super(nome, cc, bDay);
		this.numFunc = nF++;
		this.dataAdmissao = Data.today();
	}
	
	public Professor(String nome, int cc, Data bDay, int numFunc, Data dataAdmissao) {
		super(nome, cc, bDay);
		this.numFunc = numFunc;
		this.dataAdmissao = dataAdmissao;
	}
	
	public int numFunc() {return numFunc;}
	public Data dataAdmissao() {return dataAdmissao;}
	
	public String toString() {
		return (super.toString() + "\nNúmero de Funcionário: " + this.numFunc 
				+ "\nData de Admissão: " + this.dataAdmissao);
	}

}

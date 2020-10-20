package aula2;

public class Person {

	private String name;		//nome
	private int cc;				//cartao de cidadao
	private Data birthDate;		//data de nascimento
	
	public Person(String n, int cc, Data data) {
		this.name = n;
		this.cc = cc;
		this.birthDate = data;
	}
	
	public String Nome() {return name;}
	public int CartaoCidadao() {return cc;}
	
	public String toString() {
		return String.format("%s, %d, %s", this.name, this.cc, birthDate.toString());
	}
	
}
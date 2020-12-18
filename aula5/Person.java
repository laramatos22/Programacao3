package aula5;

public class Person {

	private String name;		//nome
	private int numero;			//numero de telemovel
	private Data birthDate;		//data de nascimento
	
	public Person(String n, int num, Data bDay) {
		this.name = n;
		this.numero = num;
		this.birthDate = bDay;
	}
	
	public String Nome() {return name;}
	public int Numero() {return numero;}
	public Data Data() {return birthDate;}
	
	public String toString() {
		return String.format("%s, %d, %s", this.name, this.numero, birthDate.toString());
	}

	
}
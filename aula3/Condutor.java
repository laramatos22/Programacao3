package aula3;

//Pessoa com carta de condução
public class Condutor extends Person {

	private char licenca;	//licença para conduzir
	
	public Condutor(String nome, int cc, Data bDay, char licenca) {
		super(nome, cc, bDay);
		this.licenca = licenca;
	}
	
	public char licenca() {return licenca;}
	
}

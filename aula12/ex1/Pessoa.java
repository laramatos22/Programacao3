package aula12.ex1;

public class Pessoa {
	
	private String nome;
	private int cc;
	private Data datanasc;
	
	public Pessoa(String nome, int cc, Data datanasc) {
		this.nome= nome;
		this.cc = cc;
		this.datanasc= datanasc;
	}
	
	public String nome() {
		return nome;
	}
	public int cc() {
		return cc;
	}
	public Data datanasc() {
		return datanasc;
	}
	
	public String toString() {
		return String.format("%1$"+12+"s", nome) + " | " + String.format("%1$"+11+"s", cc)+" | "+String.format("%1$"+8+ "s", datanasc);
	}

}

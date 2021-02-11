package ex3.alineaA;

public class Empregado {
	
	private String nome;
	private int id;
	
	public Empregado(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {return nome;}
	public int getID() {return id;}
	
	@Override
	public String toString() {
		return "Empregado nº " + id + " - " + nome;
	}

}

package ex3.alineaB;

public class Brinquedo {
	
	private String nome;
	private int id;
	
	public Brinquedo(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {return nome;}
	public int getID() {return id;}
	
	@Override
	public String toString() {
		return "Brinquedo nº " + id + " - " + nome;
	}

}

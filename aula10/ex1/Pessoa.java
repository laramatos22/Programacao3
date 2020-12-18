package aula10.ex1;

public class Pessoa {
	
	private int cc;
	private String nome;
	private Data dataNascimento;
	
	public Pessoa (String nome, int cc, Data dataNascimento) {
		this.cc = cc;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public int getCC() {return cc;}
	public String getNome() {return nome;}
	public Data getDataNasc() {return dataNascimento;}
	
	public String toString() {
		return "CartaoCidadao: " + cc + " | Nome: " + nome + " Data de Nascimento: " + dataNascimento;
	}
	
	public int compareToCC(Pessoa p) {
		if(p.cc < this.cc)	return -1;
		else if(p.cc == this.cc)	return 0;
		else	return 1;
	}
	
	public int compareToNome(Pessoa p) {
		return (this.nome).compareTo(p.nome);
	}

}

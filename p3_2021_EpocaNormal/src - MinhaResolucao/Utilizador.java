import java.util.*;

public class Utilizador {
	
	//interface enumerada para o tipo de pessoa
	enum TipoPessoa {
		Professor, AlunoPosGrad, Aluno
	}

	//campos
	private int nmec;
	private String nome;
	private LocalDate dataInscricao;
	private Utilizador.TipoPessoa tipo;
	private Set<Emprestimo> emprestimo;
	
	//construtor
	public Utilizador(String nome, int nmec, LocalDate dataInscricao) {
		this.nome = nome;
		this.nmec = nmec;
		this.dataInscricao = dataInscricao;
	}
	
	//Getters
	public int getNmec() {return nmec;}
	public String getNome() {return nome;}
	public LocalDate getDataInscricao() {return dataInscricao;}
	public TipoPessoa getTipoPessoa() {return tipo;}
	public Set<Emprestimo> getEmprestimo() {return emprestimo;}
	
	//Métodos
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, nmec, dataInscricao);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Utilizador other = (Utilizador) obj;
		
		return Objects.equals(nome, other.nome) && nmec == other.nmec 
				&& dataInscricao == other.dataInscricao;
		
	}
	
	@Override
	public String toString() {
		return "Utilizador: [ nome: " + nome + "| Numero Mecanografico: " + nmec 
				+ "| Data de Inscricao: " + dataInscricao + "| Emprestimos: " + emprestimo;
	}
	

}



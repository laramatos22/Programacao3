package aula7.ex1;

public class Companhia {
	
	private String sigla;
	private String nome;
	
	public Companhia(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	public String sigla() {return sigla;}
	public String nome() {return nome;}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		Companhia companhia = (Companhia) obj;
		
		if(nome == null) {
			if(companhia.nome != null) return false;
		} else if(!nome.equals(companhia.nome)) return false;
		
		if(sigla == null) {
			if(companhia.sigla != null) return false;
		} else if(!sigla.equals(companhia.sigla)) return false;
		
		return true;
	}
	
	public String toString() {return nome;}

}


public abstract class Stand implements Expositor {
	
	private String codigo;
	private String nome;
	private Participante responsavel;
	
	public Stand(String codigo, String nome, Participante responsavel) {
		this.codigo = codigo;
		this.nome = nome;
		this.responsavel = responsavel;
	}
	
	public String codigo() {return codigo;}
	public String nome() {return nome;}
	public Participante responsavel() {return responsavel;}
	
	@Override
	public String toString() {
		return "Stand [" + "codigo = " + codigo + ", nome = " + nome + ", responsavel = " + responsavel + " ]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)	return true;
		if(!(obj instanceof Stand))	return false;
		
		Stand stand = (Stand) obj;
		
		if (codigo != null ? !codigo.equals(stand.codigo) : stand.codigo != null)	return false;
		if (nome != null ? !nome.equals(stand.nome) : stand.nome != null)	return false;
		return responsavel != null ? responsavel.equals(stand.responsavel) : stand.responsavel == null;
		
	}
	
	@Override
	public int hashCode() {
		int result = codigo != null ? codigo.hashCode() : 0;
		result = 31 * result + (nome != null ? nome.hashCode() : 0);
		result = 31 * result + (responsavel != null ? responsavel.hashCode() : 0);
		return result;
	}

}

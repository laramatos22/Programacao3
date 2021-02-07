
public class Participante {
	
	private String email;
	private String nome;
	
	public Participante(String email, String nome) {
		this.email = email;
		this.nome = nome;
	}
	
	public String getEmail() {return email;}
	public String getNome() {return nome;}
	
	@Override
	public String toString() {
		return "Participante [" + "email = " + email + ", nome = " + nome + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)	return true;
		if(!(obj instanceof Participante))	return false;
		
		Participante other = (Participante) obj;
		
		if(getEmail() != null ? !getEmail().equals(other.getEmail()) : other.getEmail() != null)	return false;
		return getNome() != null ? !getNome().equals(other.getNome()) : other.getNome() != null
		
	}
	
	@Override
	public int hashCode() {
		int result = getEmail() != null ? getEmail().hashCode() : 0;
		result = 31 * result + (getNome() != null ? getNome().hashCode() : 0);
		return result;
	}

}

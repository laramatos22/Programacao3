import java.util.List;
import java.util.Objects;

public class Tenda implements Vendedor {
	
	private int numero;
	private String nome;
	
	public Tenda(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public int getNumero() {return numero;}
	public String getNome() {return nome;}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Tenda other = (Tenda) obj;
		
		return numero == other.numero && Objects.equals(nome, other.nome);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numero, nome);
	}
	
	@Override
	public String toString() {
		return "Tenda: " + " nº " + numero + ", nome: " + nome;
	}
	
	@Override
	public List<String> opcoes() {
		return null;
	}

}

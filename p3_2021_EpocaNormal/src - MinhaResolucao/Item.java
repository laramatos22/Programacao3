import java.util.Objects;

public class Item {
	
	private String ISBN;
	private String titulo;
	private int prazo = 7;
	private int copiasExiste = 1;
	private int copiasDisp;
	
	//Construtores
	public Item(String ISBN, String titulo, int prazo, int copiasExiste) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.prazo = prazo;
		this.copiasExiste = copiasExiste;
	}
	
	public Item(String ISBN, String titulo) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.prazo--;
		this.copiasExiste++;
	}
	
	//Getters
	public String getISBN() {return ISBN;}
	public String getTitulo() {return titulo;}
	public int getPrazo() {return prazo;}
	public int getCopiasExiste() {return copiasExiste;}
	public int getCopiasDisp() {return copiasDisp;}
	
	//Métodos:
	
	@Override
	public int hashCode() {
		return Objects.hash(ISBN, titulo, prazo, copiasExiste);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Item other = (Item) obj;
		
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(titulo, other.titulo) &&  prazo == other.prazo 
				&& copiasExiste == other.copiasExiste && copiasDisp == other.copiasDisp;
		
	}
	
	@Override
	public String toString() {
		return "Item [" + "ISBN: " + ISBN + "| Titulo: " + titulo + "| Prazo de Emprestimo: " + prazo 
				+ "| Copias Existentes: " + copiasExiste + "| Copias Disponiveis " + copiasDisp + "]";
	}

}

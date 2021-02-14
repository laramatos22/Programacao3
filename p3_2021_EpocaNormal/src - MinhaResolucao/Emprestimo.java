import java.util.Objects;

public class Emprestimo {
	
	private Item item;
	private LocalDate dataInicio;
	private LocalDate dataLimite;
	
	//Construtor
	public Emprestimo(Item item, LocalDate dataInicio, LocalDate dataLimite) {
		this.item = item;
		this.dataInicio = dataInicio;
		this.dataLimite = dataLimite;
	}
	
	//Getters
	public Item getItem() {return item;}
	public LocalDate getDataInicio() {return dataInicio;}
	public LocalDate getdataLimite() {return dataLimite;}
	
	//Métodos:
	
	@Override
	public int hashCode() {
		return Objects.hash(item, dataInicio, dataLimite);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Emprestimo other = (Emprestimo) obj;
		
		return Objects.equals(item, other.item) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(dataLimite, other.dataLimite);
		
	}
	
	@Override
	public String toString() {
		return "Emprestimo [ Item: " + item + "| Data de Emprestimo: " + dataInicio 
				+ "| Data Limite de Devolução: " + dataLimite;
	}

}

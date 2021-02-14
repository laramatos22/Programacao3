import java.time.temporal.ChronoUnit;
import java.util.*;

public class Biblioteca {
	
	private String nome;
	private Set<Utilizador> users;
	private Set<Item> items;
	
	//Construtor
	public Biblioteca(String nome) {
		this.nome = nome;
		users = new HashSet<Utilizador>();
		items = new HashSet<Item>();
	}
	
	//Getters
	public String getNome() {return nome;}
	public Set<Utilizador> getUsers() {return users;}
	public Set<Item> getItems() {return items;}
	
	//Métodos
	
	//empresta(item, user, dataInicio) -> é uma função booleana
	public boolean empresta(Set<Item> item, Set<Utilizador> user, LocalDate dataInicio) {
		LocalDate dataFim;
		if(ChronoUnit.DAYS.between(dataInicio, dataFim) >= 7) {  //caso exceda o tempo limite de 7 dias
			item.size(); 
		} else if(items=>2) { //caso tenha 2 ou mais emprestimos em atraso
			item.size();
		} else {				//caso esteja tudo em condições
			item.remove(item);		// remove item que vai para emprestimo
		}
	}
	
	//novoUtilizador (user) -> acrescenta um novo utilizador da biblioteca
	public boolean novoUtilizador(Utilizador user) {
		return users.add(user);
	}
	
	//novoItem(item) -> acrescenta um novo item à biblioteca
	public boolean novoItem(Item item) {
		return items.add(item);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Biblioteca other = (Biblioteca) obj;
		
		return Objects.equals(nome, other.nome);
		
	}
	
	@Override
	public String toString() {
		return "Biblioteca [" + nome + "| Utilizadores: " + users + "| Items: " + items;
	}

	public void iterator() {
		
	}

}

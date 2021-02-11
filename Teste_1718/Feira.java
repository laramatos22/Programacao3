import java.util.*;

/**
 * 
 * @param nome
 * @param morada
 * 
 * 
 * NOTAS:
 * - Set (conjunto) -> sem noção de posição (sem ordem), sem repetição 
 * - List (lista) -> sequencias com noção de ordem com repetição
 * - Queue (fila) -> são as dilas do tipo FIFO(First In First Out)
 * - Map (mapa) -> estruturas associativas onde os objetos são representados por um par chave-valor.
 *                 Pares chave-valor (com repetição - MultiMap)
 *                 
 */

public class Feira {
	
	private String nome;
	private String morada;
	private Set<Tenda> tendas;			
	private List<Visitante> visitantes; 
	
	public Feira(String nome, String morada) {
		this.nome = nome;
		this.morada = morada;
		tendas = new HashSet<>();
		visitantes = new ArrayList<>();
	}
	
	public String getNome() {return nome;}
	public String getMorada() {return morada;}
	public Set<Tenda> getTendas() {return tendas;}
	public List<Visitante> getVisitantes() {return visitantes;}
	
	public boolean addTenda(Tenda tenda) {
		return tendas.add(tenda);
	}
	
	public boolean addVisitante(Visitante visit) {
		return visitantes.add(visit);
	}
	
	public String getProductsFrom(Tasquinha tasq) {
		String toRet = "[";
		int i=1;
		
		for(String comida : tasq.getMenu()) {
			if(i == tasq.getMenu().length)
				toRet += comida + "]";
			else 
				toRet += comida + ",";
			i++;
		}
		return toRet;
	}
	
	public List<Bebida> getBeerByType(Bebida.TipoBebida tipo) {
		List<Taberna> tab = new ArrayList<>();
		for(Tenda t : tendas) {
			if(t.getClass().getSimpleName().equals("Taberna"))
				tab.add((Taberna)t);
		}
		
		List<Bebida> bebidas = new ArrayList<>();
		List<Bebida> list;
		for(Taberna t : tab) {
			list = t.getBebidas();
			for(Bebida b : list)
				if(b.getTipo() == tipo)
					bebidas.add(b);
		}
		return bebidas;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Feira other = (Feira) obj;
		
		return Objects.equals(nome, other.nome) && Objects.equals(morada, other.morada) && Objects.equals(tendas, other.tendas) && Objects.equals(visitantes, other.visitantes);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, morada, tendas, visitantes);
	}
	
	@Override
	public String toString() {
		return "Feira " + nome + ":\n" + "Tendas: " + tendas.toString() + "\n"
										+ "\nVisitantes: " + visitantes.toString() + "\n";
	}
	
	//método q indica o total de expositores
	public int totalExpositores(String tipo) {
		int i=0;
		for(Tenda t : tendas)
			if(t.getClass().getSimpleName().equals(tipo))
				i++;
		return i;
	}

}

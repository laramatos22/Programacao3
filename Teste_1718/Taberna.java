import java.util.*;

public class Taberna extends Tenda {
	
	private List<Bebida> bebidas;
	
	public Taberna(int numero, String nome, List<Bebida> bebidas) {
		super(numero, nome);
		this.bebidas = bebidas;
	}
	
	public Taberna(int numero, String nome) {
		super(numero, nome);
		this.bebidas = new ArrayList<>();
	}
	
	public List<Bebida> getBebidas() {return bebidas;}
	
	public boolean add(Bebida b) {
		return bebidas.add(b);
	}
	
	@Override
	public List<String> opcoes() {
		List<String> drinks = new ArrayList<>();
		bebidas.stream().map(f -> f.getNome()).forEach(drinks::add);
		return drinks;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		if(!super.equals(obj)) return false;
		
		Taberna other = (Taberna) obj;
		
		return Objects.equals(bebidas, other.bebidas);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), bebidas);
	}
	
			private String printDrinks() {
				String toRet = "";
				int i=1;
				for(Bebida b : bebidas) {
					if(i == bebidas.size())
						toRet += b.toString();
					else
						toRet += b.toString() + ", ";
					i++;
				}
				return toRet;
			}
	
	@Override
	public String toString() {
		return "Taberna: [bebidas: " + printDrinks() + ", " + super.toString();
	}

}

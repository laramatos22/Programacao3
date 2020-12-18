package tp10.Exemplo_FactoryMethod;

public class Viveiro {
	
	public static Arvore factory(String pedido) {
		if(pedido.equalsIgnoreCase("Figueira"))
			return new Figueira();
		if(pedido.equalsIgnoreCase("Pessegueiro"))
			return new Pessegueiro();
		if(pedido.equalsIgnoreCase("Nespereira"))
			return new Nespereira();
		else
			throw new IllegalArgumentException("Arvore Nao Existente!");
	}	

}

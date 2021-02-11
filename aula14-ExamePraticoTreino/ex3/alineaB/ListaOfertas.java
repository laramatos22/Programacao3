package ex3.alineaB;

import java.util.Iterator;
import java.util.ArrayList;

import ex3.alineaA.Empregado;

public class ListaOfertas extends ArrayList<Oferta> {
	
	public ListaOfertas() {
		super();
	}
	
	public boolean add(Empregado e, Brinquedo b) {
		return super.add(new Oferta(e, b, size() + 1));
	}
	
	@Override
	public String toString() {
		String res = "Lista de Ofertas:\n";
		Iterator itr = super.iterator();
		int i=1;
		while(itr.hasNext()) {
			res += itr.next() + "\n";
			i++;
		}
		return res;
	}

}

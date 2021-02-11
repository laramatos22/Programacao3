package ex3.alineaA;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEmpregados extends ArrayList<Empregado> {
	
	public ListaEmpregados() {
		super();
	}
	
	public boolean add(String str) {
		return super.add(new Empregado(s, size() + 1));
	}
	
	@Override
	public String toString() {
		String res = "Lista de Empregados: \n";
		Iterator itr = super.iterator();
		int i=1;
		while(itr.hasNext()) {
			res += itr.next() + "\n";
			i++;
		}
		return res;
	}

}

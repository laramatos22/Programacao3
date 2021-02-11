package ex3.alineaC;

import java.util.HashSet;
import java.util.Iterator;

public class ListaNomes extends HashSet<String> {
	
	public ListaNomes() {
		super();
	}
	
	public boolean add(Empregado e) {
		return super.add(e.getPrimeiroNome());
	}
	
	public void remove(Empregado e) {
		super.removeIf(s -> s.equals(e.getPrimeiroNome()));
	}
	
	public String toString() {
		String res = "Lista de Nomes: \n";
		Iterator itr = super.iterator();
		int i=1;
		while(itr.hasNext()) {
			res += itr.next() + "\n";
			i++;
		}
		return res;
	}

}

package aula10.ex1;

import java.util.Iterator;
import java.util.*;

public class ListaGeneric<T> {
	
	//ArrayList gen�rica 
	private ArrayList<T> lista;
	
	//Construtor
	public ListaGeneric() {
		lista = new ArrayList<>();
	}
	
	//adicionar elemento
	public boolean addElem(T elem) {
		//Caso nao exista o elemento
		if (elem == null)
			//return false uma vez que o elemento nao existe na lista
			return false;
		//caso contrario usa a fun��o .add da ArrayList
		lista.add(elem);
		return true;
	}
	
	//remover elemento
	public boolean removeElem(T elem) {
		//caso nao haja o elemento lista
		if (elem == null)
			//return false uma vez que o elemento nao existe na lista
			return false;
		//ou se a lista contiver o elemento
		if (lista.contains(elem)) {
			//usar a fun��o .remove(elemento) da ArrayList
			lista.remove(elem);
			return true;
		} 
		return false;
	}
	
	//total de elementos
	public int totalElem() {
		return lista.size(); 
	}

	//fun��o iterator()
	Iterator<T> iterator() {
		return (this).new ListIterator();
	}
	
	private class ListIterator implements Iterator<T> {
		private int i;
		ListIterator() {
			i = 0;
		}
		
		public boolean hasNext(){
			return (i < totalElem());
		}
		
		public T next() {
			if (hasNext()) {
				T elem = lista.get(i);
				i++;
				return elem;
			}
			throw new IndexOutOfBoundsException("N�o h� pr�ximo elemento.");
		}
		
		public void remove() {
			throw new UnsupportedOperationException ("Opera��o n�o suportada.");
		}
	}
	
}

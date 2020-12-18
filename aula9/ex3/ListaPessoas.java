package aula9.ex3;

import java.util.*;

public class ListaPessoas {
	
	//Lista para inserir as Pessoas da classe Pessoa
	private List<Pessoa> lista;
	
	private int size;
	
	//Construtor
	public ListaPessoas() {
		lista = new LinkedList<Pessoa>();
	}
	
	//Métodos
	
	//adicionar pessoa					usa a função add(p) da classe LinkedList
	public boolean addPessoa(Pessoa p) {return lista.add(p);} 
	
	//remover pessoa					usa a função remove(p) da classe LinkedList
	public boolean removePessoa(Pessoa p) {return lista.remove(p);}
	
	//total de pessoas da lista			usa a função size() que retorna o tamanho da lista
	public int totalPessoas() {return lista.size();}
	
	private class ListaIterator implements Iterator {
		
		private int index;
		
		public ListaIterator() {
			index = 0;
		}
		
		public void remove() {
			removePessoa(lista.remove(index));
		}
		
		public boolean hasNext() {
			return index < size;
		}
		
		public Pessoa next() {
			return lista.get(index+1);
		}
		
	}
	
	//função iterator
	public Iterator iterator() {
		return (this).new ListaIterator();
	}

}

package aula10.ex1;

import java.util.Iterator;

public class VectorGeneric<T> {
	
	private Object[] vector;			//vetor genérico
	private int num;					//numero de elementos do vetor
	private final int ALLOC = 50; 		//tamanho do vetor
	private int dim = ALLOC;			//a dimensao é igual ao tamanho do vetor

	public VectorGeneric() {
		vector = new Object[ALLOC];		//vetor com dimensao de ALLOC
		num = 0;						//numero de elementos do vetor
	}
	
	//adicionar elemento
	public boolean addElem(T elem) {
		if (elem == null)
			return false;
		if (num>=dim) {
			dim += ALLOC;
			Object[] tmp = new Object[dim];
			System.arraycopy(vector, 0, tmp, 0, num);
			vector = tmp;
		}
		vector[num++] = elem;
		return true;
	}
	
	//remover elemento
	public boolean removeElem(T elem) {
		for (int i = 0; i < num; i++) {
			if (vector[i] == elem) {
				num--;
				for (int j = i; j < num; j++)
					vector[j] = vector[j + 1];
				return true;
			}
		}
		return false;
	}
	
	//total de elementos
	public int totalElem() {
		return vector.length;
	}
	
	//função iterator()
	public Iterator<T> iterator() {
		return (this).new VecIterator<T>();
	}
	
	private class VecIterator<T> implements Iterator<T> {
		private int i;
		VecIterator() {
			i = 0;
		}
		
		public boolean hasNext(){
			return (i < num);
		}
		
		@SuppressWarnings("unchecked")
		public T next() {
			if (hasNext()) {
				T elem = (T)vector[i];
				i++;
				return elem;
			}
			throw new IndexOutOfBoundsException("Não há próximo elemento.");
		}
		
		public void remove() {
			throw new UnsupportedOperationException ("Operação não suportada.");
		}
	}
	
}

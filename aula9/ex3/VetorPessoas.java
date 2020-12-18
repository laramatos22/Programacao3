package aula9.ex3;

/**a classe VectorPessoas que gere uma lista de Pessoas com base num vector que
cresce dinamicamente. Inclua os métodos:
boolean addPessoa(Pessoa p)
boolean removePessoa(Pessoa p)
int totalPessoas()*/


public class VetorPessoas {
	
	private Pessoa vetor[];
	private int size;		//tamanho do vetor
		
	public VetorPessoas() {
		//no inicio do vetor:
		vetor = new Pessoa[1];
		size = 0;
	}
	
	//quando o vetor está cheio, esta função é private e é usada pela função addPessoa()
	private boolean full() {return size == vetor.length;}
	
	//adicionar Pessoa ao vetor
	public boolean addPessoa(Pessoa p) {
		try {
			//quando o vetor está cheio
			if(full()) {
				//extender o vetor
				extendArray();
				vetor[size++] = p;
			} else 
				vetor[size++] = p;
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	//função private para extender o vetor, usada pela função addPessoa()
	private void extendArray() {
		Pessoa tmp[] = new Pessoa[vetor.length * 2];
		System.arraycopy(vetor, 0, tmp, 0, vetor.length);
		vetor = tmp;
	}
	
	//Remover Pessoa do vetor
	public boolean removePessoa(Pessoa p) {
		//boolean para descobrir onde está a pessoa que se quer remover
		boolean found = false;
		for(int i=0; i < size; i++) {
			if(found)
				vetor[i] = vetor[i+1];
			else if(p.equals(vetor[i])) {
				vetor[i] = vetor[i+1];
				found = true;
			}
		}
		return found;
	}
	
	/**Acrescente à classe VectorPessoas a classe interna VectorIterator que
	implementa a interface Iterador:
	public interface Iterator {
	boolean hasNext();
	Object next();
	void remove();*/
	
	private class VetorIterator implements Iterator {
		
		private int index;
		
		public VetorIterator() {
			index = 0;
		}
		
		public void remove() {
			removePessoa(vetor[index]);
		}
		
		public boolean hasNext() {
			return index < size;
		}
		
		public Pessoa next() {
			return vetor[index++];
		}
		
	}
	
	/**Crie o método Iterator iterador() que cria um iterador a apontar para a primeira
	posição do vector interno.*/
	
	public Iterator iterator() {
		return (this).new VetorIterator();
	}

}

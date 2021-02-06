import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Banco {
	
	protected Set<Conta> contas;		//set com todas as contas que estão no banco
	private String nome;
	
	//Contrutores possiveis
	public Banco(Set<Conta> contas, String nome) {
		this.contas = contas;
		this.nome = nome;
	}
	
	public Banco(String nome) {
		this.contas = new HashSet<Conta>();
		this.nome = nome;
	}
	
	//Getters
	public Set<Conta> getContas() {return contas;}
	public String getNome() {return nome;}
	
	//Método add(c) para adicionar contas ao banco
	public boolean add(Conta c) {
		return contas.add(c);
	}
	
	Iterator<Conta> iterator() {
		return (this).new BancoIterator();
	}
	
		private class BancoIterator implements Iterator<Conta> {
			
			Iterator<Conta> it = contas.iterator();
			
			@Override
			public boolean hasNext() {
				return it.hasNext();
			}
			
			@Override
			public Conta next() {
				return it.next();
			}
			
		}
	
	
}

package Collections;

//Set(conjuntos) - uma coleção que não pode conter elementos duplicados
//					Contém apenas os métodos definidos na interface Collection

public abstract class AbstractSet<E> 
	extends AbstractCollection<E> implements Set<E> {
	
	protected AbstractSet();
	
	public boolean equals(Object o) {
		if(!(o instanceof Set)) return false;
		return ((Set)o).size()==size() && constainsAll((Set)o);
	}
	
	public int hashCode() {
		int h = 0;
		for(E el : this)
			if(el != null) h += el.hashCode();
		return h;
	}
	

}

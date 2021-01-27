package Collections;

//INTERFACE COLLECTION

public interface Collection<E> extends Iterable<E> {
	
	//Basic operations
	int size();
	boolean isEmpty();
	boolean contains(Object element);
	boolean add(E element);
	boolean remove(Object element);
	Iterator<E> iterator();
	
	//Bulk operations
	boolean containsAll(Collection<?> c);
	boolean addAll(Collection<? extends E> c);
	boolean removeAll(Collection<?> c);
	boolean retainAll(Collection<?> c);
	void clear();
	
	//Array operations
	Object[] toArray();
	<T> T[] toArray(T[] a);

}

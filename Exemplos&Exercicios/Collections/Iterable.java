package Collections;

//INTERFACE ITERABLE

public interface Iterable<T> {
	
	default void forEach(Consumer<? super T> action)
		//Performs the given action for each element of the Iterable until
		//all elements have been precessed or the action throws an exception
	
	Iterable<T> iterator()
		//Returns an iterator over elements of tpe T
	
	default Spliterator<T> spliterator()
		//Creates a Spliterator over the elements described by this Iterable

}

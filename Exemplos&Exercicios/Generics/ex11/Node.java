package Generics.ex11;

public class Node {
	
	//Consider this class;
	
	/**
	 * class Node<T> implements Comparable<T> {
	 * 		public int compareTo(T obj) {...}
	 * }
	 */
	
	//Will the following code compile? If not, why?
	
	/**
	 * Answer: Yes
	 * 
	 * 		Node<String> node = new Node<>();
	 * 		Compareble<String> comp = node;		
	 * 
	 */

}

package Generics.ex6;

public class findFirstGreaterThan {
	
	/**
	 * What is the following method converted to after type erasure?
	 * 
public static <T extends Comparable<T>>
    int findFirstGreaterThan(T[] at, T elem) {
    // ...
}
	 *
	 */
	
	/**
	 * Answer:
	 * 
	 * public static int findFirstGreaterThan(Comparable[] at, Comparable elem) {
	 * 	//...
	 * }
	 * 
	 */
}

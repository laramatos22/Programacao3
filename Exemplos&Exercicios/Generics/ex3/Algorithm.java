package Generics.ex3;

/**
 * 
 * @author LaraMatos
 * 
 * EXERCISE 3
 * 		Write a generic method to exchange the positions of the two different elements in an array
 *
 */

public class Algorithm {
	
	public static <T> void swap(T[] a, int i, int j) {
		
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}

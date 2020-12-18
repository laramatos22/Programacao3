package Generics.ex2;

/**
 * 
 * @author LaraMatos
 * 
 * EXERCISE 2
 * 	Will the following class compile? If not, why?
 *
 */

public class Algorithm {
	
	public static<T> T max(T x, T y) {
		return x > y ? x : y;
	}

}

/**
 * Answer: No. The greater than (>) operator apllies 
 * 		   only to primitive numeric types.
 */

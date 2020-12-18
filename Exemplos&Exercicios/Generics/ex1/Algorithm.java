package Generics.ex1;

/**
 * 
 * @author LaraMatos
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-answers.html
 * 
 * EXERCISE 1
 * 		Write a generic method to count the number of elements in a 
 * 		collection that have a specific property (for example, odd integers,
 * 		prime numbers, palindromes)
 *
 */
import java.util.*;

public final class Algorithm {
	
	public static <T> int countIf(Collection<T> c, UnaryPredicate <T> p) {
		
		int count = 0;
		for(T elem : c)
			if(p.test(elem))
				++count;
		return count;
		
	}

}

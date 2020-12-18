package Generics.ex1;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
		int count = Algorithm.countIf(ci, new OddPredicate());
		System.out.println("Number of odd integers = " + count);
		
	}

}

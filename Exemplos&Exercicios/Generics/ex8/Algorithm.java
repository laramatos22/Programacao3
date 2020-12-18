package Generics.ex8;

//Write a generic method to find the maximal element in the range [begin, end) of a list.

import java.util.*;

public final class Algorithm {
	
	public static <T extends Object & Comparable<? super T>>
		T max (List<? extends T> list, int begin, int end) {
		
		T maxElem = list.get(begin);
		
		for(++begin; begin < end; ++begin)
			if(maxElem.compareTo(list.get(begin)) < 0)
				maxElem = list.get(begin);
		return maxElem;
		
	}

}

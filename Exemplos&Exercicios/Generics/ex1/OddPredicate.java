package Generics.ex1;

public class OddPredicate implements UnaryPredicate<Integer> {
	
	public boolean test(Integer i) {
		return i% 2 != 0;
	}

}

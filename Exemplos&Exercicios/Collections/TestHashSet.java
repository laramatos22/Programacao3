package Collections;

import java.util.*;

public class TestHashSet {
	
	public static void main(String[] args) {
		String[] str = {"Rui", "Manuel", "Eduardo", "Rui", "Jose", "Pires", "Santos"};
		
		Set<String> s = HashSet<String>();
			
			for(String i : str) {
				if(!s.add(i))
					System.out.println("Nome duplicado: " + i);
			}
			
			System.out.println(s.size() + " palavras distintas");
			
			Iterator<String> itr = s.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
	}

}

/**
 * No terminal:
 * 
 * Nomoe duplicado: Rui
 * 6 palavras distintas
 * 
 * Manuel
 * Rui
 * Jose
 * Eduardo
 * Santos
 * Pires
 */

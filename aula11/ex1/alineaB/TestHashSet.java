package aula11.ex1.alineaB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

public class TestHashSet {
	
	static LinkedList<String> list = new LinkedList<String>();

	public static void main(String[] args) throws IOException {
		
		
		Path p = Paths.get("C:\\Users\\PC\\eclipse-workspace\\Prog3\\src\\aula11\\Policarpo.txt");
		List<String> lines = Files.readAllLines(p);
		
		for(String s : lines)
			countWords(s);
		System.out.println("Número total de palavras: "+(list.size()-1));
		
		int repetidas = 0;
		Set<String> set = new HashSet<String>();
		for(String s : list) {
			if(!set.add(s))
				repetidas++;
		}
		

		System.out.println("Número de diferentes palavras: "+((list.size()-1)-repetidas));
		System.out.println("Número de palavras repetidas: "+repetidas);
		list.clear();

	}
	

	public static void countWords(String sent) {
		String[] array = sent.split("\\s+");
		for(int i=0;i<array.length;i++)
			list.add(array[i]);
		
	}

}

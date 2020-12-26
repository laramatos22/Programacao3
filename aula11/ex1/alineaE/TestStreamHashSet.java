package aula11.ex1.alineaE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.sql.Array;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestStreamHashSet {
	
	static LinkedList<String> list = new LinkedList<String>();

	public static void main(String[] args) throws IOException {
		
		
		Path p = Paths.get("C:\\Users\\PC\\eclipse-workspace\\Prog3\\src\\aula11\\Policarpo.txt");
		List<String> lines = Files.readAllLines(p);
		
		System.out.println("Número total de palavras: "+(list.size()-1));
		
		int repetidas = 0;
		Set<String> set = new HashSet<String>();
		for(String s : list)
			set.add(s);
		

		System.out.println("Número de diferentes palavras: "+((list.size()-1)-repetidas));
		System.out.println("Número de palavras repetidas: "+repetidas);
		list.clear();

	}
	

	public static void countWords1(String sent) {
		String[] array = sent.split("\\s+");
		for(int i=0;i<array.length;i++)
			list.add(array[i]);
	}
	
	
}

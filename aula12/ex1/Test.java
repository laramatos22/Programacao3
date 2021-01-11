package aula12.ex1;

import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class Test {
	public static void main(String[] args) throws IOException{
		
		Set<String> differentWords = new HashSet<String>();
		String filename = "Policarpo.txt";
		lerFicheiro lf = new lerFicheiro(filename);
		System.out.println("Numero total de palavras: " + lf.palavras());
		System.out.println("Numero de diferentes palavras: " + lf.worddiferentes());
		System.out.println(lf.ToString());
	}
}
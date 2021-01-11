package aula12.ex1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
//import static java.lang.System.*;
import java.util.stream.Collectors;
public class lerFicheiro {
	
	private Map<String,Integer> wordcount; //key==string
	private int worddiferentes;
	private int palavras;
	
	public lerFicheiro(String nomefich) throws IOException{
		wordcount =new TreeMap<>();
		readword (nomefich);
		countword(nomefich);
	}
	
	public int worddiferentes() {
		return worddiferentes;
	}
	public int palavras() {
		return palavras;
	}
	
	public void readword(String name) throws IOException{
		List<String> lines = Files.readAllLines(Paths.get(name));
		lines.stream().flatMap(x->Arrays.stream(x.split(" "))).forEach(word->{
			if(wordcount.containsKey(word)) {
				wordcount.put(word, new Integer(wordcount.get(word)+1));
			}else {
				wordcount.put(word, new Integer(1) );
			}
		});
	}
	
	public void countword(String name) throws IOException{
		//@WarningsSuppress("unchecked");
		Set <String> differentWordsSet = new HashSet();
		List<String> lines = Files.readAllLines(Paths.get(name));
		lines.stream().flatMap(x->Arrays.stream(x.split(" "))).forEach(word ->{
			differentWordsSet.add(word);
			palavras++;
		});
		worddiferentes=differentWordsSet.size();
	}
	
	public void printinfor(String name) throws IOException{
		PrintWriter print = new PrintWriter(new File(name));
		for(String key : wordcount.keySet()) {
			print.println(ToString());
		}
		print.close();
	}	
	
	public String ToString() {
		return wordcount.keySet().stream().map(key -> key+"\t"+wordcount.get(key)).collect(Collectors.joining("\n"));
	}
}

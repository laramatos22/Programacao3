package aula7.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Companhias {
	
	
	private HashMap<String, Companhia> companhias;
	
	public Companhias(String companyFile) throws IOException {
		Path file = Paths.get(companyFile);
		List<String> lines = Files.readAllLines(file);
		companhias = new HashMap<>();
		
		for(String line : lines) {
			if(line.contentEquals("Sigla\tCompanhia")) {}
			else {
				String company[] = line.split("\t");
				companhias.put(company[0], new Companhia(company[0], company[1]));
			}
		}
		
	}
	
	public Companhia[] getCompanhias() {
		return (companhias.values()).toArray(new Companhia[companhias.size()]);
	}
	
	public Companhia siglaCompanhia(String sigla) {
		return companhias.get(sigla);
	}
	
}

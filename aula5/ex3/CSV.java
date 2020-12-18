package aula5.ex3;

import aula5.*;
import java.io.*;
import java.util.*;

/**CSV: Cada linha contém um registo e os campos estão delimitados pelo caracter
TAB (\t);*/

public class CSV implements TipoFicheiro {
	
	public Person[] InfoFromFile (String file) throws IOException {
		Scanner scFile = new Scanner(new File(file));
		scFile.nextLine();
		ArrayList<Person> list = new ArrayList<>();
		while(scFile.hasNextLine()) {
			String[] registo = scFile.nextLine().split("\t");
			System.out.println(registo.length);
			for(String r : registo) 
					System.out.println(r);
			String nome = registo[0];
			int numero = Integer.parseInt(registo[1]);
			String[] data = registo[2].split("/");
			list.add(new Person(nome, numero, new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]))));
		}
		scFile.close();
		return list.toArray(new Person[0]);
	}
	
	public void InfoToFile (String file, Person[] person) throws IOException {
		PrintWriter pf = new PrintWriter(new File(file));
		pf.println("CSV");
		for(Person pessoa : person) {
			pf.println(pessoa.Nome()+"\t"+pessoa.Numero()+"\t"+pessoa.Data());
		}
		pf.close();
	}

}

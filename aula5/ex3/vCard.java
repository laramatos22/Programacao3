package aula5.ex3;

import aula5.*;
import java.io.*;
import java.util.*;

/**vCard: Cada linha contém um registo e os campos estão delimitados pelo
caracter #;*/

public class vCard implements TipoFicheiro {
	
	public Person[] InfoFromFile (String file) throws IOException {
		Scanner scFile = new Scanner(new File(file));
		scFile.nextLine();
		ArrayList<Person> list = new ArrayList<>();
		while(scFile.hasNextLine()) {
			String[] registo = scFile.nextLine().split("#");
			String nome = registo[1];
			int numero = Integer.parseInt(registo[2]);
			String[] data = registo[3].split("/");
			list.add(new Person(nome, numero, new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]))));
		}
		scFile.close();
		return list.toArray(new Person[0]);
	}
	
	public void InfoToFile (String file, Person[] person) throws IOException {
		PrintWriter pf = new PrintWriter(new File(file));
		pf.println("vCard");
		for(Person pessoa : person) {
			pf.println("#"+pessoa.Nome()+"#"+pessoa.Numero()+"#"+pessoa.Data());
		}
		pf.close();
	}

}

package aula5.ex3;

import aula5.*;
import java.util.*;
import java.io.*;

/**Nokia: Cada linha contém um dos elementos de informação (i.e. um campo).
Existe uma linha em branco a separar cada registo;*/

public class Nokia implements TipoFicheiro {
	
	public Person[] InfoFromFile (String file) throws IOException {
		Scanner scFile = new Scanner(new File(file));
		scFile.nextLine();
		ArrayList<Person> list = new ArrayList<>();
		while(scFile.hasNextLine()) {
			String nome = scFile.nextLine();
			int numero = Integer.parseInt(scFile.nextLine());
			String[] data = scFile.nextLine().split("/");
			if(scFile.hasNextLine()) {
				scFile.nextLine();
			}
			list.add(new Person(nome, numero, new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]))));
		}
		scFile.close();
		return list.toArray(new Person[0]);
	}
	
	public void InfoToFile (String file, Person[] person) throws IOException {
		PrintWriter pf = new PrintWriter(new File(file));
		pf.println("Nokia");
		for(Person pessoa : person) {
			pf.println(pessoa.Nome());
			pf.println(pessoa.Numero());
			pf.println(pessoa.Data());
			
		}
		pf.close();
	}
	
}

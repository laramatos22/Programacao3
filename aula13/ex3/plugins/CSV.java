package aula13.ex3.plugins;

import java.io.*;
import java.util.*;

import aula13.ex3.Data;
import aula13.ex3.Pessoa;
import aula13.ex3.IPlugin;

public class CSV implements IPlugin {
	
	@Override
	public boolean verified(String name) {
		return "CSV".equalsIgnoreCase(name);
	}
	
	@Override
	public Pessoa[] InfoFromFile(String filename) throws IOException{
		Scanner sc = new Scanner(new File(filename));
		sc.nextLine();
		ArrayList<Pessoa> agenda = new ArrayList<>();
		while(sc.hasNextLine()) {
			String[] values = sc.nextLine().split("\t");
			String nome = values[0];
			int num = Integer.parseInt(values[1]);
			String d[] = values[2].split("/");
			Data date = new Data(Integer.parseInt(d[0]),Integer.parseInt(d[1]),Integer.parseInt(d[2]));
			agenda.add(new Pessoa(nome,num,date));
		}
		sc.close();
		return agenda.toArray(new Pessoa[0]);
	}
	
	@Override
	public void InfoToFile(String filename, Pessoa[] array) throws IOException{
		PrintWriter pw = new PrintWriter(new File(filename));
		pw.println("CSV");
		for(Pessoa p : array) {
			pw.println(p.nome() + "\t" + p.cc() + "\t" + p.dataNasc());
		}
		pw.close();
	}
}
package aula13.ex3.plugins;

import java.io.*;
import java.util.*;

import aula13.ex3.Data;
import aula13.ex3.Pessoa;
import aula13.ex3.IPlugin;

public class vCard implements IPlugin {
	
	@Override
	public boolean verified(String name) {
		return "vCard".equalsIgnoreCase(name);
	}
		
	
	@Override
	public Pessoa[] InfoFromFile(String filename) throws IOException{
		Scanner sc = new Scanner(new File(filename));
		sc.nextLine();
		ArrayList<Pessoa> agenda = new ArrayList<>();
		while(sc.hasNextLine()) {
			String[] values = sc.nextLine().split("#");
			String nome = values[1];
			int num = Integer.parseInt(values[2]);
			String d[] = values[3].split("/");
			Data date = new Data(Integer.parseInt(d[0]),Integer.parseInt(d[1]),Integer.parseInt(d[2]));
			agenda.add(new Pessoa(nome,num,date));
		}
		sc.close();
		return agenda.toArray(new Pessoa[0]);
	}
	
	@Override
	public void InfoToFile(String filename, Pessoa[] array) throws IOException{
		PrintWriter pw = new PrintWriter(new File(filename));
		pw.println("vCard");
		for(Pessoa p : array) {
			pw.println("#" + p.nome() + "#" + p.cc() + "#" + p.dataNasc());
		}
		pw.close();
	}
}

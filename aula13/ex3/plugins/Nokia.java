package aula13.ex3.plugins;

import java.io.*;
import java.util.*;

import aula13.ex3.Data;
import aula13.ex3.Pessoa;
import aula13.ex3.IPlugin;

public class Nokia implements IPlugin{
	
	@Override
	public boolean verified(String name) {
		return "Nokia".equalsIgnoreCase(name);
	}	
	
	@Override
	public Pessoa[] InfoFromFile(String filename) throws IOException{
		Scanner sc = new Scanner(new File(filename));
		sc.nextLine();
		ArrayList<Pessoa> agenda = new ArrayList<>();
		while(sc.hasNextLine()) {
			String nome = sc.nextLine();
			int num = Integer.parseInt(sc.nextLine());
			String d[] = sc.nextLine().split("/");
			Data date = new Data(Integer.parseInt(d[0]),Integer.parseInt(d[1]),Integer.parseInt(d[2]));
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			agenda.add(new Pessoa(nome,num,date));
		}
		sc.close();
		return agenda.toArray(new Pessoa[0]);
	}
	
	@Override
	public void InfoToFile(String filename, Pessoa[] array) throws IOException{
		PrintWriter pw = new PrintWriter(new File(filename));
		pw.println("Nokia");
		for(Pessoa p : array) {
			pw.println(p.nome());
			pw.println(p.cc());
			pw.println(p.dataNasc());
		}
		pw.close();
	}
}

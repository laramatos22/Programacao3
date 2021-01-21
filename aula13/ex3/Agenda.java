package aula13.ex3;

import java.util.*;
import java.io.*;

abstract class PluginManager {
	//@SuppressWarnings("deprecation")
	public static IPlugin load(String name) throws Exception {
		Class<?> c = Class. forName (name);
		return (IPlugin) c.newInstance();
	}
}

public class Agenda {

	private ArrayList<Pessoa> agenda = new ArrayList<>(); 
	
	public void AgendafromFile(String filename) throws IOException{
		File types = new File("src/aula13/plugins");
		ArrayList<IPlugin> plugins = new ArrayList<IPlugin>();
		for(String f : types.list()) {
			try {
				plugins.add(PluginManager.load("aula13.plugins." + f.substring(0,f.lastIndexOf('.'))));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		Scanner s = new Scanner(new File(filename));
		String ff = s.nextLine();
		s.close();
		IPlugin on = null;
		for(IPlugin atual : plugins) {
			if(atual.verified(ff)){
				on = atual;
			}
		}
		addContacto(on.InfoFromFile(filename));
	}
	
	public void AgendaToFile(String filename, IPlugin f) throws IOException{
		f.InfoToFile(filename, agenda.toArray(new Pessoa[0]));
	}
	
	public void addContacto(Pessoa[] array) {
		for(Pessoa p : array) {
			agenda.add(p);
		}
	}
	
	public void removeContacto(Pessoa p) {
		if (agenda.contains(p)) {
			agenda.remove(p);
		}
		else {
			System.out.println("Contacto inválido. Não removido.");
		}
	}
	
	public int size() {
		return agenda.size();
	}
	
	@Override
	public String toString() {
		return agenda.toString();
	}
	
}
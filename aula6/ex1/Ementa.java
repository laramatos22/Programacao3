package aula6.ex1;

import java.util.*;
import java.io.*;

/**Ementa – tem um nome (String), um local (String) e uma lista de pratos
associados a cada dia da semana. Este devem ser mantidos ordenados por dia.*/

public class Ementa {
	private String nome;
	private String local;
	private HashMap<DiaSemana,LinkedList<Prato>> f;
	
	public Ementa(String nome, String local) {
		this.nome=nome;
		this.local=local;
		f = new HashMap<DiaSemana,LinkedList<Prato>>();
	}
	
	public void addPrato(Prato p, DiaSemana d) {
		if(f.containsKey(d))
			f.get(d).add(p);
		else {
			LinkedList<Prato> temp = new LinkedList<Prato>();
			temp.add(p);
			f.put(d, temp);
		}
	}
	
	public void toFile() throws IOException{
		PrintWriter pw = new PrintWriter(new File("/home/laramatos/Documentos/P3/src/aula6/ex1/ementa.txt"));
		pw.print(this);
		pw.close();
	}
	
	@Override
	public String toString() {
		String s = "";
		DiaSemana[] dd = f.keySet().toArray(new DiaSemana[0]);
		Arrays.sort(dd);
		for (DiaSemana dp : dd) {
			s += dp + ": \n";
			for (int i = 0; i < f.get(dp).size(); i++) {
				s += f.get(dp).get(i).toString()  + " \n"; 
			}
		}
		return s;
	}

	public String getNome() {
		return nome;
	}

	public String getLocal() {
		return local;
	}
}

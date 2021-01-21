package aula13.ex3;

import java.io.*;

import aula13.ex3.plugins.CSV;
import aula13.ex3.plugins.Nokia;
import aula13.ex3.plugins.vCard;

public class Test_ex3 {
	
	public static void main(String[] args) throws IOException {
		Agenda agenda = new Agenda();
		
		System.out.println("Teste do Nokia");
		agenda.AgendafromFile("File1.txt");
		agenda.addContacto(new Pessoa[] {new Pessoa("Jorge Sousa Almeida",911593233, new Data(1,12,1994))});
		agenda.AgendaToFile("output1.txt", new Nokia());
		System.out.println("A agenda #1 tem "+agenda.size()+" contactos:");
		System.out.println(agenda);
		System.out.println();
		
		System.out.println("Teste do vCard"); 
		agenda = new Agenda();
		agenda.AgendafromFile("File2.txt");
		agenda.addContacto(new Pessoa[] {
				new Pessoa("Miguel Costa Oliveira",911592222, new Data(5,3,1933)),
				new Pessoa("Joana Santos Martins",912324541, new Data(4,4,2001)),
				new Pessoa("Bruna Marques Silva ",932443232, new Data(11,5,1982)),
				new Pessoa("João Rodrigues Santos",931533222, new Data(12,3,1943)),
		});
		agenda.addContacto(new Pessoa[] {new Pessoa("Tiago Marques Pereira",924543211, new Data(1,12,1974))});
		agenda.AgendaToFile("output2.txt",new vCard());
		System.out.println("A agenda #2 tem "+agenda.size()+" contactos:");
		System.out.println(agenda);
		System.out.println();
		
		System.out.println("Teste do CSV"); 
				agenda = new Agenda();
				agenda.AgendafromFile("File3.txt");
				agenda.addContacto(new Pessoa[] {
						new Pessoa("Ana Miguel Costa",913533433, new Data(14,12,1999)),
						new Pessoa("Paulo Oliveira Santos",931523133, new Data(1,2,1993))});
				agenda.AgendaToFile("output3.txt", new CSV());
				System.out.println("A agenda #3 tem "+agenda.size()+" contactos:");
				System.out.println(agenda);
				System.out.println();		
	}

}

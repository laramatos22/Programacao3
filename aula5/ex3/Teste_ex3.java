package aula5.ex3;

//import java.util.*;
import java.io.*;
import aula5.*;

public class Teste_ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Agenda agenda = new Agenda();
		
		
		System.out.println("TESTE CLASS NOKIA");
		
		agenda.adicionar("/home/laramatos/Documentos/P3/src/aula5/ex3/File1.txt");
		agenda.adicionarContacto(new Person[] {new Person("Lara", 123456789, new Data(06,11,2020))});
		agenda.escrever("/home/laramatos/Documentos/P3/src/aula5/ex3/File1_1.txt", new Nokia());
		System.out.println("A agenda 1 tem " + agenda.sizeContactos() +" contactos: ");
		System.out.println(agenda);
		System.out.println();
		
		
		System.out.println("TESTE CLASS vCARD");
		
		agenda.adicionar("/home/laramatos/Documentos/P3/src/aula5/ex3/File2.txt");
		agenda.adicionarContacto(new Person[] {
				new Person("António", 123459876, new Data(10, 03, 1971)),
				new Person("Paulo", 987654321, new Data(25, 12, 2020)),
				new Person("Bernardo", 546372819, new Data(04, 04, 2019)),
		});
		agenda.escrever("/home/laramatos/Documentos/P3/src/aula5/ex3/File2_2.txt", new vCard());
		System.out.println("A agenda 2 tem " + agenda.sizeContactos() +" contactos: ");
		System.out.println(agenda);
		System.out.println();		
		
		
		System.out.println("TESTE CLASS CSV");
		
		agenda.adicionar("/home/laramatos/Documentos/P3/src/aula5/ex3/File3.txt");
		agenda.adicionarContacto(new Person[] {
				new Person("Beatriz", 1987612345, new Data(22, 11, 2000)),
				new Person("Maria", 981276345, new Data(07, 01, 2006)),
				});
		agenda.escrever("/home/laramatos/Documentos/P3/src/aula5/ex3/File3_3.txt", new CSV());
		System.out.println("A agenda 3 tem " + agenda.sizeContactos() + " contactos: ");
		System.out.println(agenda);
		System.out.println();
		
	}

}

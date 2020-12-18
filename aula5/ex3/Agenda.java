package aula5.ex3;

import aula5.*;

import java.util.*;
import java.io.*;

/**Utilizando o programa desenvolvido nas aulas anteriores relativamente à  Agenda de
Contactos (Pessoas), acrescente-lhe a capacidade de guardar e carregar uma agenda de
um ficheiro de texto.*/

public class Agenda {
	
	private ArrayList<Person> agenda = new ArrayList<>();
	private CSV csv;
	private vCard card;
	private Nokia nokia;
	
	public void adicionar(String fileName) throws IOException {
		System.out.println(fileName);
		File f = new File(fileName);
		System.out.println(f.getAbsolutePath());
		Scanner sc = new Scanner(f);
		String name = sc.nextLine();
		sc.close();
		
		if(name.equals("CSV"))  setCSV(new CSV());
		else if(name.equals("vCard")) setvCard(new vCard());
		else if(name.equals("Nokia")) setNokia(new Nokia());
	}
	
	public void escrever (String fileName, TipoFicheiro tipo) throws IOException {
		tipo.InfoToFile(fileName, agenda.toArray(new Person[0]));
	}
	
	public void adicionarContacto(Person[] person) {
		for(Person pessoa : person)
			agenda.add(pessoa);
	}
	
	public void removerContacto(Person person) {
		if(!agenda.contains(person))
			System.out.println("Pessoa não se encontra na lista");
		agenda.remove(person);
	}
	
	public int sizeContactos() {
		return agenda.size();
	}
	
	public String toString() {
		return agenda.toString();
	}

	public CSV getCSV() {return csv;}
	public void setCSV(CSV csv) {this.csv = csv;}

	public vCard getCard() {return card;}
	public void setvCard(vCard card) {this.card = card;}

	public Nokia getNokia() {return nokia;}
	public void setNokia(Nokia nokia) {this.nokia = nokia;}	

}

package aula1;

import java.util.*;

public class Prob12 {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList para lista de pessoas
		ArrayList<Person> pessoa = new ArrayList<Person>();
		
		while(true) {
			menu(pessoa);
		}
	}
	
	public static void menu (ArrayList<Person> pessoa) {
		int op = -1;
		//Apresentação do menu
		System.out.println("Menu:");
		System.out.println("1- Introduzir nova pessoa na lista");
		System.out.println("2- Apagar pessoa existente na lista");
		System.out.println("3- Apresentar a lista completa");
		System.out.println("4- Ordenar a lista por nomes");
		System.out.println("5- Ordenar a lista por CC");
		System.out.println("6- Sair do programa");
		
			try {
				System.out.print("Opção -> ");
				op = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("A opção tem que ser um número!");
				System.out.print("Opção -> ");
				op = sc.nextInt();
				sc.nextLine();
			}
		
		if(op == 1) {addPerson(pessoa);}
		else if(op == 2) {deletePerson(pessoa);}
		else if(op == 3) {printList(pessoa);}
		else if(op == 4) {sortByNames(pessoa);}
		else if(op == 5) {sortByCC(pessoa);}
		else if(op == 6) System.exit(1);

		
		
	}
	
	//ADICIONAR NOVA PESSOA À LISTA
	public static void addPerson (ArrayList<Person> pessoa) {
		System.out.print("Introduzir nome da pessoa: ");
		String name = sc.nextLine();
		System.out.print("Introduzir número cartão de cidadão: ");
		int cc;
		do {
			try {
				cc = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Número de cartão de cidadão inválido!");
				System.out.print("Introduza novamente: ");
				cc = sc.nextInt();
				sc.nextLine();
			}
		} while (true);
		
		System.out.print("Introduzir data de nascimento: ");
		Data dataNasc;
		do {
			try {
				int dia = sc.nextInt();
				int mes = sc.nextInt();
				int ano = sc.nextInt();
				
				dataNasc = new Data(dia, mes, ano);
				break;
			} catch(InputMismatchException e) {
				System.out.println("Data de nascimento inválida!");
				System.out.print("Introduza novamente: ");
				sc.nextLine();
			}
		} while (true);
		
		Person newPerson = new Person (name, cc, dataNasc);
		pessoa.add(newPerson);
		
	}
	
	//APAGAR PESSOA EXISTENTE NA LISTA
	public static void deletePerson (ArrayList<Person> pessoa) {
		System.out.print("Indicar índice da pessoa que quer apagar: ");
		int indice = sc.nextInt();
		pessoa.remove(indice);
		sc.nextLine();
	}
	
	//APRESENTAR LISTA COMPLETA
	public static void printList (ArrayList<Person> pessoa) {
		System.out.println("índice | ");
		for (int i=0; i<pessoa.size(); i++) {
			System.out.printf("%d     | %s\n", i, pessoa.get(i).toString());
		}
		System.out.println();
	}
	
	//ORDENAÇÃO POR NOMES
	public static void sortByNames (ArrayList<Person> pessoa) {
		//arrayList temporária
		ArrayList<Person> temp = new ArrayList<Person>();
		
		//array de Strings (nomes das pessoas)
		String[] names = new String[pessoa.size()];
		
		for (int i = 0; i < names.length; i++) {
			names[i] = pessoa.get(i).Nome();
		}
		
		//ordenação
		Arrays.sort(names);
		for(int i=0; i < names.length; i++) {
			for (int j=0; j< pessoa.size(); j++) {
				if (pessoa.get(j).Nome().equals(names[i])) {
					temp.add(pessoa.get(j));
				}
			}
		}
		pessoa.removeAll(pessoa); //remove todos os elementos da lista pessoa
		pessoa.addAll(temp); //adiciona à lista pessoa os elementos da lista temporária temp já ordenados
	}
	
	//ORDENAÇÃO POR CC
		public static void sortByCC (ArrayList<Person> pessoa) {
			//arrayList temporária
			ArrayList<Person> temp = new ArrayList<Person>();
			
			//array de ints (nnº de cartoes de cidadao)
			int[] cc = new int[pessoa.size()];
			
			for (int i = 0; i < cc.length; i++) {
				cc[i] = pessoa.get(i).CartaoCidadao();
			}
			
			//ordenação
			Arrays.sort(cc);
			for(int i=0; i < cc.length; i++) {
				for (int j=0; j< pessoa.size(); j++) {
					if (pessoa.get(j).CartaoCidadao() == cc[i]) {
						temp.add(pessoa.get(j));
					}
				}
			}
			pessoa.removeAll(pessoa); //remove todos os elementos da lista pessoa
			pessoa.addAll(temp); //adiciona à lista pessoa os elementos da lista temporária temp já ordenados
		}

}

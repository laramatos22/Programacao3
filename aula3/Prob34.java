package aula3;

import java.util.*;

public class Prob34 {
	
	static VideoClub club = new VideoClub(5); 	//N=5
												//Cada cliente pode requisitar até um máximo de 5 vídeos 
	static Scanner sc = new Scanner (System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			int opcao = -1;
			System.out.println();
			System.out.println("!!!VideoClube!!!");
			System.out.println();
			System.out.println("1 - Introduzir cliente ");
			System.out.println("2 - Remover cliente ");
			System.out.println("3 - Listar filmes por cliente ");
			System.out.println("4 - Histórico de filmes do cliente ");
			System.out.println("5 - Introduzir filme ");
			System.out.println("6 - Remover filme");
			System.out.println("7 - Verificar a disponibilidade");
			System.out.println("8 - Efetuar empréstimo");
			System.out.println("9 - Efetuar devolução");
			System.out.println("10 - Listar filmes (catálogo)");
			System.out.println("11 - Listar filmes por rating");
			System.out.println("0 - Sair do programa ");
			System.out.println();
			System.out.print("Opção: ");
			try {
				opcao = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				erro();
			}
			
			if (opcao == 1) addClient();
			else if(opcao == 2) removeClient();
			else if(opcao == 3) printClientCurrentlyVideo();
			else if(opcao == 4) printClientVideoHistory();
			else if(opcao == 5) addVideo();
			else if(opcao == 6) removeVideo();
			else if(opcao == 7) avaliar();
			else if(opcao == 8) requisitarVideo();
			else if(opcao == 9) devolverVideo();
			else if(opcao == 10) printVideoCatalog();
			else if(opcao == 11) printCatalogWithRating();
			else if(opcao == 0) break;
			else erro();
		}
		
	}
	
	//Adicionar cliente
	public static void addClient () {
		//Tipo de cliente
		System.out.println("1- Estudante | 2- Funcionário");
		System.out.println("Tipo de cliente: ");
		int tipo = Integer.parseInt(sc.nextLine());
		
		//Nome do cliente
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		//Nº CC
		System.out.print("Número de CC: ");
		int cc = Integer.parseInt(sc.nextLine());
		
		//data de nascimento
		System.out.print("Data de Nascimento (dia-mes-ano): ");
		String[] data = sc.nextLine().split("-");
		int dia = Integer.parseInt(data[0]);
		int mes = Integer.parseInt(data[1]);
		int ano = Integer.parseInt(data[2]);
		
		//Outros dados dependendo do tipo de cliente
		if (tipo == 1) {
			//Número Mecanográfico do estudante
			System.out.print("Número Mecanográfico: ");
			int nmec = Integer.parseInt(sc.nextLine());
			
			//Curso que o estudante frequenta
			System.out.print("Curso: ");
			int course = Integer.parseInt(sc.nextLine());
			
			club.addClient(new Students(name, cc, new Data(dia, mes, ano), nmec, course));
		}
		else if (tipo == 2) {
			System.out.print("Número de Funcionário: ");
			int numFunc = Integer.parseInt(sc.nextLine());
			
			System.out.print("Número Fiscal: ");
			int numFiscal = Integer.parseInt(sc.nextLine());
			
			club.addClient(new Workers(name, cc, new Data(dia, mes, ano), numFunc, numFiscal));
		}
		System.out.println("Cliente adicionado com sucesso!!");
	}
	
	//Remover Cliente
	private static void removeClient() {
		System.out.print("Introduzir nº de Cliente: ");
		club.removeClient(Integer.parseInt(sc.nextLine()));
	}
	
	//Lista de Videos que o cliente tem atualmente
	private static void printClientCurrentlyVideo () {
		System.out.print("Introduzir nº de Cliente");
		club.printClientVideos(Integer.parseInt(sc.nextLine()));
	}
	
	//Lista do Historial de vídeos que o cliente já teve na sua posse
	private static void printClientVideoHistory() {
		System.out.print("Introduzir nº de Cliente");
		club.printClientVideoHistory(Integer.parseInt(sc.nextLine()));
	}
	
	//Adicionar vídeo
	private static void addVideo() {
		System.out.print("Título: ");
		String titulo = sc.nextLine();
		System.out.print("Categoria: ");
		String categoria = sc.nextLine();
		System.out.print("Idade: ");
		String idade = sc.nextLine();
		club.addVideo(titulo, categoria, idade);
		System.out.println("Vídeo adicionado com sucesso!!");
	}
	
	//Remover vídeo
	private static void removeVideo() {
		System.out.print("Introduzir videoID: ");
		club.removeVideo(Integer.parseInt(sc.nextLine()));
	}
	
	//Verificar se o vídeo está disponível
	private static void avaliar() {
		System.out.print("Introduzir videoID: ");
		club.checkIfIsAvailabe(Integer.parseInt(sc.nextLine()));
	}
	
	//Requisitar um vídeo
	private static void requisitarVideo() {
		System.out.print("Introduzir VideoID: ");
		int videoID = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzir ClientID: ");
		int clientID = Integer.parseInt(sc.nextLine());
		club.emprestVideo(videoID, clientID);
	}
	
	//Devolver um vídeo
	private static void devolverVideo() {
		System.out.print("Introduzir videoID: ");
		int videoID = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzir clientID: ");
		int clientID = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzir Rating (0-10): ");
		int rating = Integer.parseInt(sc.nextLine());
		if(rating < 0 || rating > 10) {
			erro();
			return;
		}
		club.devolveVideo(videoID, clientID, rating);
	}
	
	//Print Catálogo de Videos do VideoClube
	private static void printVideoCatalog () {
		club.printVideosCatalog();
	}
	
	//Print Catálogo de vídeos com rating
	private static void printCatalogWithRating() {
		club.printCalalogWithRating();
	}
	
	//Erro
	private static void erro() {
		System.out.println("Número inválido!");
		System.exit(1);
	}

}
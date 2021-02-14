package ap2020;

import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;


//Notas:
//Não altere o código apresentado na main e alinea1
//Deve completar o código da alinea2
//Comente o código com erros para garantir que vai executando parcialmente

public class P3_20 { 

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Biblioteca central = new Biblioteca("Central UA");
		PrintStream fl = new PrintStream(new File("p3_2021.txt"));
		alinea1(central, System.out); // executa e escreve na consola
		alinea2(central, fl); // executa e escreve no ficheiro
		fl.close();
	}

	public static void alinea1(Biblioteca b, PrintStream out) {
		out.println("\nAlínea 1) ----------------------------------");
		
		// Utilizador: Nome, NMEC, data de inscrição
		Utilizador u1 = new Professor("Maria Santos", 2455, LocalDate.of(2019, 3, 10)); 
		Utilizador u2 = new Professor("Martim Gomes", 3180, LocalDate.of(2019, 1, 17));
		Utilizador u3 = new Aluno("Tiago Teixeira", 11141, LocalDate.of(2020, 2, 1));
		Utilizador u4 = new AlunoPosGrad("Carolina Moreira", 7421, LocalDate.of(2019, 11, 12));
		Utilizador u5 = new Aluno("Francisco Mendes", 11720, LocalDate.now());
		
		System.out.print("Utilizadores: ");
		System.out.print(b.novoUtilizador(u1) + ", ");  		// true
		System.out.print(b.novoUtilizador(u2) + ", ");  		// true
		System.out.print(b.novoUtilizador(u3) + ", ");  		// true
		System.out.print(b.novoUtilizador(u4) + ", ");  		// true
		System.out.print(b.novoUtilizador(u5) + ", ");  		// true
		System.out.print(b.novoUtilizador(
				new Professor("Maria J Santos", 2455, LocalDate.of(2021, 2, 01))) + "\n");  		
																// false, utilizador já existe (NMEC!)
		
		// Item: ISBN, Titulo, prazo máximo de empréstimo em dias (default=7), número de cópias (default=1)
		Item[] items = { new Item("978-0134685991", "Effective Java", 10, 3),  
				new Item("978-0596009205", "Head First Java"),
				new Item("978-0131872486", "Thinking in Java", 5, 2),
				new Item("978-0321563842", "The C++ Programming Language")};
		
		for (Item item : items) 
			b.novoItem(item);

		// Empréstimos efetuados no dia 01/02/2021
		System.out.print("Empréstimos: ");
		System.out.print(b.empresta(items[0], u1, LocalDate.of(2021, 2, 1)) + ", ");  	// true
		System.out.print(b.empresta(items[1], u3, LocalDate.of(2021, 2, 1)) + ", ");  	// true
		System.out.print(b.empresta(items[1], u2, LocalDate.of(2021, 2, 1)) + ", ");  	// false, não há mais cópias disponíveis
		System.out.print(b.empresta(items[2], u3, LocalDate.of(2021, 2, 1)) + ", ");  	// true
		System.out.print(b.empresta(items[3], u3, LocalDate.of(2021, 2, 1)) + ", ");  	// false, atingiu número máximo de empréstimos
		System.out.print(b.devolve(items[1], u3) + ", ");  								// true
		System.out.print(b.empresta(items[3], u3, LocalDate.of(2021, 2, 1)) + ", ");  	// true
		System.out.print(b.empresta("978-0131872486", 1111) + "\n");  					// false, utilizador não existe
		
		System.out.println("\n-------- Listagem de utilizadores --------");
		System.out.println("----- ordenados por data de inscrição -----");
		for (Iterator<Utilizador> ri = b.iterator(); ri.hasNext();)
			System.out.println(ri.next());

	}
	
	private static void alinea2(Biblioteca b, PrintStream out) throws IOException {
		// Adicione a seguir o código necessário para ler e processar o ficheiro com os registos, empréstimos e devoluções (usar java streams)
        
		
        // Adicione a seguir o código necessário para escrever para ficheiro a lista de utilizadores com devoluções em atraso (usar java streams)
		out.println("----- Utilizadores com devoluções em atraso -----");
	
		
        // Adicione a seguir o código necessário para escrever para ficheiro os empréstimos ativos (incluindo em atraso) por alunos (usar java streams)
		out.println("\n----- Empréstimos ativos a estudantes -----");
		
	}
}

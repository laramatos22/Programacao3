import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class mainBanco { 	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Banco obanco = new Banco("PeDeMeia");
		PrintStream fl = new PrintStream(new File("resources/p3_1920P.txt"));
		alinea1(obanco, System.out); // executa e escreve na consola
		alinea2(obanco, fl); // executa e escreve no ficheiro
		fl.close();
	}

	public static void alinea1(Banco b, PrintStream out) {
		out.println("\nAl�nea 1) ----------------------------------\n");
		
		Cliente c1 = new ClienteParticular("Manuel Lima", "281656798", TipoCliente.Balcao); 
		Cliente c2 = new ClienteParticular("Paula Marques", "301317832", TipoCliente.Balcao, "234500232" );
		Cliente c3 = new ClienteParticular("Jos� Bento", "224456720", TipoCliente.Online, "234630535" );
		Cliente c4 = new ClienteEmpresa("Lima & Irmao", "509434438", TipoCliente.Balcao, c1);
		Cliente c5 = new ClienteEmpresa("Reboques Tudo o Bento Leva", "509782153", TipoCliente.Online, c3);
		
		//Conta bad = new eConta(c1); 							// Gera uma Excep��o
		Conta contas[] = {	new Conta(c1), 	new Conta(c2),  new eConta(c3),  new Conta(c4),  new eConta(c5) };
		System.out.print(b.add(contas[0]) + ", ");  		// true
		System.out.print(b.add(contas[1]) + ", ");  		// true
		System.out.print(b.add(contas[2]) + ", ");  		// true
		System.out.print(b.add(contas[3]) + ", ");  		// true
		System.out.print(b.add(contas[4]) + ", ");  		// true
		System.out.print(b.add(contas[1]) + "\n");  		// false
		
		contas[0].add(new Credito(1000, "20191231"));
		contas[1].add(new Credito(2000, "20191231"));
		contas[2].add(new Credito(1400, "20191231"));
		contas[3].add(new Credito(4000, "20191231"));
		
		System.out.println("\n----- Listagem de contas -----");
		for (Iterator<Conta> ri = b.iterator(); ri.hasNext();)
			System.out.println(ri.next());	

	}
	
	private static void alinea2(Banco b, PrintStream out) throws IOException {
		// Adicione a seguir o c�digo necess�rio para ler e processar o ficheiro com os movimentos de conta (usar java streams)

        
        // Adicione a seguir o c�digo necess�rio para escrever para ficheiro a lista de contas com saldo negativo (usar java streams)
		out.println("----- Contas com saldo negativo -----");

		
        // Adicione a seguir o c�digo necess�rio para escrever para ficheiro o saldo total das contas eletr�nicas (usar java streams)
		out.println("\n----- Saldo total das contas eletr�nicas -----");


	}
}

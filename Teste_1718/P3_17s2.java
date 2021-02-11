import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;


// Notas:
// N�o altere o c�digo apresentado
// Deve completar o c�digo da alinea 2
// Comentar c�digo para garantir que vai executando parcialmente

public class P3_17s2 {

	public static void main(String[] args) throws IOException
	{
		PrintStream fl = new PrintStream(new File("p3_17s2.txt"));
		test(System.out); // executa e escreve na consola
		test(fl); // executa e escreve no ficheiro
		fl.close();
	}

	private static void test(PrintStream out) throws IOException
	{
		alinea1(out);
		alinea2(out);
	}

	private static void alinea1(PrintStream out) {
		out.println("\nAl�nea 1) ----------------------------------\n");

		Feira bf = new Feira("Feirada", "DETI");

		Taberna exp1 = new Taberna(102, "BoasPingas");
		exp1.add(new Bebida("SoTinto", 13.5, Bebida.TipoBebida.VINHO));
		exp1.add(new Bebida("SoSumo", 0, Bebida.TipoBebida.SUMO));
		exp1.add(new Bebida("SoFino", 6.3 , Bebida.TipoBebida.CERVEJA));
		for (Bebida c : exp1.getBebidas())
			out.println(c);
		out.println();
		
		List<Bebida> lista = new ArrayList<>();
		lista.add(new Bebida("CristalDaRia", 0, Bebida.TipoBebida.AGUA));
		lista.add(new Bebida("Laranjada", 0, Bebida.TipoBebida.SUMO));
		lista.add(new Bebida("IPA", 6.5, Bebida.TipoBebida.CERVEJA));
		Taberna exp2 = new Taberna(100, "Malandra", lista);

		Tasquinha pst1 = new Tasquinha(201, "DeLeit�o", new String[] {"Sandocha", "PicaPica"} );
		Tasquinha pst2 = new Tasquinha(202, "Franganito", new String[] {"Passarinho", "Amburguere"} );
		
		bf.addTenda(exp1); 
		bf.addTenda(exp2); 
		bf.addTenda(pst1); 
		bf.addTenda(pst2);

		bf.addVisitante(new Visitante("20171219:15:30")); 
		bf.addVisitante(new Visitante("20171219:15:30")); 
		bf.addVisitante(new Visitante("20171219:15:31")); 
		bf.addVisitante(new Visitante("20171219:15:31")); 
		bf.addVisitante(new Visitante("20171219:15:31")); 
		
		out.println("Produtos de " + exp1.getNome() + ": " + exp1.opcoes());
		out.println("Produtos de " + pst1.getNome() + ": " + bf.getProductsFrom(pst1));
		out.println();
		
		out.println(bf);
		
		out.println(bf.getBeerByType(Bebida.TipoBebida.CERVEJA)); // devolve uma lista ordenada por teor alco�lico 
	}

	private static void alinea2(PrintStream out) throws IOException
	{
		out.println("\nAl�nea 2) ----------------------------------\n");
		Feira fest = null;
		// Adicione a seguir o c�digo necess�rio para a leitura do ficheiro 
		Path file = Paths.get("uafest.txt");
		List<String> lines = Files.readAllLines(file);
		int i = 0;
		for (String linha : lines)
		{
			String toFest[] = linha.trim().split(";");
			if (i == 0)
				fest = new Feira(toFest[0], toFest[1]);
			else
			{
				if (toFest[0].equals("1"))
				{
					try
					{
						fest.addTenda(new Taberna(Integer.parseInt(toFest[1]), toFest[2]));
					}
					catch (NumberFormatException e)
					{
						System.out.println("Erro no ficheiro");
					}
				}
				else if (toFest[0].equals("2"))
				{
					try
					{
						String comes[] = new String[toFest.length - 3];
						for (int j = 0; j < toFest.length-3; j++)
							comes[j] = toFest[j + 3];
						fest.addTenda(new Tasquinha(Integer.parseInt(toFest[1]), toFest[2], comes));
					}
					catch (NumberFormatException e)
					{
						System.out.println("Erro no ficheiro");
					}
				}
				else if (toFest[0].equals("3"))
				{
					try
					{
						fest.addVisitante(new Visitante(toFest[1]));
					}
					catch (NumberFormatException e)
					{
						System.out.println("Erro no ficheiro");
					}
				}
				else
					System.out.println("Digito desconhecido");
			}
			i++;
		}

        // n�o modifique o metodo a partir daqui
		if (fest != null) {
			out.println(fest);
			out.println("-- Outras informa��es --");
			out.println(fest.totalExpositores("Tasquinha") + " Tasquinhas");
			out.println(fest.totalExpositores("Taberna") + " Tabernas");
		}
	}
}

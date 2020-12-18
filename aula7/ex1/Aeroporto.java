package aula7.ex1;

import java.util.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import static java.lang.System.*;

public class Aeroporto {
	
	private ArrayList<Voo> voos;
	private Companhias companhias;
	private PrintStream writer;
	
	public Aeroporto(String fly, String companies) throws IOException {
		
		//companhias
		companhias = new Companhias(companies);
		
		//voos
		Path file = Paths.get(fly);
		List<String> lines = Files.readAllLines(file);
		voos = new ArrayList<>();
		
		for(String line : lines) {
			if(line.equals("Hora\tVoo\tOrigem\tAtraso")) {}
			else {
				String[] comp = line.split("\t");
				String company = comp[1].substring(0, 2);
				
				try {
					voos.add(new Voo(comp[0], comp[1], companhias.getCompanhias(), comp[2], comp[3]));
				}
				catch(NumberFormatException e) {
					out.println("Hora Mal Formatada!");
				}
				catch(ArrayIndexOutOfBoundsException e) {
					voos.add(new Voo(comp[0], comp[1], companhias.getCompanhias(), comp[2]));
				}
				catch(NullPointerException e) {
					out.println(company);
					out.println("Esta companhia não está registada!");
				}
			}
		}
	}
	
	public void printFicheiro() {
		out.println("Hora\tVoo\tCompanhia\tOrigem\tAtraso\tObservações");
		for(Voo fly : voos) {
			try {
				out.print(fly.toString());
			}
			catch(NullPointerException e) {
				out.println("Má formatação dos dados!");
			}
			
		}
	}
	
	public void saveFile() throws IOException {
		List<String> lines = new ArrayList<>();
		Path fileOut = Paths.get("Infopublic.txt");
		lines.add("Hora\tVoo\tCompanhia\tOrigem\tAtraso\tOBS\n");
		
		for(Voo fly : voos) {
			try {
				lines.add(fly.toString());
			}
			catch(NullPointerException e) {
				out.println("Má formatação dos dados!");
			}
		}
		
		Charset charset = Charset.forName("US-ASCII");
				
		try (BufferedWriter writer = Files.newBufferedWriter(fileOut, charset)) 
		{
			for(String s : lines) {
				writer.write(s, 0, s.length());
			}
		} 
		catch (IOException x) 
		{
			System.err.format("IOException: %s%n", x);
		}
		
		
		
	}
	
	public ArrayList<Voo> Voos() {
		return voos;
	}
	
	public void printMediaAtrasos() {
		Hashtable<Companhia, Integer> atrasos = new Hashtable<>();
		out.println("\nCompanhia\tAtraso médio");
		
		Companhia comps[] = companhias.getCompanhias();
		
		//sum=soma dos atrasos todos
		//count=contador dos atrasos
		int sum, count;
		
		for(Companhia companhia : comps) {
			sum = 0;
			count = 0;
			
			for(Voo fly : voos) {
				try {
					if(fly.getCompanhia().equals(companhia)) {
						sum += fly.getAtraso().getTempoMinutos();
						count++;
					}
				}
				catch(NullPointerException e) {
					out.println("Má formatação dos dados!");
				}
				
				atrasos.put(companhia, sum/count);
				
			}
		}
		
		for(Companhia companhia1 : comps) {
			out.println(companhia1.toString()+"\t"+Hora.minsToHourString(atrasos.get(companhia1)));
		}
		
	}
	
	public void saveCidadeOrigem() throws IOException {
		
		Hashtable<String, Integer> origens = new Hashtable<>();
		List<String> lines = new ArrayList<>();
		lines.add("Origem\tVoos\n");
		
		for(Voo fly : voos) {
			if(origens.containsKey(fly.getOrigem())) {
				origens.replace(fly.getOrigem(), origens.get(fly.getOrigem())+1);
			} else {
				origens.put(fly.getOrigem(), 1);
			}
		}
		
		String[] cidades = (origens.keySet()).toArray(new String[origens.size()]);
		Iterator<Integer> iterator = (origens.values()).iterator();
		int[] flys = new int[origens.size()];
		
		for(int i=0; i<flys.length; i++) {
			flys[i] = iterator.next();
		}
		
		boolean swap;
		String aux;
		
		do {
			swap = false;
			for(int i=0; i < flys.length-1; i++) {
				if(flys[i] < flys[i+1]) {
					//swap cidade
					aux = cidades[i];
					cidades[i] = cidades[i+1];
					cidades[i+1] = aux;
					
					//swap valor cidade
					flys[i] = flys[i] + flys[i+1];
					flys[i+1] = flys[i] - flys[i+1];
					flys[i] = flys[i] - flys[i+1];
					
					swap = true;
					
				}
			}
		} while(swap);
		
		for(int i=0; i < flys.length; i++) {
			lines.add(cidades[i] + "\t" + flys[i] + "\n");
		}
		Path file = Paths.get("cidades.txt");
		
		Charset charset = Charset.forName("US-ASCII");
		
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) 
		{
			for(String s : lines) {
				writer.write(s, 0, s.length());
			}
		} 
		catch (IOException x) 
		{
			System.err.format("IOException: %s%n", x);
		}
		
	}
	
	/**Repita a alínea b) mas agora armazenando os dados num ficheiro binário
	(Infopublico.bin). Construa também um método para ler o ficheiro e apresentar a
	tabela no ecrã. Use como base a classe RandomAccessFile.*/
	public void saveAll_bin() throws IOException {
		RandomAccessFile file = new RandomAccessFile("Infopublico.bin", "rw");
		String flys= "";
		
		for(Voo fly : voos) {
			try {
				flys += fly.toString();
			}
			catch(NullPointerException e) {
				out.println("Má formatação dos dados!");
			}
		}
		
		Charset charset = Charset.forName("US-ASCII");
		
		try (BufferedReader writer = Files.newBufferedReader((Path) file, charset)) 
		{
			((DataOutput) writer).write(flys.getBytes(charset));
		} 
		catch (IOException x) 
		{
			System.err.format("IOException: %s%n", x);
		}
		writer = null;
		((PrintStream) writer).close();
		
	}
	
	public void read_bin () throws IOException {
		RandomAccessFile file = new RandomAccessFile("Infopublico.bin", "rw");
		byte[] data = new byte[(int)file.length()];
		file.readFully(data);
		file.close();
		out.println(new String(data));
	}
	
	public String toString()  {
		String flys = "";
		for(Voo fly : voos) {
			flys += fly.toString();
		}
		return flys;
	}

}

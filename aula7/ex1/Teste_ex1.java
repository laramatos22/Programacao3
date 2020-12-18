package aula7.ex1;

import java.io.*;

public class Teste_ex1 {
	
	public static void main(String[] args) throws IOException {
		Aeroporto aeroporto = new Aeroporto("voos.txt", "companhias.txt");
		aeroporto.printFicheiro();
		aeroporto.printMediaAtrasos();
		aeroporto.saveCidadeOrigem();
		aeroporto.saveFile();
		aeroporto.saveAll_bin();
		aeroporto.read_bin();
	}
}

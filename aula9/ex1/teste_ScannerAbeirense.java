package aula9.ex1;

import java.io.IOException;
import java.util.Scanner;

public class teste_ScannerAbeirense {
	
	public static void main (String[] args) throws IOException {
		ScannerAbeirense sc = new ScannerAbeirense(new Scanner ("Aveiro é nosso!"));
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}

}

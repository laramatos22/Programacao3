package Ficheiros;

import java.io.File;
//import java.io.Exception;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

public class Ficheiros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File in = new File("C:\\Users\\PC\\Desktop\\ECT - UA\\Pesquisas\\UA\\P3\\Ficheiros\\test.txt");
		File out = new File("C:\\Users\\PC\\Desktop\\ECT - UA\\Pesquisas\\UA\\P3\\Ficheiros\\out.txt");
		
		Scanner reader = new Scanner(in);
		PrintWriter printer = new PrintWriter(out);
		
		while(reader.hasNextLine()) {
			String line = reader.nextLine();
			System.out.println(line.toUpperCase());
			printer.println(line.toUpperCase());
		}
		
		reader.close();
		printer.close();

	}

}

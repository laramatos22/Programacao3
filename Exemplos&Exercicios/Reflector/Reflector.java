package Reflector;

import java.util.*;
import java.lang.Class;
import java.lang.reflect.*;

public class Reflector {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int op;
		
		System.out.print("Nome da classe: ");
		Class<?> cl = Class.forName(sc.nextLine());
		
		System.out.println("SimpleName= " + cl.getSimpleName());
		
		do {
			System.out.println("Escolher construtor: ");
			int i=0;
			for(Constructor<?> ct : cl.getConstructors()) {
				System.out.println(++i + " - " + ct);				
			}
			op = sc.nextInt();
		} while(op<1 || op>3);
		
		Constructor<?> c = cl.getConstructors()[op];
		
		sc.close();
		
	}

}

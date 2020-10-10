package aula1;

import java.util.Scanner;

public class Prob11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s;
		System.out.print("String a introduzir: ");
		s = sc.next();
		
		System.out.println("Total de caracteres numéricos: " + numericDigits(s));
		System.out.println("Contém só minúsculas? " + onlyLowerCase(s));
		System.out.println("Contém só maiúsculas? " + onlyUpperCase(s));
		System.out.println("Total de palavras lidas: " + numberOfWords(s));
		System.out.println("Nova String: " + switch2Chars(s));
		
		sc.close();
	}
	
	//Total de caracteres numéricos
	public static int numericDigits(String s) {
		//Contador de números
		int count = 0;
		
		//percorrer a String introduzida pelo teclado
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		//retorno do numero de vezes que os números são contados
		return count;
	}
	
	//Só letras minúsculas??
	public static boolean onlyLowerCase(String s) {
		return s.toLowerCase().equals(s);
	}
	
	//Só letras maiúsculas??
	public static boolean onlyUpperCase(String s) {
		return s.toUpperCase().equals(s);
	}

	//numero total de palavras lidas, imprimindo-as
	public static int numberOfWords (String s) {
		String[] words = s.split(" "); //ou s.split()
		System.out.println("Total de palavras lidas: " + words.length);
		System.out.println("Palavras: ");
		return words.length;
	}
	
	//trocar caracteres 2 a 2
	public static String switch2Chars (String s) {
				
		char[] temp = s.toCharArray();
		char troca;
		for(int j=0; j<temp.length -1; j +=2) {
			troca = temp[j];
			temp[j] = temp[j+1];
			temp[j+1] = troca;
		}
		
		String newWord = new String(temp);
		return newWord;
		
	} 
	
}

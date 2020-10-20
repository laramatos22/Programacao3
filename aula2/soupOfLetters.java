package aula2;

import java.util.*;
import java.io.*;
//import static java.lang.System.*;

public class soupOfLetters {
	
	//char soup com a letra pertencente nas coordenadas (x, y)
	private char soup[][];
	//ArrayList com as palavras todas 
	private ArrayList<String> words;
	//ArrayList com o resultado pretendido
	private ArrayList<String> result;
	private Scanner sc;
	private final int length;
	
	public soupOfLetters(String file) {
		result = new ArrayList<String>();
		//A sopa de letras pode ser até 80x80
		soup = new char[80][80];
		
		try {
			//Scanner para o ficheiro
			this.sc = new Scanner(new File(file));
		} catch(FileNotFoundException e) {
			System.out.println("Ficheiro não encontrado!");
			System.exit(0);
		}
		
		String line1 = sc.nextLine();
		int height = 0;
		length = line1.length();
		
		int abs;
		for (abs = 0; abs < length; abs++) {
			soup[height][abs] = line1.charAt(abs);
		}
		height++;
		words = new ArrayList<String>(length);
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			if(!linha.contains("; ")) {
				for(abs = 0; abs < length; abs++) {
					soup[height][abs] = linha.charAt(abs);
				}
				height++;
			}
			else {
				for(String word : linha.split(", ")) {
					words.add(word.toUpperCase());
				}
			}
		}
	}
	
	public void jogar() {
		
		int abs, ord;
		
		for(ord = 0; ord < length; ord++) {
			for(abs = 0; abs < length; abs++) {
				encontrar(abs, ord);
			}
		}
	}
	
		private void encontrar(int abs, int ord) {
			
			for(String word : words) {
				if(soup[ord][abs] == word.charAt(0)) {
					Position now = new Position (abs, ord);
					
					if(abs+word.length()-1 < length) {
						String dir = "right";
						if(gotWords(word, dir, now, new Position(abs+word.length(), ord))) {
							result.add(word + "\t" + now + "\t" + dir);
						}
					}
					
					if(ord+word.length()-1<length) 
					{
						String dir = "down";
						if(gotWords(word, dir, now,new Position(abs, ord+word.length()))) 
						{
							result.add(word + "\t" + now + "\t" + dir);
						}
					}
					
					if(ord-word.length()+1>=0) 
					{
						String dir = "up";
						if(gotWords(word, dir, now,new Position(abs, ord-word.length()))) 
						{
							result.add(word + "\t" + now + "\t" + dir);
						}
					}
					
					if(abs+word.length()-1<length && ord+word.length()-1<length) 
					{
						String dir = "downright";
						if(gotWords(word, dir, now,new Position(abs+word.length(), ord+word.length()))) 
						{
							result.add(word + "\t" + now + "\t" + dir);
						}
					}
					
					if(abs+word.length()-1<length && ord-word.length()+1>=0) 
					{
						String dir = "upright";
						if(gotWords(word, dir, now,new Position(abs+word.length(), ord-word.length()))) 
						{
							result.add(word + "\t" + now + "\t" + dir);
						}
					}
					
					if(abs-word.length()+1>=0 && ord+word.length()-1<length) 
					{
						String dir = "downleft";
						if(gotWords(word, dir, now,new Position(abs-word.length(), ord+word.length()))) 
						{
							result.add(word + "\t" + now + "\t" + dir);
						}
					}
					
					if(abs-word.length()+1>=0 && ord-word.length()+1>=0) 
					{
						String dir = "upleft";
						if(gotWords(word, dir, now,new Position(abs-word.length(), ord-word.length()))) {
							result.add(word + "\t" + now + "\t" + dir);
						}
					}
				}
			}
		}
		
			private boolean gotWords(String word, String dir, Position limInferior, Position limSuperior) {
				int xPlus = 0;
				int yPlus = 0;
				
				int x = limInferior.x();
				int y = limInferior.x();
				
				if(dir.contains("up")) {
					yPlus = -1;
				}else if(dir.contains("down")) {
					yPlus = 1;
				}
				
				if(dir.contains("left")) {
					xPlus = -1;
				}else if(dir.contains("right")) {
					xPlus = 1;
				}
				
				String tempWord = "";
				
				for(int i = 0; i < word.length(); i++) {
					tempWord += soup[y][x];
					x += xPlus;
					y += yPlus;
				}
				
				return tempWord.equals(word);
			}
			
	public void fim() {
		for(String result : this.result) {
			System.out.println(result);
		}
		sc.close();
	}

}

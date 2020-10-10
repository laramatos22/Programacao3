package aula1;

import java.util.Scanner;

public class Prob13 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Menu: ");
		System.out.println("----------------------");
		System.out.println(" Figuras geométricas");
		System.out.println("----------------------");
		System.out.println("1 - Criar um círculo");
		System.out.println("2 - Criar um quadrado");
		System.out.println("3 - Criar um rectângulo");
		System.out.println("----------------------");
		System.out.print("\nOpção: ");
		int op = Integer.parseInt(sc.nextLine());
		
		Circulo circulo = null;
		Retangulo retangulo = null;
		Quadrado quadrado = null;
		
		if (op == 1) {
			System.out.println("CRIAÇÃO DE UM CÍRCULO: ");
			System.out.print("Introduzir raio: ");
			int raio = Integer.parseInt(sc.nextLine());
			System.out.print("Introduzir coordenada x do centro: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Introduzir coordenada y do centro: ");
			int y = Integer.parseInt(sc.nextLine());
			circulo = new Circulo(x,y,raio);
			System.out.println("\nInformação relativa ao círculo: \n" + circulo);
		}
		
		else if (op == 2) {
			System.out.println("CRIAÇÃO DE UM QUADRADO: ");
			System.out.print("Introduzir comprimento do lado do quadrado: ");
			int comprimento = Integer.parseInt(sc.nextLine());
			System.out.print("Introduzir coordenada x do centro: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Introduzir coordenada y do centro: ");
			int y = Integer.parseInt(sc.nextLine());
			quadrado = new Quadrado(x,y,comprimento);
			System.out.println("\nInformação relativa ao quadrado: \n" + quadrado);
		}
		
		else if (op == 3) {
			System.out.println("CRIAÇÃO DE UM RETANGULO: ");
			System.out.print("Introduzir comprimento: ");
			int comprimento = Integer.parseInt(sc.nextLine());
			System.out.print("Introduzir largura: ");
			int largura = Integer.parseInt(sc.nextLine());
			System.out.print("Introduzir coordenada x do centro: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Introduzir coordenada y do centro: ");
			int y = Integer.parseInt(sc.nextLine());
			retangulo = new Retangulo(x,y,largura, comprimento);
			System.out.println("\nInformação relativa ao retângulo: \n" + retangulo);
		}
		
		/**
		e) Implemente também os seguintes métodos:
			a. Verifique se dois Círculos são iguais;
			b. Verifique se dois Círculos se interceptam; */
		
		Circulo c1 = new Circulo(1.0, 1.0, 15.0);
		Ponto centro1 = new Ponto(2.0, 1.0);
		Circulo c2 = new Circulo (centro1, 10.0);
		
		if(circulo != null) {
			System.out.println(c1.intersecaoCirculos(c2));
			System.out.println(c1.equalCircles(c2));
		}

	}

}

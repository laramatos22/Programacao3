package ex3.alineaB;

import ex3.alineaA.Empregado;

// Em cada mês é selecionado aleatoriamente um funcionário para receber um
// brinquedo grátis. Deve ser possível guardar todos os pares funcionáriobrinquedo.

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado e1 = new Empregado("Lara Matos", 95228);
		Empregado e2 = new Empregado("Antonio Costa", 12345);
		Empregado e3 = new Empregado("Marta Temido", 98765);
		
		Brinquedo b1 = new Brinquedo("Barbie", 10101);
		Brinquedo b2 = new Brinquedo("Faisca McQueen", 01010);
		Brinquedo b3 = new Brinquedo("Poupas", 010203);
		
		ListaOfertas ofertas = new ListaOfertas();
		ofertas.add(e1, b1);
		ofertas.add(e2, b3);
		ofertas.add(e3, b2);
		System.out.println(ofertas);
		ofertas.remove(0);
		System.out.println(ofertas);

	}

}

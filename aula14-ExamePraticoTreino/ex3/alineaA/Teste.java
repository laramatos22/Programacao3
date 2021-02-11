package ex3.alineaA;

// A empresa Brinca&Beira (BB) precisa de um registo com os nomes de todos os
// seus empregados.

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaEmpregados lista = new ListaEmpregados();
		lista.add("Lara Matos");
		lista.add("Antonio Manuel");
		lista.add("Pedro Gomes");
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);

	}

}

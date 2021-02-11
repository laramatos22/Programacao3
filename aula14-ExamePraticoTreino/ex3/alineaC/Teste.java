package ex3.alineaC;

// A empresa decidiu atribuir o primeiro nome de um empregado a cada produto.
// Prepare uma lista destes nomes sabendo que um nome só poderá ser usado uma
// vez.

import ex3.alineaB.Brinquedo;
import ex3.alineaB.ListaOfertas;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado e1 = new Empregado("Lara", "Matos", 95228);
		
		List<Empregado> empregados = new ArrayList<>();
		empregados.add(e1);
		empregados.add(new Empregado("Paulo", "Ferreira", 10101));
		empregados.add(new Empregado(""));

	}

}

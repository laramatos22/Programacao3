package tp10.Exemplo_FactoryMethod;

public class Teste_Arvores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arvore pomar[] = {
				Viveiro.factory("Figueira"),
				Viveiro.factory("Pessegueiro"),
				Viveiro.factory("Figueira"),
				Viveiro.factory("Nespereira")
		};
		
		for(Arvore a : pomar)
			a.regar();
		
		for(Arvore a : pomar)
			a.colherFruta();

	}

}

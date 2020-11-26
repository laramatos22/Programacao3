package aula6.ex1;

/**PratoVegetariano, tem um nome (String) e composição (conjunto de alimentos
vegetarianos).*/

public class PratoVegetariano extends Prato implements AlimentoVegetariano {

	public PratoVegetariano(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return super.toString() + " PRATO VEGETARIANO";
	}

}

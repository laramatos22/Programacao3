package aula9.ex2;

public class teste_Gelataria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gelado ice;
		ice = new GeladoSimples("Baunilha");
		ice.base(2);
		new Copo(ice).base(3);
		new Cone(ice).base(1);
		new Topping(ice, "Canela").base(2);
		ice = new Topping(ice, "Nozes");
		ice.base(1);
		ice = new Topping(new Cone(new GeladoSimples("Morango")), "Fruta");
		ice.base(2);
		ice = new Topping(
				new Topping(
						new Copo(new GeladoSimples("Manga")), "Chocolate"), "Natas");
		ice.base(4);
		ice = new Topping(ice, "Pepitas");
		ice.base(3);

	}
	
	/**No terminal terá que aparecer o seguinte:
	 * 
		2 bolas de gelado de Baunilha
		3 bolas de gelado de Baunilha em copo
		1 bola de gelado de Baunilha em cone
		2 bolas de gelado de Baunilha com Canela
		1 bola de gelado de Baunilha com Nozes
		2 bolas de gelado de Morango em cone com Fruta
		4 bolas de gelado de Manga em copo com Chocolate com Natas
		3 bolas de gelado de Manga em copo com Chocolate com Natas com Pepitas*/

}

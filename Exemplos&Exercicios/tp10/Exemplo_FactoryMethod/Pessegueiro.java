package tp10.Exemplo_FactoryMethod;

public class Pessegueiro implements Arvore {
	
	protected Pessegueiro() {System.out.println("Pessegueiro plantado.");}
	
	public void regar() {System.out.println("Pessegueiro: Regar normal");}
	
	public void colherFruta() {System.out.println("Boa.. pêssegos!");}

}

package aula9.ex2;

public class Copo extends GeladoDecorator {
	
	//Nao há campos
	
	//Construtor
	public Copo(Gelado g) {
		super(g);
	}
	
	//Métodos
	public String toString () {
		return g.toString() + " em copo";
	}

}

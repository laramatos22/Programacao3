package aula9.ex2;

public class Copo extends GeladoDecorator {
	
	//Nao h� campos
	
	//Construtor
	public Copo(Gelado g) {
		super(g);
	}
	
	//M�todos
	public String toString () {
		return g.toString() + " em copo";
	}

}

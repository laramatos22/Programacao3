package aula9.ex2;

public class Cone extends GeladoDecorator {
	
	//Nao ha campos
	
	//Construtor
	public Cone(Gelado g) {
		super(g);
	}
	
	public String tostring() {
		return g.toString() + " em cone";
	}

}

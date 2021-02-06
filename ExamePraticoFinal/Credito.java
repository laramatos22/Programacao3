
public class Credito extends Movimento {
	
	//Construtor
	public Credito(double montante, String data) {
		super(montante, data);
		
		//estamos a acrescentar dinheiro na conta
		if(montante <= 0) throw new IllegalArgumentException("Montante tem de ser positivo");
	}
	
	@Override
	public String toString() {
		return "[Credito: " + super.toString() + "]";
	}

}

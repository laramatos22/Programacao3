
public class Debito extends Movimento {

	//Construtor
	public Debito(double montante, String data) {
		super(montante, data);
		
		//estamos a retirar dinheiro da conta
		if(montante >= 0) throw new IllegalArgumentException("Montante tem de ser negativo");
	}
	
	@Override
	public String toString() {
		return "[Debito: " + super.toString() + "]";
	}
	
}

//MOVIMENTO FEITO NUMA CONTA

public class Movimento {
	
	private double montante;
	private String data;
	
	//Construtor
	public Movimento (double montante, String data) {
		this.montante = montante;
		this.data = data;
	}
	
	public double getMontante() {return montante;}
	public String getData() {return data;}
	
	@Override 
	public String toString() {
		return "[montante="+ montante +", data="+ data + "]";
	}

}

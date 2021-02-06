import java.util.LinkedList;

//CONTA DE UM CLIENTE

public class Conta {
	
	private int num = 0;
	private Cliente cliente;
	private double saldo;
	private LinkedList<Movimento> movimentos;
	
	//Construtores possiveis
	public Conta(int num, Cliente cliente, double saldo, LinkedList<Movimento> movimentos) {
		this.num = num;
		this.cliente = cliente;
		this.saldo = saldo;
		this.movimentos = movimentos;
	}
	
	public Conta(Cliente cliente) {
		this.num = num + 1;
		this.saldo = 0;
		this.cliente = cliente;
		this.movimentos = new LinkedList<Movimento>();
	}
	
	//Getters
	public int getNum() {return num;}
	public Cliente getCliente() {return cliente;}
	public double getSaldo() {return saldo;}
	public LinkedList<Movimento> getMovimentos() {return movimentos;}
	
	//Método add(mov) para adicionar um montante ao saldo atual da conta
	public void add(Movimento mov) {
		movimentos.add(mov);
		saldo = saldo + mov.getMontante();
	}
	
	//Método para devolver os movimentos numa string
	public String returnMoves(LinkedList<Movimento> listMoves) {
		String str = "";
		for (Movimento mov : listMoves) {
			str = str + mov.toString();
		}
		return str;
	}
	
	//Método toString()
	public String toString() {
		return "Numero: " + num + " | Cliente: " + cliente.toString() 
				+ " | Saldo: " + saldo + " | Movimentos: " + returnMoves(movimentos);
	}

}

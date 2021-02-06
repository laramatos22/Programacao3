//CLIENTE DO BANCO 

public class Cliente {
	
	private String nome;
	private String numCliente;
	private TipoCliente tipo;
	
	//Construtor
	public Cliente(String nome, String numCliente, TipoCliente tipo) {
		this.nome = nome;
		this.numCliente = numCliente;
		this.tipo = tipo;
	}
	
	public String getNome() {return nome;}
	public String getNumCliente() {return numCliente;}
	public TipoCliente getTipoCliente() {return tipo;}
	
	@Override 
	public String toString() {
		return "Cliente: " + nome;
	}

}

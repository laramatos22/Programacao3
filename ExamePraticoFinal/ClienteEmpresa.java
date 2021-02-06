//O CLIENTE DO BANCO É UMA EMPRESA

public class ClienteEmpresa extends Cliente {
	
	private Cliente patrao;
	
	//Construtor
	public ClienteEmpresa(String nome, String numCliente, TipoCliente tipo, Cliente patrao) {
		super(nome, numCliente, tipo);
		this.patrao = patrao;
	}
	
	public Cliente getPatrao() {return patrao;}

}

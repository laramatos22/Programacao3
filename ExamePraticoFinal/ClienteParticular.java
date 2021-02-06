//O CLIENTE DO BANCO É UMA PESSOA/PARTICULAR

public class ClienteParticular extends Cliente {
	
	private String numTelefone;
	
	//Construtores
	public ClienteParticular(String nome, String numCliente, TipoCliente tipo, String numTelefone) {
		super(nome, numCliente, tipo);
		this.numTelefone = numTelefone;
	}
	
	public ClienteParticular(String nome, String numCliente, TipoCliente tipo) {
		super(nome, numCliente, tipo);
		this.numTelefone = "";
	}
	
	public String getTelefone() {return numTelefone;}

}

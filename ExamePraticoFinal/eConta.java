//CLIENTE ONLINE

public class eConta extends Conta {
	
	//Construtor
	public eConta(Cliente cliente) {
		super(cliente);
		if(cliente.getTipoCliente() != TipoCliente.Online) 
			throw new IllegalArgumentException("Cliente Inválido");
	}

}

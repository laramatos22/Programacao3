package aula3;

public class PesadoPassageiros extends Veiculo {
	
	private char type;
	
	public PesadoPassageiros(int cilindrada, int potencia, int lotacao, double pesoBruto) {
		super(cilindrada, potencia, lotacao, pesoBruto);
		type = 'D'; //categoria D da carta de condução
	}
	
	public boolean licencaConduzir(Condutor condutor) {
		//Se a licença para conduzir é para o veículo do mesmo tipo ou tem a categoria B na carta
		//de condução, entao return true
		if(condutor.licenca() == type || condutor.licenca() == 'B') {
			return true;
		} 
		//caso contrario o condutor não tem licença para conduzir o veículo pretendido
		return false;
	}

}
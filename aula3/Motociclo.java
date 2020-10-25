package aula3;

public class Motociclo extends Veiculo {
	
	private char type;
	
	public Motociclo(int cilindrada, int potencia, int lotacao, double pesoBruto) {
		super(cilindrada, potencia, lotacao, pesoBruto);
		type = 'A'; //categoria A da carta de condução
	}
	
	public boolean licencaConduzir(Condutor condutor) {
		//Se a licença para conduzir é para o veículo do mesmo tipo, entao return true
		if(condutor.licenca() == type) {
			return true;
		} 
		//caso contrario o condutor não tem licença para conduzir o veículo pretendido
		return false;
	}

}

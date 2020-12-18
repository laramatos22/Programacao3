package exemplo_aula9;

public class teste_Carros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c;
		
		c = new CarroSimples("Opel");
		new CarroBranco(c).tipo("Comercial");
		new CarroPreto(c).tipo("Passageiros");
		new OutraCorCarro(new CarroSimples("Renault"), "Vermelho").tipo("Comercial");

	}

}

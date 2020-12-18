package Enum;

public class TesteEnum {
	
	public static void main(String[] args) {
		Carro c = new Carro("Renault", Cores.BRANCO);
		
		System.out.println(c.getCor().toString());
		c.setCor(Cores.PRETO);
		System.out.println(c.getCor().toString());
	}

}

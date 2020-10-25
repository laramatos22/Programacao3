package aula3;

public class Teste_ex1 {
	
	public static void main(String[] args) {
		
		Estudante est = new Estudante ("Andreia", 9855678, new Data(18, 7, 1974));
		Bolseiro bls = new Bolseiro ("Maria", 8976543, new Data(11, 5, 1976));
		bls.setBolsa(745);
		
		System.out.println("Estudante: " + est.Nome());
		System.out.println(est);
		
		System.out.println("Bolseiro: " + bls.Nome() + ", NMec: " + bls.Nmec()
							+ ", Bolsa: " + bls.bolsa());
	}

}

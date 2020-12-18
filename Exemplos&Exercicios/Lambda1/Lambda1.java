package Lambda1;

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNum n1 = (x) -> x+1;
					//qualquer expressão que transforme double em double
		
		System.out.println(n1.getNum(10));
		n1 = (x) -> x*x;
		System.out.println(n1.getNum(10));

	}
	
	/**
	 * EXPRESSÕES LAMBDA
	 * Linguagem de programação abstrata em que funções podem ser combinadas para formar
	 * outras funções
	 * 
	 * x->f(x)	--> x é transformado em f(x)
	 * 
	 * O cálculo lambda trata as funções como elementos de 1a classe
	 * 		podem ser utilizadas como argumentos e retornadas como
	 * 		valores de outras funções
	 * 
	 */

}

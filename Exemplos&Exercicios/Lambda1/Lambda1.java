package Lambda1;

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNum n1 = (x) -> x+1;
					//qualquer express�o que transforme double em double
		
		System.out.println(n1.getNum(10));
		n1 = (x) -> x*x;
		System.out.println(n1.getNum(10));

	}
	
	/**
	 * EXPRESS�ES LAMBDA
	 * Linguagem de programa��o abstrata em que fun��es podem ser combinadas para formar
	 * outras fun��es
	 * 
	 * x->f(x)	--> x � transformado em f(x)
	 * 
	 * O c�lculo lambda trata as fun��es como elementos de 1a classe
	 * 		podem ser utilizadas como argumentos e retornadas como
	 * 		valores de outras fun��es
	 * 
	 */

}

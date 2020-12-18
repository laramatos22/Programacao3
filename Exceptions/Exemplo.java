package Exceptions;

public class Exemplo {
	
	public static void f() throws Exception {
		System.out.println("exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception {
		try {
			f();
		} catch(Exception e) {
			System.out.println("exception in g()");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		try {
			g();
		} catch(Exception e) {
			System.out.println("caught in main");
		}
		
	}

}

/**
 * TIPOS DE EXCE��ES
 * -Checked - se invocarmos um m�todo que gere uma checked exception, temos de indicar
 * 			  ao compilador como vamos resolv�-la
 * 				> resolver try...catch OU
 * 				> propagar throw
 * 
 * -Unchecked -  s�o errros de programa��o ou do sistema (usar asser��es)
 * 				 s�o subclasses de java.lang.RuntimeException ou java.lang.Error
 */

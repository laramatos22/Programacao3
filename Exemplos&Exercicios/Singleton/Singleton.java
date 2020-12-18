package Singleton;

public class Singleton {
	//Garantir que uma classe só tenha uma única instância 
	//fornecendo um ponto de acesso global
	
	//instancia
	private static Singleton a = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return a;
	}

}

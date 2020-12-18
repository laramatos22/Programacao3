package Interfaces.exemplo;

public interface Instrument {
	
		//Compile-time constant:
	int i = 5; //static & final
		//Cannot have method definitions:
	void play(); //automatically public
	String what();
	void adjust();

}

/**
 * Interfaces:
 * 
 * - 100% abstratas
 * - especificar um conjunto dadicional de comportamentos / propriedades funcionais
 * - implementação horizontal na hierarquia
 */


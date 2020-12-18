package LambdaGeneric;

//A generic functional interface
public interface SomeFunc<T> {
	
	T func(T n);
	
	/**
	 * UTILIZAÇÃO:
	 * SomeFunc<String> reverse = ...
	 * SomeFunc<Integer> factorial = ...
	 */

}

package LambdaAsArgument;

public interface MyFunc<T> {
	
	T func(T n);
	
	/**
	 * 	...
	 *	//Funções que aceita uma expressão lambda e o seu argumento (T n)
	 *	static String stringOp (MyFunc<String> sf, String s) {
	 *		return sf.func(s);
	 *	}
	 *
	 *	...
	 *	//Outro exemplo
	 *	static Person PersonOp(MyFunc<Person> sf, person s) {
	 *		return sf.func(s);
	 *	}
	 *
	 */
	
	/**
	 * 	UTILIZAÇÃO
	 * 
	 * String inStr = "Lambdas add power to Java";
	 * String outStr = stringOp((str) -> str.toUpperCase(), inStr);
	 * System.out.println("The string in uppercase: " + outStr);
	 * //This passes a block lambda that removes spaces
	 * outStr = stringOp((str) -> {
	 * 		StringBuilder result = new StringBuilder();
	 * 		for(int i=0; i<str.length(); i++)
	 * 			if(str.charAt(i) != ' ')
	 * 				result.append(str.charAt(i));
	 * 			return result.toString();
	 * }, inStr);
	 * System.out.println("The string with spaces removed: " + outStr);
	 * 
	 */
	
	/**
	 * NO TERMINAL:
	 * 
	 * The string int uppercase: LAMBDAS ADD POWER TO JAVA
	 * The string with spaces removed: Lambdasaddpowertojava
	 */

}

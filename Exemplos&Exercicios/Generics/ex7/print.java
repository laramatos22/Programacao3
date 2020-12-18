package Generics.ex7;

//Will the following method compile? If not, why?

public static void print (List<? extends Number> list) {
	
	for(Number n : list)
		System.out.println(n + " ");
	System.out.println();

}

//answer: Yes

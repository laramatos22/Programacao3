package Generics.ex10;

public class Node {
	
	//Given the following classes:
		
	//class Shape { /* ... */ }
	//class Circle extends Shape { /* ... */ }
	//class Rectangle extends Shape { /* ... */ }  
	
	//class Node<T> { /* ... */ }
	
	//Will the following code compile? If not, why?
		
	//Node<Circle> nc = new Node<>();
	//Node<Shape>  ns = nc;
		
	//Answer: No. Because Node<Circle> is not a subtype of Node<Shape>.

}

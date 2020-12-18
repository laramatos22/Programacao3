package aula10.ex1;

import java.util.Iterator;

public class TestGeneric {
	public static void main(String[] args) {
		VecGeneric<Pessoa> vp = new VecGeneric<Pessoa>();
	    for (int i=0; i<10; i++)
	        vp.addElem(new Pessoa("Bebé no Vector "+i,1000+i,Data.today()));
	    Iterator<Pessoa> vec = vp.iterator();
	    
	    printSet(vp.iterator());
	    
	    ListGeneric<Pessoa> lp = new ListGeneric<Pessoa>();
	    while ( vec.hasNext() )
	        lp.addElem( vec.next() );
	    	//System.out.println(vec.next().getClass().getName());
	     
	    Iterator<Pessoa> lista = lp.iterator();
	    while ( lista.hasNext() )
	        System.out.println( lista.next() );
	    
	    System.out.println("\n");
	    ListGeneric<Figura> figList = new ListGeneric<>();
	    figList.addElem(new Circulo (1,3, 1));
	    figList.addElem(new Quadrado(3,4, 2));
	    figList.addElem(new Rectangulo(1,2, 2,5));
	     
	    printSet(figList.iterator());
	    
	    System.out.println("Soma da Area de Lista de Figuras: " + sumArea(figList));
	     
	    ListGeneric< Rectangulo > quadList = new ListGeneric<>();
	    quadList.addElem(new Quadrado(3,4, 2));
	    quadList.addElem(new Rectangulo(1,2, 2,5));
	    
	    System.out.println("Soma da Area de Lista de Quadrados: " + sumArea(quadList));
	}
	
	// Deve aceitar uma Lista de (sub)tipos Figura e retornar o
	//somatório das suas áreas
	public static double sumArea(ListGeneric<? extends Figura> listafigs) {
		double area = 0;
		Iterator <? extends Figura> i = listafigs.iterator();
		
		while(i.hasNext())
			area += (i.next().area());
		return area;
	}
	
	// Deve aceitar um iterador (MyIterator) e imprimir todos
	//os elementos
	public static <T> void printSet(Iterator<T> MyIterator) {
		while(MyIterator.hasNext())
			System.out.println(MyIterator.next().toString());
	}
}

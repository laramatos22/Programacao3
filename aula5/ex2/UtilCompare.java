package aula5.ex2;

/**exercicio 2 al�nea c)
Desenvolva um programa main para demonstrar todas as funcionalidades
implementadas em a) e b). Crie tamb�m uma lista de Ve�culos e ordene-os usando a
fun��o UtilCompare.sortArray desenvolvida no problema anterior (considere o ano
como atributo de compara��o).*/

public class UtilCompare {
	
	@SuppressWarnings("unchecked")
	public static <T> Comparable<T> findMax(Comparable<T> []a) {
		int iMax = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]!=null && a[i].compareTo((T) a[iMax])>0) {
				iMax = i;
			}
		}
		return a[iMax];
	}
	
	@SuppressWarnings("unchecked")
	public static <T> void sortArray(Comparable<T>[] a) {
		Comparable<T> aux;
		for(int i=0; i < a.length -1; i++) {
			for(int j=i; j < a.length; j++) {
				if(a[i].compareTo((T) a[j]) < 0) {
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
	}

}

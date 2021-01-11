package aula12.ex2;

//EXERCICIO 2
//Java 8 Stream API

/*import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;*/
import java.util.*;
import java.io.*; 

public class Test_ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Lista de Figuras
		List<Figura> listFiguras = new ArrayList<>();
		listFiguras.add(new Circulo(1,3, 1));
		listFiguras.add(new Quadrado(3,4, 2));
		listFiguras.add(new Retangulo(1,2, 2,5));
		listFiguras.add(new Quadrado(1));
		listFiguras.add(new Retangulo(1, 1));
		
		//testes das funções
		System.out.println("Maior figura: " + maiorFiguraJ7(listFiguras));
		System.out.println("Maior perimetro: " + maiorPerimetroJ7(listFiguras));
		System.out.println("Soma total das áreas: " + areaTotalJ8(listFiguras));
		System.out.println("Soma total das áreas dos quadrados: " + areaTotalJ8(listFiguras, "Quadrado"));

	}
	
	/*alinea a)
	Reimplemente o método maiorFiguraJ7.
	private static Figura maiorFiguraJ7(List<Figura> figs) {
		Figura maior = figs.get(0);
		for (Figura f : figs) {
			if (f.compareTo(maior) >= 1)
			maior = f;
		}
		return maior;
	}*/
	
	private static Figura maiorFiguraJ7(List<Figura> figs) {
		return (Figura)figs.stream().max(new Comparator <Figura>() {
				//Função compare que está na classe Figura
				@Override
				public int compare(Figura fig1, Figura fig2) {
					return fig1.compareTo(fig2);
				}
		}).get();
	}
	
	//alinea b)
	//Reimplemente a alínea a) mas utilizando agora o perímetro como elemento de
	//comparação (isto sem mexer na implementação de Figura).
	
	private static Figura maiorPerimetroJ7(List<Figura> figs) {
		return (Figura)figs.stream().max(new Comparator<Figura>() {
			//função Comparator para comparar duas figuras
			@Override
			public int compare(Figura f1, Figura f2) {
				double perimetro = f1.perimetro() - f2.perimetro();
				
				if(perimetro>0)	return 1;
				else if(perimetro<0) return -1;
				else return 0;
			}
		}).get();
	}
	
	//alinea c)
	//Implemente um método que retorne a soma das áreas das figuras da lista.
	//private static double areaTotalJ8(List<Figura> figs) {
	//	...
	//	}
	
	private static double areaTotalJ8(List<Figura> figs) {
		return figs.stream().mapToDouble(x -> x.area()).sum();
	}
	
	//aliena d)
	//Altere a alínea c) para só calcular a área total do subtipo de Figura passado
	//como argumento.
	//private static double areaTotalJ8(List<Figura> figs,String subtipoNome){
	//...
	//}
	
	private static double areaTotalJ8(List<Figura> figs, String subTipoNome) throws IOException {
		return figs.stream().filter(x -> x.getClass().getSimpleName().equals(subTipoNome)).mapToDouble(x -> x.area()).sum();
	}

}

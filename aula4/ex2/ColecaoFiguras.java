package aula4.ex2;

import java.util.*;

public class ColecaoFiguras {
	

	private List<Figura> figuras = new ArrayList<>();
	private double maxArea;
	private double totalArea;
	
	
	public ColecaoFiguras(double maxArea) {
	                                            // O construtor define a área máxima da
	this.maxArea = maxArea;
	this.totalArea = 0;
	
	}
	
	public boolean addFigura(Figura f) {                                     // Adiciona uma figura à coleção
		
		if(totalArea+f.area() > maxArea || exists(f))
			return false;
		totalArea = totalArea + f.area();
		return figuras.add(f);			               
	}
	
	public boolean delFigura(Figura f) {                                      // Remove uma figura da coleção
		
		if(!exists(f))
		
		return false;
	   
		totalArea -= f.area();
		return figuras.remove(f);		                                                   
	}
	public double areaTotal() {
		
		      return totalArea;                                               // Retorna a área total das figuras
	}
	
	public boolean exists(Figura f) {
		
		return figuras.contains(f);                                                   // Verifica se uma figura existe na coleção
	}
	
	public String toString() {
		                                                                              
		return "Area Maxima: "+areaTotal()+"\nNumero de Figuras: "+figuras.size();
		                                                                             // Retorna as características da coleção
	}
	public Figura[] getFiguras(){
		
		return figuras.toArray(new Figura[0]);                                        // Retorna uma lista com todas
	}
	 
	public Ponto[] getCentros() {
		
		List<Ponto> pontos = new ArrayList<>();
		for(Figura f : getFiguras()) {
			pontos.add(f.centro());
		}
		return pontos.toArray(new Ponto[0]);
		                                                                               // Retorna uma lista com todos os centros
	 }
	 

}
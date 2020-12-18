package aula5.ex1;

import java.util.*;

public class ColecaoFiguras {
	

	private List<Figura> figuras = new ArrayList<>();
	private double maxArea;
	private double totalArea;
	
	
	public ColecaoFiguras(double maxArea) {
		this.maxArea = maxArea;
		this.totalArea = 0;
	
	}
	
	public boolean addFigura(Figura f) {                                     
		
		if(totalArea+f.area() > maxArea || exists(f))
			return false;
		totalArea = totalArea + f.area();
		return figuras.add(f);			               
	}
	
	public boolean delFigura(Figura f) {                              
		
		if(!exists(f))
		
		return false;
	   
		totalArea -= f.area();
		return figuras.remove(f);		                                                   
	}
	public double areaTotal() {
		
		      return totalArea;                                              
	}
	
	public boolean exists(Figura f) {
		
		return figuras.contains(f);                                                   
	}
	
	public String toString() {
		                                                                              
		return "Area Maxima: "+areaTotal()+"\nNumero de Figuras: "+figuras.size();
		                                                                             
	}
	public Figura[] getFiguras(){
		
		return figuras.toArray(new Figura[0]);                                       
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
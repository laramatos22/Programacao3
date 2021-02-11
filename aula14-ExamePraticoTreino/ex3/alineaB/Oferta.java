package ex3.alineaB;

import ex3.alineaA.Empregado;

public class Oferta {
	
	private Empregado empregado;
	private Brinquedo brinquedo;
	private int id;
	
	public Oferta(Empregado empregado, Brinquedo brinquedo, int id) {
		this.empregado = empregado;
		this.brinquedo = brinquedo;
		this.id = id;
	}
	
	public Empregado getEmpregado() {return empregado;}
	public Brinquedo getBrinquedo() {return brinquedo;}
	public int getID() {return id;}
	
	@Override
	public String toString() {
		return "Oferta nº " + id + " -> " + empregado + " | " + brinquedo;
	}
	
}

package aula12.ex1;

public class Rectangulo extends Figura {
	
	private double comp;
	private double lar;

	public Rectangulo (double x, double y, double comp, double lar) {
		super(new Ponto(x,y));
		this.comp = comp;
		this.lar=lar;
	}
	
	public Rectangulo (double comp,double lar) {
		super(new Ponto());
		this.comp = comp;
		this.lar=lar;
	}
	
	public Rectangulo(Ponto p, double c,double l) {
		super(p);
		comp=c;
		lar=l;
	}
	
	public Rectangulo (Rectangulo r) {
		this(r.centro(),r.comp(),r.lar());
		
	}
	
	public double comp() {return comp;}
	public double lar() {return lar;}
	
	public Ponto centro() {
		return super.centro();
	}
	
	public double area(){
		return comp*lar;	
	}
	
	public double perimetro() {
		return (comp*2) + (lar * 2);
	}
	
	//Dados todos numa String
	public String toString() {
		return "Retangulo de comprimento " + comp + " de altura " + lar + " e de centro " + centro(); 
	}
	
	public boolean equals(Rectangulo r) {
		if(comp == r.comp() && lar==r.lar()) {
			return true;
		}else {
			return false;
		}
	}

}

package aula3;

public class Retangulo extends Figura {
	
	public Retangulo(double comprimento, double largura) {
		super(comprimento, largura);
	}
	
	public Retangulo(double comprimento, double largura, Ponto centro) {
		super(comprimento, largura, centro);
	}
	
	public Retangulo(double x, double y, double comprimento, double largura) {
		super(comprimento, largura, new Ponto(x,y));
	}
	
	public Retangulo(Retangulo r) {
		super(r.x(), r.y(), r.centro());
	}

}

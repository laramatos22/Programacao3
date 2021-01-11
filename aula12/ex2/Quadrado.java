package aula12.ex2;

public class Quadrado extends Retangulo {
	
	//----------vários construtores possíveis--------//
	public Quadrado(double lado, Ponto centro) {
		super(lado, lado, centro);
	}
	
	public Quadrado(double lado, int x, int y) {
		this(lado, new Ponto(x, y));
	}
	
	public Quadrado(double lado) {
		this(lado, new Ponto(0, 0));
	}
	
	public Quadrado() {
		this(1, new Ponto(0, 0));
			//quando não tem medida do lado o programa define automaticamente como medida do lado = 1;
	}
	
	public Quadrado(Quadrado q) {
		this(q.getLargura(), q.getCentro());
				//largura = lado do quadrado
	}
	

}

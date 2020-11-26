package aula6.ex1;

public enum DiaSemana {
	
	segunda(0),
	terça(1),
	quarta(2),
	quinta(3),
	sexta(4),
	sabado(5),
	domingo(6);
	
	private int i;
	
	private DiaSemana(int i) {
		this.i=i;
	}
	
	public int getIndex() {
		return i;
	}
	
	public static DiaSemana enumDay(int n) {
		DiaSemana var = null;
		for(DiaSemana v : DiaSemana.values()) {
			if(v.getIndex() == n) return v;
		}
		return var;
	}
	
	public static DiaSemana rand() {
		int rand = (int)(Math.random()*6);
		DiaSemana value = null;
		for(DiaSemana dia : DiaSemana.values()) {
			if(dia.getIndex() == rand) value = dia;
		}
		return value;
	}
	
	
}

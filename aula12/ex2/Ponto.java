package aula12.ex2;

public class Ponto {
	
	private int x, y;		//coordenadas para o ponto(x, y)
	
	//---------construtores possíveis----------//
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {
		this(0, 0);
	}
	//........................................//
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)	return true;
		if(obj == null)	return false;
		if(getClass() != obj.getClass()) return false;
		Ponto other = (Ponto) obj;
		if(x != other.x) return false;
		if(y != other.y) return false;
		return true;
	}

}

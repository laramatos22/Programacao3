//Position com as coordenadas de cada letra

package aula2;

public class Position {
	
	private final int x;
	private final int y;
	
	public Position (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int x() {return x;}
	public int y() {return y;}
	
	public String toString() {
		return "("+(x+1)+", "+(y+1)+")";
	}

}

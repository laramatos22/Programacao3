package aula9.ex2;

public class GeladoSimples implements Gelado {
	
	//Campos
	private int numBase;
	private String sabor;
	
	//Construtor
	public GeladoSimples(String sabor) {
		this.sabor = sabor;
	}
	
	//Getters
	public int getNumBase() {return numBase;}
	public String sabor() {return sabor;}
	
	//Setters
	public void setNumBase(int num) {numBase = num;}
	
	//Metodos da classe Objeto
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(numBase);
		builder.append(" bola");
		if(numBase > 1) builder.append("s");
		builder.append(" de gelado de ");
		builder.append(sabor);
		return builder.toString();
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sabor == null) ? 0 : sabor.hashCode());
		result = prime * result + numBase;
		return result;
	}
	
	public boolean equals (Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		GeladoSimples other = (GeladoSimples) obj;
		
		if(sabor == null) {
			if(other.sabor != null) return false;
		} else if(!sabor.equals(other.sabor)) return false;
		if(numBase != other.numBase) return false;
		return true;
		
	}
	
	public void base(int num) {setNumBase(num);}

}

package aula9.ex2;

public class Topping extends GeladoDecorator {
	
	//Campo
	private String toppingName;		//nome do topping do gelado
	
	//Construtor
	public Topping (Gelado g, String toppingName) {
		super(g);
		this.toppingName = toppingName;
	}
	
	//Getters 
	public String getToppingName() {return toppingName;}
	
	//Métodos
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((toppingName == null) ? 0 : toppingName.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		Topping other = (Topping) obj;
		
		if(toppingName == null) {
			if(other.toppingName != null) return false;
		} else if(!toppingName.equals(other.toppingName)) {
			return false;
		}
		return true;		
	}

}

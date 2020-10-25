package aula3;

public class Workers extends Clients {
	
	//Fields
	private final int numFunc;	//número de funcionário
	private final int nif;		//número fiscal
	
	public Workers(String name, int cc, Data bDay, int numFunc, int nif) {
		super(name, cc, bDay);
		this.numFunc = numFunc;
		this.nif = nif;
				
	}
	
	//MÉTODOS
	
	public boolean equals (Workers func) {
		return super.equals(func) && (numFunc == func.numFunc) && (nif == func.nif);
	}
	
	//função tostring()
	public String toString() {
		return super.toString() + "\nNúmero de Funcionário: " + numFunc + "\nNIF: " + nif;
	}
	
}
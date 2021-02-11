package ex1;

//Província: caracterizada por um nome (String), uma população (int) e um
//governador (String)

public class Provincia extends Regiao {
	
	private String governador;
	
	//Construtor
	public Provincia(String nome, int populacao, String governador) {
		super(nome, populacao);
		this.governador = governador;
	}
	
	//Getter
	public String getGovernador() {return governador;}
	
	//Métodos
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(getClass() != obj.getClass()) return false;
		
		Provincia other = (Provincia) obj;
		
		if(governador == null) {
			if(other.governador != null) 
				return false;
		} else if(!governador.equals(other.governador))
			return false;
		
		return true;
		
	}
	
	@Override
	public String toString() {
		return "Provincia: " + super.toString() + " -> Governador: " + governador + "\n";
	}

}

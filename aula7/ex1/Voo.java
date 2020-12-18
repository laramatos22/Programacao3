package aula7.ex1;

/*Construa um programa que leia estes dois ficheiros para estruturas adequadas. Crie a
classe Voo, por exemplo, use conjuntos para armazenar os voos em memória*/

public class Voo {
	
	private Hora hora;
	private String vooID;
	private Companhia[] companhia;
	private String origem;
	private Hora atraso;
	private String obs;
	
	public Voo(String hora, String vooID, Companhia[] companhia, String origem, String atraso) {
		String h[] = hora.split(":");
		this.hora = new Hora(Integer.parseInt(h[0]), Integer.parseInt(h[1]));
		this.vooID = vooID;
		this.companhia = companhia;
		this.origem = origem;
		h = atraso.split(":");
		makeOBS();
	}
	
	public Voo(String hora, String vooID, Companhia[] companhia, String origem) {
		this(hora, vooID, companhia, origem, "0:0");
	}
	
	private void makeOBS() {
		if(atraso.equals(new Hora(0, 0)))
			obs = "";
		else
			obs = "Previsto: " + Hora.adicionarTempo(hora, atraso);
	}

	public Hora getHora() {return hora;}
	public String getVooID() {return vooID;}
	public Companhia[] getCompanhia() {return companhia;}
	public String getOrigem() {return origem;}
	public Hora getAtraso() {return atraso;}
	public String getObs() {return obs;}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atraso == null) ? 0 : atraso.hashCode());
		result = prime * result + ((companhia == null) ? 0 : companhia.hashCode());
		result = prime * result + ((vooID == null) ? 0 : vooID.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((obs == null) ? 0 : obs.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		Voo fly = (Voo) obj;
		
		if(atraso == null) {
			if(fly.atraso != null)
				return false;
		} else if(!atraso.equals(fly.atraso))
			return false;
		
		if(companhia == null) {
			if(fly.companhia != null)
				return false;
		} else if(!companhia.equals(fly.companhia))
			return false;
		
		if(vooID == null) {
			if(fly.vooID != null)
				return false;
		} else if(!vooID.equals(fly.vooID))
			return false;
		
		if(hora == null) {
			if(fly.hora != null)
				return false;
		} else if(!hora.equals(fly.hora))
			return false;	
		
		if(obs == null) {
			if(fly.obs != null)
				return false;
		} else if(!obs.equals(fly.obs))
			return false;
		
		if(origem == null) {
			if(fly.origem != null)
				return false;
		} else if(!origem.equals(fly.origem))
			return false;
		
		return true;
		
	}
	
	public String toString() {
		return hora.toString() + "\t" + vooID + "\t" + companhia.toString() 
				+ "\t" + origem + "\t" + atraso.toString() + "\t" + obs + "\n";
	}

}

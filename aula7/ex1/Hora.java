package aula7.ex1;

public class Hora implements Comparable<Hora> {

	private int hora;
	private int minutos;
	private int TempoMinutos;
	
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
		TempoMinutos = minutos + (hora * 60);
	}
	
	public Hora() {this(0, 0);}

	public int getHora() {return hora;}
	public int getMinutos() {return minutos;}
	public int getTempoMinutos() {return TempoMinutos;}
	
	public static String minsToHourString(int minutos) {
		int mins = minutos % 60;
		int hours = minutos / 60;
		return hours + ":" + mins;
	}
	
	public static Hora adicionarTempo(Hora inicio, Hora atraso) {
		Hora newHora = new Hora();
		newHora.hora = (inicio.hora + atraso.hora) % 24;
		newHora.minutos = (inicio.minutos + atraso.minutos) % 60;
		return newHora;
	}
	
	public String toString() {
		return hora+":"+minutos;
	}
	
	public int compareTo(Hora arg0) { //A hora é p argumento 0, daí arg0
		if(this.hora >arg0.hora) return 1;
		else if(this.hora == arg0.hora && this.minutos > arg0.minutos)	
			return 1;
		else if(this.hora == arg0.hora && this.minutos == arg0.minutos)
			return 0;
		else
			return -1;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hora;
		result = prime * result + minutos;
		return result;
	}	
	
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Hora other = (Hora) obj;
		
		if (hora != other.hora) return false;
		if (minutos != other.minutos) return false;
		return true;
	}
	
	
}

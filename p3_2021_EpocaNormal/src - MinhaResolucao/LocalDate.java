import java.util.Calendar;
import java.util.Objects;

public class LocalDate {
	
	private int dia, mes, ano;
	
	//Construtor
	public LocalDate(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Getters
	public int getDia() {return dia;}
	public int getMes() {return mes;}
	public int getAno() {return ano;}
	
	//Métodos
	
	//now()
	public static int now() {
		return Calendar.DAY_OF_YEAR();
	}
	
	//of(ano, mes, dia)
	public String of(int ano, int mes, int dia) {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dia, mes, ano);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		LocalDate other = (LocalDate) obj;
		
		return dia == other.dia && mes == other.mes && ano == other.ano;
		
	}
	
	@Override
	public String toString() {
		return "Local Date: " + dia+"-"+mes+"-"+ano;
	}

}

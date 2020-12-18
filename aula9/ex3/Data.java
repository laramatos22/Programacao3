package aula9.ex3;

import java.util.Calendar;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private int daysInMonths[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Data(int dia, int mes , int ano)
	{
		validarData(dia, mes, ano);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//CRIA UMA DATA PARA O DIA ATUAL (HOJE)
		public static Data today() {
			
			Calendar today = Calendar.getInstance();
			int dia = today.get(Calendar.DAY_OF_MONTH);
			int mes = today.get(Calendar.MONTH);
			int ano = today.get(Calendar.YEAR);
			
			return new Data(dia, mes, ano);
			
		}
	
	@Override
	public String toString()
	{
		return dia + "/" + mes + "/" + ano;
	}
	
	public int getDay() {return dia;}
	public int getMonth() {return mes;}
	public int getYear() {return ano;}
	
	private void validarData(int dia, int mes, int ano) 
	{
		if (mes < 0 || mes > 12)
		{
			throw new RuntimeException();
		}
		else if (anoBissexto() && daysInMonths[mes-1] < dia || dia < 0)
		{
			throw new RuntimeException();
		}
		else if (!anoBissexto() && mes != 2 && daysInMonths[mes-1] < dia || dia < 0 || daysInMonths[1] - 1 < dia )
		{
			throw new RuntimeException();
		}
	}
	
	private boolean anoBissexto()
	{
		return ((ano % 4 == 0 && ano % 100 == 0) || ano % 400 == 0);
	}

}

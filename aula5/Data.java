package aula5;

import java.util.Calendar;

public class Data {
	
	private final int dia, mes, ano;
	
	//CRIA UMA DATA PARA O DIA ATUAL (HOJE)
	public static Data today() {
		
		Calendar today = Calendar.getInstance();
		int dia = today.get(Calendar.DAY_OF_MONTH);
		int mes = today.get(Calendar.MONTH);
		int ano = today.get(Calendar.YEAR);
		
		return new Data(dia, mes, ano);
		
	}
	
	public Data (int d, int m, int a) {
		if(isValidData(d, m, a)) {
			this.ano = a;
			this.mes = m;
			this.dia = d;
			
		} else {
			throw new IllegalArgumentException ("Invalid Data!");
		}
	}
	
	public int dia() {return this.dia;}
	public int mes() {return this.mes;}
	public int ano() {return this.ano;}
	
	
	//indicar se os ints dia, mes, ano formam uma data v�lida
	private boolean isValidData(int dia, int mes, int ano) {
		
		//boolean valido que valida a data
		boolean valido = true;
		
		if (mes < 1 || mes > 12) {valido = false;}
		
		if (ano < 1) {valido = false;}
		
		if (dia < 0 || dia > diaDoMes(mes, ano)) {valido = false;}
		
		return valido;
	}
		
		//verificar os dias de cada m�s
		private int diaDoMes (int mes, int ano) {
			
			//para verificar se o ano � bissexto
			boolean bissexto = (ano%4==0 && ano%100!=0 || ano%400==0);
			
			//                 j   f   m   a   m   j   j   a   s   o   n   d
			int[] diasdoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			if (mes == 2) {
				//quando fevereiro � bissexto
				if (bissexto == true) {
					return diasdoMes[mes-1] +1; //fevereiro tem 29 dias quando � bissexto
				} else {
					return diasdoMes[mes-1];
				}
			}
			return diasdoMes[mes-1];
		}
		
	public String toString() {
		return String.format("%04d-%02d-%02d", ano, mes, dia);
	}
	
}
package aula3;

import java.util.Calendar;

public class Data {
	
	private final int dia, mes, ano;
	
	public Data() {
		
		Calendar today = Calendar.getInstance();
		this.dia = today.get(Calendar.DAY_OF_MONTH);
		this.mes = today.get(Calendar.MONTH);
		this.ano = today.get(Calendar.YEAR);
		
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
	
	
	//indicar se os ints dia, mes, ano formam uma data válida
	private boolean isValidData(int dia, int mes, int ano) {
		
		//boolean valido que valida a data
		boolean valido = true;
		
		if (mes < 1 || mes > 12) {valido = false;}
		
		if (ano < 1) {valido = false;}
		
		if (dia < 0 || dia > diaDoMes(mes, ano)) {valido = false;}
		
		return valido;
	}
		
		//verificar os dias de cada mês
		private int diaDoMes (int mes, int ano) {
			
			//para verificar se o ano é bissexto
			boolean bissexto = (ano%4==0 && ano%100!=0 || ano%400==0);
			
			//                 j   f   m   a   m   j   j   a   s   o   n   d
			int[] diasdoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			if (mes == 2) {
				//quando fevereiro é bissexto
				if (bissexto == true) {
					return diasdoMes[mes-1] +1; //fevereiro tem 29 dias quando é bissexto
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
package aula13.ex3;

public class Pessoa {
	
	private int cc;
	private String name;
	private Data bDay;
	
	public Pessoa (String n, int cartao, Data date) {
		
		cc = cartao;
		name = n;
		bDay = date;
		
	}

	//Getters
	public int getCC() {return cc;}
	public String getName() {return name;}
	public Data getbDay() {return bDay;}
	
	//Comparar Cartoes de Cidadao
	public int CompareToCC(Pessoa toCompare)
	{
		if(toCompare.cc < this.cc)
			return -1;
		else if (toCompare.cc == this.cc)
			return 0;
		else
			return 1;
	}

	//Comparar Nomes
	public int CompareToNome(Pessoa toCompare)
	{
		return (this.name).compareTo(toCompare.name);
	}
	
	//Função toString
	public String toString() {
		return "Cartao de Cidadao: " + cc 
				+ "\nNome da Pessoa: " + name
				+ "\nData de Nascimento: " + bDay;
	}

}

package Gelataria;

public class GeladoSimples implements Gelado {
	private String flavor;
	
	public GeladoSimples(String f) {
		// TODO Auto-generated constructor stub
		this.flavor = f;
	}
	@Override
	public void base(int i) {
		// TODO Auto-generated method stub
		System.out.println(i +" bolas de gelado de " + flavor);
	}

}

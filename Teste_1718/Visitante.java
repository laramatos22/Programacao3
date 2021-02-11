import java.util.Objects;

public class Visitante {
	
	private static int num=1;
	private int numero;
	private String entrada;
	
	public Visitante(String entrada) {
		this.entrada = entrada;
		numero = num++;
	}
	
	public int getNum() {return numero;}
	public String getEntrada() {return entrada;}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Visitante other = (Visitante) obj;
		
		return numero == other.numero && Objects.equals(entrada, other.entrada);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numero, entrada);
	}
	
	@Override
	public String toString() {
		return "Visitante: " + " nº " + numero + ", entrada " + entrada;
	}

}

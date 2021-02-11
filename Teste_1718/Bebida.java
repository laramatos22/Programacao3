import java.util.*;

public class Bebida {
	
	enum TipoBebida {
		VINHO, CERVEJA, COLA, SUMO, AGUA;
	}
	
	private String nome;
	private double teorAlcool;
	private TipoBebida tipo;
	
	//Construtor
	public Bebida(String nome, double teorAlcool, TipoBebida tipo) {
		this.nome = nome;
		this.teorAlcool = teorAlcool;
		this.tipo = tipo;
	}
	
	//Getters
	public String getNome() {return nome;}
	public double getTeorAlcool() {return teorAlcool;}
	public TipoBebida getTipo() {return tipo;}
	
	//Métodos
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Bebida other = (Bebida) obj;
		
		return Double.compare(other.teorAlcool, teorAlcool) == 0 && Objects.equals(nome, other.nome) && tipo == other.tipo;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, teorAlcool, tipo);
	}
	
	@Override
	public String toString() {
		return "Bebida: " + nome + "[Teor de Alcool: " + teorAlcool + "]";
	}

}

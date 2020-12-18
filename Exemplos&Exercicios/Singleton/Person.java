package Singleton;

public class Person {
	
	private static String nome;
	private static int idade;
	private static Person pessoa;
	
	public static Person getPerson() {
		if(pessoa == null)
			pessoa = new Person(nome, idade);
		return pessoa;
	}
	
	private Person(String nome, int idade) {
		Person.setNome(nome);
		Person.setIdade(idade);
	}
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Person.nome = nome;
	}
	public static int getIdade() {
		return idade;
	}
	public static void setIdade(int idade) {
		Person.idade = idade;
	}
	
	

}

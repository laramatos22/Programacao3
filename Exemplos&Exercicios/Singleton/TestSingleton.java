package Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person.setNome("Lara");
		Person.setIdade(20);
		
		System.out.println(Person.getNome());
		System.out.println(Person.getIdade());

	}

}

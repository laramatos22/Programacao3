package Reflections;

public class ManipulacaoVetores {
	
	public static void main (String[] args) {
		
		try {
			String[] z = new String[] {"Jim", "John", "Joe"};
			final Class<?> type = z.getClass();
			if(!type.isArray()) {
				throw new IllegalArgumentException();
			} else {
				System.out.println("Name = " + type.getName() + 
									"\nType = " + type.getComponentType());
			}
		} catch(final Exception ex) {
			ex.printStackTrace();
		}
		
	}

}

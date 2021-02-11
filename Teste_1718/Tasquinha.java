//import java.util.ArrayList;
//import java.util.List;
import java.util.Objects;

public class Tasquinha extends Tenda {
	
	private String menu[];
	
	public Tasquinha(int numero, String nome, String menu[]) {
		super(numero, nome);
		this.menu = menu;
	}
	
	public Tasquinha(int numero, String nome) {
		this(numero, nome, new String[10]);
	}
	
	public String[] getMenu() {return menu;}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		if(!super.equals(obj)) return false;
		
		Tasquinha other = (Tasquinha) obj;
		
		return Objects.equals(menu, other.menu);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), menu);
	}
	
			private String printMenu() {
				int i=1;
				String ret = "";
				for(String str : menu) {
					if(i == menu.length)
						ret += str;
					else
						ret += str + ", ";
					i++;
				}
				return ret;
			}
			
	@Override
	public String toString() {
		return "Tasquinha:\t [menu: " + printMenu() +"]" + super.toString();
	}

}

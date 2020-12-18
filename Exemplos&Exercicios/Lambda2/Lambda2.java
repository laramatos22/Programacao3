package Lambda2;

public class Lambda2 {
	
	public static void main(String[] args) {
		
		Ecra xd = (String s) -> {
			if(s.length() > 2)
				System.out.print(s);
			else
				System.out.print("-");
		};
		xd.escreve("Lambda print");
		xd.escreve("?");
		
	}

}

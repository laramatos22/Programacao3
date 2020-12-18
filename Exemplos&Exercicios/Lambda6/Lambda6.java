package Lambda6;

public class Lambda6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This block lambda reverses the characters in a string
		StringFunc reverse = (str) -> {
			String result = "";
			int i;
			for(i = str.length() - 1; i>=0; i--)
				result += str.charAt(i);
			return result;
		};
		
		System.out.println("Lambda reversed is " + reverse.func("Lambda"));
		System.out.println("Expression reversed is " + reverse.func("Expression"));

	}

}

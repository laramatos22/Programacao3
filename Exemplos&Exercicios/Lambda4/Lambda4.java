package Lambda4;

public class Lambda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This lambda expression determines if one number is a factor of another
		NumericTest2 isFactor = (n, d) -> (n%d) == 0;
		if(isFactor.test(10, 2))
			System.out.println("2 is a factor of 10");
		if(!isFactor.test(10, 3))
			System.out.println("3 is not a factor os 10");

	}

}

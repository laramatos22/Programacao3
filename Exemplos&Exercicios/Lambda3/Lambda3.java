package Lambda3;

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A lambda expression that tests if a number is even
		NumericTest isEven = (n) -> (n%2) == 0;
		if(isEven.test(10)) System.out.println("10 is even");
		if(!isEven.test(9)) System.out.println("9 is not even");
		
		//Now, use a lambda expression that tests if a number is non-negative
		NumericTest isNotNeg = (n) -> n>=0;
		if(isNotNeg.test(1)) System.out.println("1 is not non-negative");
		if(!isNotNeg.test(-1)) System.out.println("-1 is negative");

	}

}

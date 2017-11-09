package lab6_part2;

public class Test {
	public static void main(String[] args) {
		 
		String s1="1 + 3 * 8";
	    String s2="8-2+8/4+6-1-6/2";
	    String s3="8-3-4*6 +    3";
		System.out.println(CostomizedAlgorithms.calculate(InfixToPostfix.change(s1)));
		System.out.println(CostomizedAlgorithms.calculate(InfixToPostfix.change(s2)));
		System.out.println(CostomizedAlgorithms.calculate(InfixToPostfix.change(s3)));


	}

}

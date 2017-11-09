package lab3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// ask user to enter the information
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the first employee's name");
		String name1 = s.next();
		System.out.println("Please enter the first employee's ID");
		int ID1 = s.nextInt();
		System.out.println("Please enter the second employee's name");
		String name2 = s.next();
		System.out.println("Please enter the second employee's ID");
		int ID2 = s.nextInt();
		s.close();
		Employee e1 = new Employee(ID1, name1);
		Employee e2 = new Employee(ID2, name2);
		System.out.println("Here're the records sorted by the given requirements");
		// calculate the difference between the employee e1 and e2
		int result = e1.compareTo(e2);
		// print the statement
		if (result == 0)
			System.out.println("the first employee " + e1 + " and the second employee " + e2 + " are equal");
		else if (result > 0)
			System.out.println("the first employee " + e1 + " is greater than the second employee " + e2);
		else if (result < 0)
			System.out.println("the first employee " + e1 + " is smaller than the second employee " + e2);
	}

}

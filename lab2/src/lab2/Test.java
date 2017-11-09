package lab2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Enter radius of a circle:");
		// ask user to input the circle's radius
		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		Circle c = new Circle(radius);
		s.close();
		System.out.println("Area of a circle is:");
		System.out.println(c.calcArea());
		// output the circle's area

	}

}
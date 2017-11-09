package lab6_part2;

import lab6_part1.LinkedListStack;
import lab6_part1.StackUnderflowException;

public class CostomizedAlgorithms {
	private static LinkedListStack<String> lls;

	public static double calculate(String s) {
		lls = new LinkedListStack<String>();
		String[] s1 = s.split("");
		double f1;
		double f2;
		double result = 0.0;

		try {
			for (int i = 0; i < s1.length; i++) {
				if (s1[i].equals("+") || s1[i].equals("-") || s1[i].equals("*") || s1[i].equals("/")) {
					f2 = Double.parseDouble(lls.peek());
					lls.pop();
					f1 = Double.parseDouble(lls.peek());
					lls.pop();
					result = specify(f1, f2, s1[i]);
					lls.push(String.valueOf(result));
				} else {
					lls.push(s1[i]);
				}

			}
			result = Double.parseDouble(lls.peek());
			lls.pop();
		} catch (StackUnderflowException sue) {
			throw new NotEnoughOperands("not enough operands");
		}
		if (!lls.isEmpty()) {
			throw new TooManyOperands("too many operands");
		}

		return result;

	}

	public static double specify(double d1, double d2, String s) {
		switch (s) {
		case "+":
			return d1 + d2;
		case "-":
			return d1 - d2;
		case "*":
			return d1 * d2;
		case "/":
			return d1 / d2;
		default:
			return 0.0;
		}
	}

}

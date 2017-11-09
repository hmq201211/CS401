package lab7_part1;

public class Jacobsthal {

	public static long jacobsthal_recursive(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return jacobsthal_recursive(n - 1) + 2 * jacobsthal_recursive(n - 2);

		}

	}

	public static long jacobsthal_iterative(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int count = 2;
			long temp;
			long result_before = 0;
			long result_current = 1;
			while (count < n) {
				temp = result_current + 2 * result_before;
				result_before = result_current;
				result_current = temp;
				count++;
			}
			return result_current;

		}
	}

	public static void main(String[] args) {
		showTime();
		argmax();
	}

	public static void showTime() {
		long startTime = System.currentTimeMillis();
		System.out.print("Recursive version:");
		for (int i = 0; i < 10; i++) {
			System.out.print(jacobsthal_recursive(i) + " ");
		}
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time taken to execute recursive version:" + (endTime - startTime) + " msec");
		startTime = System.currentTimeMillis();
		System.out.print("Iterative version:");
		for (int i = 0; i < 10; i++) {
			System.out.print(jacobsthal_recursive(i) + " ");
		}
		endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time taken to execute iterative version:" + (endTime - startTime) + " msec");

	}

	public static void argmax() {
		long result_before = 0;
		long result_current = 1;
		int count = 2;
		long temp;
		while (true) {
			temp = result_current + 2 * result_before;
			if (temp < 0) {
				count--;
				break;
			}
			result_before = result_current;
			result_current = temp;
			count++;
		}
		System.out.println("Max x is "+count);
		System.out.println("Max jacobsthal number is "+result_current);
	}

}

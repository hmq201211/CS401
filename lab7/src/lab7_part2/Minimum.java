package lab7_part2;

public class Minimum {
	public static int minimum(int A[], int size) {

		if (size == 1) {
			return A[size - 1];
		} else {
			return Math.min(minimum(A, size - 1), A[size - 1]);
		}
	}

	public static void main(String[] args) {
		int A[] = { 10, -20, 1, 2, 0, 5, 100 };
		int s = minimum(A, A.length);
		System.out.println(s);
	}

}

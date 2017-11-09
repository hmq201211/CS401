package lab8_part3;

import java.util.Scanner;

public class PalindromeTest {
	public static void main(String[] args) {
		System.out.println("Please insert string");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		LinkedQueue<Character> lq = new LinkedQueue<Character>();
		char[] c = str.toCharArray();
		for (char t : c) {
			lq.enqueue(t);
		}
		String s1 = printList(lq.front, new StringBuffer());
		String s2 = revPrintList(lq.front, new StringBuffer());
		System.out.println(s1);
		System.out.println(s2);
		if (s1.equals(s2)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
		s.close();

	}

	public static String printList(LLNode<Character> l, StringBuffer sb) {

		if (l != null) {
			sb.append(l.getElement());
			printList(l.getLink(), sb);

		}
		return sb.toString();
	}

	public static String revPrintList(LLNode<Character> l, StringBuffer sb) {

		if (l != null) {
			revPrintList(l.getLink(), sb);
			sb.append(l.getElement());

		}
		return sb.toString();
	}

}

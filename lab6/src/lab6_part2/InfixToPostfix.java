package lab6_part2;

import lab6_part1.LinkedListStack;

public class InfixToPostfix {
	private static StringBuffer sb ;
	private static LinkedListStack<Character> lls;
	private static char temp;

	public static String change(String s) {
		sb = new StringBuffer();
		lls = new LinkedListStack<Character>();
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			if (temp <= 57 && temp >= 48) {
				sb.append(temp);
			} else if (temp == '+' || temp == '-' || temp == '*' || temp == '/') {
				if (lls.isEmpty()) {
					lls.push(temp);
				} else {
					if (temp == '+' || temp == '-') {
						while (!lls.isEmpty()) {
							sb.append(lls.peek());
							lls.pop();
						}
						lls.push(temp);
					} else {
						while (!lls.isEmpty()) {
							if (lls.peek() == '*' || lls.peek() == '/') {
								sb.append(lls.peek());
								lls.pop();
							} else
								break;
						}
						lls.push(temp);

					}
				}
			}
		}
		while (!lls.isEmpty()) {
			sb.append(lls.peek());
			lls.pop();
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(change("3 + 5 * 2 - 8 / 4"));
	}

}

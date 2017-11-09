package lab6_part1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import lab5.Employee;

public class Test {
	public static void main(String[] args) {
		String[] temp = readFile();
		LinkedListStack<Employee> lls = createLinkedListStack(temp);
		System.out.println(lls.peek());
		lls.pop();
		lls.pop();
		System.out.println(lls.peek());
		
	}
	private static String[] readFile() {
		String[] s = new String[30];
		int index = 0;
		try {
			InputStream is = new FileInputStream("lab4Example.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String str = null;
			while (true) {
				str = reader.readLine();
				if (str != null)
					s[index++] = str;
				else
					break;
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	public static LinkedListStack<Employee> createLinkedListStack(String[] s){
		LinkedListStack<Employee> lls= new LinkedListStack<Employee>();
		for (String s1 : s) {
			String[] s2 = s1.split(" ");
			int id = Integer.parseInt(s2[1]);
			String name = s2[0];
			Employee e = new Employee(id, name);
			lls.push(e);
		}
		return lls;
	}

}

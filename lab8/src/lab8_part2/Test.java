package lab8_part2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import lab8_part1.Employee;



public class Test {
	public static void main(String[] args) {
		String[] temp = readFile();
		ArrayBoundedFloatingFrontQueue<Employee> lls = createLinkedQueue(temp);
		System.out.println(lls.dequeue());
		lls.dequeue();
		lls.dequeue();
		System.out.println(lls.dequeue());
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
	public static ArrayBoundedFloatingFrontQueue<Employee> createLinkedQueue(String[] s){
		ArrayBoundedFloatingFrontQueue<Employee> lq= new ArrayBoundedFloatingFrontQueue<Employee>();
		for (String s1 : s) {
			String[] s2 = s1.split(" ");
			int id = Integer.parseInt(s2[1]);
			String name = s2[0];
			Employee e = new Employee(id, name);
			lq.enqueue(e);
		}
		return lq;
	}

}

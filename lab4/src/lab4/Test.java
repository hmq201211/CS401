package lab4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		System.out.println("methodA is O(N^3)");
		System.out.println("methodB is O(N^2)");
		System.out.println("methodC is O(NlogN)");
		Employee[] e=read(readFile());
		double start, end;
		start = System.currentTimeMillis(); 
		e=bubbleSort(e);
		end = System.currentTimeMillis() - start; 
		System.out.println("time ="+end);
		for (Employee a : e) {
			System.out.println(a);
		}
		System.out.println("bubbleSort is O(N^2)");
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

	private static Employee[] read(String[] args) {
		String[] s1;
		Employee[] emp = new Employee[30];
		int i = 0;
		for (String s : args) {
			s1 = s.split(" ");
			Employee e = new Employee(Integer.parseInt(s1[1]), s1[0]);
			emp[i++] = e;
		}
		return emp;
	}

	private static Employee[] bubbleSort(Employee[] e) {
		for (int i = e.length - 1; i > 0; i--) {
			int index = 0;
			for (int j = 0; j <= i; j++) {
				if (e[index].compareTo(e[j]) < 0)
					index = j;
			}
			swap(e, i, index);
		}
		return e;
	}

	private static void swap(Comparable<Employee>[] c, int a, int b) {
		Comparable<Employee> temp = c[a];
		c[a] = c[b];
		c[b] = temp;
	}

}

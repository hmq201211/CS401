package lab5;

import java.util.ArrayList;

public class ArrayListStack {
	private ArrayList<Employee> al= new ArrayList<Employee>();
	public void Push(Employee e) {
		al.add(e);
	}
	public Employee pop() {
		return al.remove(al.size()-1);
	}
	public Employee peak() {
		return al.get(al.size()-1);
	}

}

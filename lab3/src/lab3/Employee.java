package lab3;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
	// Employee's Variables
	private int ID;
	private String name;

	// public static final Comparator<Employee> Compare_By_Name_And_ID =new
	// Comparator<Employee>() {
	// @Override
	// public int compare(Employee e0, Employee e1) {
	// return e0.compareTo(e1);
	// }
	// };
	// common constructor
	public Employee() {

	}

	// special constructor
	public Employee(int ID, String Name) {
		this.ID = ID;
		this.name = Name;
	}

	// setters and getters
	public int getID() {
		return this.ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// override Object's toString method
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + name + "]";
	}
	// override Object's hashCode method and equals method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// implements comparable's compareTo method
	@Override
	public int compareTo(Employee e) {
		if (this.name.equals(e.name)) {
			if (this.ID == e.ID) {
				return 0;
			} else
				return Integer.compare(this.ID, e.ID);
		} else
			return this.name.compareTo(e.name);

	}

	// implements comparator's compare method
	@Override
	public int compare(Employee e0, Employee e1) {
		// return Compare_By_Name_And_ID.compare(e0,e1);
		//
		return e0.compareTo(e1);

	}

}

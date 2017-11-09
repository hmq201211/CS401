package lab4;

public class Employee implements Comparable<Employee> {
	// Employee's Variables
	private int ID;
	private String name;

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
		return this.ID - e.ID;
	}

}

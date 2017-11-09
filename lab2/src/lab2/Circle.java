package lab2;

public class Circle implements Comparable<Circle> {
	private double radius;// Circle's variable

	public Circle() {

	}
	// Common Constructor

	public Circle(double radius) {
		this.radius = radius;
	}
	// Special Constructor

	public void setRadius(double radius) {
		this.radius = radius;
	}
	// radius's setter method

	public double getRadius() {
		return this.radius;
	}
	// radius's getter method,return double;

	public String toString() {
		return "Circle,radius = " + this.radius;
	}

	// toString method,return String;
	public double calcArea() {
		return Math.PI * radius * radius;
	}

	// method to calculate the area of the circle, return double;
	@Override
	public int compareTo(Circle c) {
		if (this.radius > c.radius) {
			return 1;
		} else if (this.radius < c.radius) {
			return -1;
		} else
			return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (this == o) {
			return true;
		} else if (getClass() != o.getClass()) {
			return false;
		} else {
			Circle c = (Circle) o;
			if (this.radius == c.radius) {
				return true;
			} else {
				return false;
			}
		}
	}

}
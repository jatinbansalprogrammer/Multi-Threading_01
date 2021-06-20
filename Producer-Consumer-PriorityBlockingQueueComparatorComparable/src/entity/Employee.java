package entity;

public class Employee implements Comparable<Employee> {
	private Integer id;

	public Employee(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.valueOf(this.id);
	}

	@Override
	public int compareTo(Employee e) {
		return this.id - e.id;// Sorting by Employees' ID in Descring Order.
	}
}

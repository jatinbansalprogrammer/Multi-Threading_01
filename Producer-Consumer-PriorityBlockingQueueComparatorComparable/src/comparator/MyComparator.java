package comparator;

import java.util.Comparator;

import entity.Employee;

public class MyComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
}

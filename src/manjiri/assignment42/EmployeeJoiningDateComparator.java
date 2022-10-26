package manjiri.assignment42;

import java.util.Comparator;

public class EmployeeJoiningDateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getempJoiningDate().compareTo(o2.getempJoiningDate());
	}
}
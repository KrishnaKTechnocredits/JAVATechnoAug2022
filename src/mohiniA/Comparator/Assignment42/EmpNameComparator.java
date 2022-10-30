package mohiniA.Comparator.Assignment42;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}

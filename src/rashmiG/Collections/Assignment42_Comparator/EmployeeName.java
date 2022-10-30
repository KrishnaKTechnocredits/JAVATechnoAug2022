package rashmiG.Collections.Assignment42_Comparator;

import java.util.Comparator;

public class EmployeeName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}
//Assignment - 42 : 21th Oct'2022

package komalShrivastava.Collections.Comparator;

import java.util.Comparator;

public class EmployeeEmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}	
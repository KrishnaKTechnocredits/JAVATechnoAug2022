//Assignment - 42 : 21th Oct'2022

package komalShrivastava.Collections.Comparator;

import java.util.Comparator;

public class EmployeeEmpDeptIDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpDeptId()-o2.getEmpDeptId();
	}
}

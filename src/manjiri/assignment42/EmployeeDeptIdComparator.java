package manjiri.assignment42;

import java.util.Comparator;

public class EmployeeDeptIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpDeptId() - o2.getEmpDeptId();
	}

}

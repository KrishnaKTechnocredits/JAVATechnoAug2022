package mohiniA.Comparator.Assignment42;

import java.util.Comparator;

public class EmpDptComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpDeptId() - o2.getEmpDeptId();
	}

}

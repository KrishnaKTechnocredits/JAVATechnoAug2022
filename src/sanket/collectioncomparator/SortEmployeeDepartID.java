package sanket.collectioncomparator;

import java.util.Comparator;

public class SortEmployeeDepartID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpDeptId().compareTo(o2.getEmpDeptId());
	}
}

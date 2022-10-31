package hemanshi;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee42>{

	@Override
	public int compare(Employee42 o1, Employee42 o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
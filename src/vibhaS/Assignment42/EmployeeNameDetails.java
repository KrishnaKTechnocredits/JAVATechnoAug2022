package vibhaS.Assignment42;

import java.util.Comparator;

public class EmployeeNameDetails implements Comparator<Employee1> {

	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}

package swapnilMaheshwari.Collection.Comparator.Assignment42;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {
		return e1.getEmployeeName().compareTo(e2.getEmployeeName());
	}
	

}

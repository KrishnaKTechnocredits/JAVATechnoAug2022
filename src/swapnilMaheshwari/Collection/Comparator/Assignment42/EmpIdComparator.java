package swapnilMaheshwari.Collection.Comparator.Assignment42;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<EmployeeData> {

	public int compare(EmployeeData e1, EmployeeData e2) {
		return e1.getEmployeeId()-e2.getEmployeeId();
	}	

}

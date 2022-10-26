package pujaSah.CollectionsAssignment;

import java.util.Comparator;

public class DateOfJoiningComparator implements Comparator<EmployeeDetails> {

	// implementing compare() method of Comparator Interface
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.getEmpDateOfJoining().compareTo(o2.getEmpDateOfJoining());
	}
}

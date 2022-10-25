package swatiM.assignment.collection;

import java.util.Comparator;

public class Assignment42_EmployeeNameComparator implements Comparator<Assignment42_Employee> {
	@Override
	public int compare(Assignment42_Employee o1, Assignment42_Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}



}

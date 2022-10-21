package pujaSah.CollectionsAssignment;

import java.util.Comparator;

class SalaryComparator implements Comparator<EmployeeDetails> {

	// implementing compare() method of Comparator Interface
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.empSalary - o2.empSalary;
	}
}

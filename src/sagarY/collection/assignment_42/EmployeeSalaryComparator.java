package sagarY.collection.assignment_42;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<EmployeeDetails>{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.getEmpSalary()-o2.getEmpSalary();
	}

}

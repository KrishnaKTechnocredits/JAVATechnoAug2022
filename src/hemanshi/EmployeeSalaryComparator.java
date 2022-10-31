package hemanshi;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee42>{

	@Override
	public int compare(Employee42 o1, Employee42 o2) {
		return o1.getEmpSalary()-o2.getEmpSalary();
	}

}
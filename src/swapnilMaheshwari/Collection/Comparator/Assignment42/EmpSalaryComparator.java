package swapnilMaheshwari.Collection.Comparator.Assignment42;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<EmployeeData> {
	
	@Override
	public int compare(EmployeeData empSalary1, EmployeeData empSalary2) {
		return empSalary1.getEmployeeSalary()-empSalary2.getEmployeeSalary();
	}

	}

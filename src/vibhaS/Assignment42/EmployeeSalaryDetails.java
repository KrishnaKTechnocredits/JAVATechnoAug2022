package vibhaS.Assignment42;

import java.util.Comparator;

public class EmployeeSalaryDetails implements Comparator<Employee1> {

	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getEmpSalary() - o2.getEmpSalary();
	}
}

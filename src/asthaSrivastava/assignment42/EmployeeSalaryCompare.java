package asthaSrivastava.assignment42;

import java.util.Comparator;

public class EmployeeSalaryCompare implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee emp1 = (Employee)o1;
		Employee emp2 =(Employee) o2;
		return (int) (emp1.getEmpSalary()- (emp2.getEmpSalary()));
	}
}

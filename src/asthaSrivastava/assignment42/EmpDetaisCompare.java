package asthaSrivastava.assignment42;

import java.util.*;

public class EmpDetaisCompare {

	ArrayList<Employee> getEmployeeCompDetails() {
		ArrayList<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee("Priyanka", 367724, 50, 56009.4));
		listOfEmp.add(new Employee("Vimal", 367725, 53, 98000));
		listOfEmp.add(new Employee("Sai", 367799, 53, 88000));
		listOfEmp.add(new Employee("Amaresh", 244455, 54, 75000));

		System.out.println("Sorting based om Salary");
		Collections.sort(listOfEmp, new EmployeeSalaryCompare());
		return listOfEmp;
	}

	public static void main(String[] args) {
		EmpDetaisCompare emp1 = new EmpDetaisCompare();
		// System.out.println("Sorted Sequence is");
		ArrayList<Employee> listOfEmp = emp1.getEmployeeCompDetails();
		for (Employee emp : listOfEmp) {
			System.out.println(emp.getEmpName() + "-->" + emp.getEmpDeptId() + "-->" + emp.getEmpId() + "-->"
					+ emp.getEmpSalary());
		}
	}
}

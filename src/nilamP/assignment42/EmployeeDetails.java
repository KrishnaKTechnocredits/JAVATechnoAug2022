package nilamP.assignment42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDetails {

	void ProcessDetails() {
		ArrayList<Employee> listOfEmp = new ArrayList<>();
		Employee emp1 = new Employee("Nilam", 1, 50000, 1);
		Employee emp2 = new Employee("Krishna", 6, 550000, 2);
		Employee emp3 = new Employee("Maulik", 12, 60000, 8);

		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);

		Collections.sort(listOfEmp, new EmployeeSalaryComparator());
		for (Employee emp : listOfEmp) {
			System.out.println(
					emp.getEmpName() + "\t" + emp.getEmpId() + "\t" + emp.getEmpSalary() + "\t" + emp.getEmpDeptId());

		}

	}

	public static void main(String[] args) {

		EmployeeDetails emp = new EmployeeDetails();
		emp.ProcessDetails();

	}
}

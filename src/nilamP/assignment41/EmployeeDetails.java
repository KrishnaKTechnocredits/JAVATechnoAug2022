package nilamP.assignment41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Nilam", 1, 50000, 1);
		Employee emp2 = new Employee("Krishna", 6, 550000, 2);
		Employee emp3 = new Employee("Maulik", 12, 60000, 8);

		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		Collections.sort(listOfEmp);

		for (Employee e : listOfEmp) {
			System.out.println(
					e.getEmpName() + "---" + e.getEmpId() + "----" + e.getEmpSalary() + "---" + e.getEmpDeptId());
		}
	}
}

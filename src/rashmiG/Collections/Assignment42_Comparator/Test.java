/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.*/

package rashmiG.Collections.Assignment42_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	static ArrayList<Employee> getEmpDetails() {
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee("Aarav", 1234, 500000, "A908"));
		listOfEmployee.add(new Employee("Rina", 6789, 800000, "D789"));
		listOfEmployee.add(new Employee("Anil", 1909, 900000, "D789"));
		listOfEmployee.add(new Employee("Tina", 8909, 120000, "E876"));
		listOfEmployee.add(new Employee("Tina", 4567, 800000, "D789"));

		// Collections.sort(listOfEmployee, new EmployeeId());
		// Collections.sort(listOfEmployee, new EmployeeName());
		Collections.sort(listOfEmployee, new EmployeeSalary());
		return listOfEmployee;
	}

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployee = Test.getEmpDetails();
		System.out.println("EmpName-->EmpId-->EmpSalary-->EmpDeptId\n");
		for (Employee e : listOfEmployee) {
			System.out.println(e);
		}
	}
}
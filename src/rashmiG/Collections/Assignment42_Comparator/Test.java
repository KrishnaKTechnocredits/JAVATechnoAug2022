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
		listOfEmployee.add(new Employee("Aarav", 1234, 500000, "A908", "2022-05-09"));
		listOfEmployee.add(new Employee("Rina", 6789, 800000, "D789", "2020/01-20"));
		listOfEmployee.add(new Employee("Anil", 1909, 900000, "D789", "2020-02-28"));
		listOfEmployee.add(new Employee("Tina", 8909, 120000, "E876", "2019-06-5"));
		listOfEmployee.add(new Employee("Tina", 4567, 800000, "D789", "2018-06-5"));

		// Collections.sort(listOfEmployee, new EmployeeId());
		// Collections.sort(listOfEmployee, new EmployeeName());
		// Collections.sort(listOfEmployee, new EmployeeSalary());
		 Collections.sort(listOfEmployee, new EmployeeJoiningDate());
		// Collections.sort(listOfEmployee, new EmployeeDeptId());

		return listOfEmployee;
	}

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployee = Test.getEmpDetails();
		System.out.println("EmpName-->EmpId-->EmpSalary-->EmpDeptId-->EmpJoinigDate\n");
		for (Employee e : listOfEmployee) {
			System.out.println(e);
		}
	}
}
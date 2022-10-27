/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.*/

package shubhamG.Assignment41to50.Assignment42Comparator;

import java.util.ArrayList;
import java.util.Collections;

import sagarY.collection.assignment_42.EmployeeDetails;

/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.
*/
public class Test {

	void getEmployeeDetails() {
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee("Shubham Gupta", 148308, 65303, "QA"));
		listOfEmployee.add(new Employee("Mukul Gupta", 148309, 50678, "QA1"));
		listOfEmployee.add(new Employee("Harshit Bhuradia", 148310, 61987, "Developer"));
		listOfEmployee.add(new Employee("Shubham Barua", 148305, 76543, "BA"));
		listOfEmployee.add(new Employee("Abc Def", 150223, 63664, "Test Lead"));

		System.out.println("Sorting based on Employee Name:\n");
		Collections.sort(listOfEmployee, new EmployeeName());
		for (Employee emp : listOfEmployee) {
			System.out.println(emp.getEmpName() + " -->" + emp.getEmpId() + " --> " + emp.getEmpSalary() + " --> "
					+ emp.getEmpDeptId());
		}
		System.out.println("---------------------------------------------------");

		System.out.println("\nSorting based on Employee Id:\n");
		Collections.sort(listOfEmployee, new EmployeeId());
		for (Employee emp : listOfEmployee) {
			System.out.println(emp.getEmpName() + " -->" + emp.getEmpId() + " --> " + emp.getEmpSalary() + " --> "
					+ emp.getEmpDeptId());
		}
		System.out.println("---------------------------------------------------");

		System.out.println("\nSorting based on Employee Salary:\n");
		Collections.sort(listOfEmployee, new EmployeeSalary());
		for (Employee emp : listOfEmployee) {
			System.out.println(emp.getEmpName() + " -->" + emp.getEmpId() + " --> " + emp.getEmpSalary() + " --> "
					+ emp.getEmpDeptId());
		}

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.getEmployeeDetails();
	}
}
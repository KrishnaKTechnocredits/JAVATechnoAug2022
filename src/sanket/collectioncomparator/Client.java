/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.
*/

package sanket.collectioncomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	static void getEmployeeDetails() {

		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee("Arundhati", "AASD", "GH675", 300500));
		listOfEmployee.add(new Employee("Rajesh", "TYRE", "JH765", 307500));
		listOfEmployee.add(new Employee("Suraj", "YUHN", "IU876", 200500));
		listOfEmployee.add(new Employee("Kajal", "YHNB", "LK876", 370500));
		listOfEmployee.add(new Employee("Nishant", "UYTR", "JH765", 103500));

		System.out.println("Sorting based on Employee Salary");
		Collections.sort(listOfEmployee, new SortEmployeeSalary());
		for (Employee emp : listOfEmployee) {
			System.out.println(emp);
		}

		System.out.println("\n");

		System.out.println("Sorting based on Employee Name");
		Collections.sort(listOfEmployee, new SortEmployeeName());
		for (Employee emp : listOfEmployee) {
			System.out.println(emp);
		}

		System.out.println("\n");

		System.out.println("Sorting based on Employee ID");
		Collections.sort(listOfEmployee, new SortEmployeeID());
		for (Employee emp : listOfEmployee) {
			System.out.println(emp);
		}

		System.out.println("\n");

		System.out.println("Sorting based on Employee Department ID");
		Collections.sort(listOfEmployee, new SortEmployeeDepartID());
		for (Employee emp : listOfEmployee) {
			System.out.println(emp);
		}
	}

	public static void main(String[] args) {
		getEmployeeDetails();
	}
}

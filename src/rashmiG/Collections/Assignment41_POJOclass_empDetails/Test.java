/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.*/

package rashmiG.Collections.Assignment41_POJOclass_empDetails;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	static void printEmployeeDetails() {
		Employee e1 = new Employee("Tina", 78909, 1000000, "D-109");
		Employee e2 = new Employee("Kapil", 11456, 500000, "D-200");
		Employee e3 = new Employee("Suman", 90889, 300000, "A-500");
		Employee e4 = new Employee("Karan", 50889, 500000, "E-500");
		Employee e5 = new Employee("Suman", 80889, 300000, "A-500");
		Employee e6 = new Employee("Karan", 50889, 500000, "E-500");

		Set<Employee> empDetails = new TreeSet<Employee>();

		empDetails.add(e1);
		empDetails.add(e2);
		empDetails.add(e3);
		empDetails.add(e4);
		empDetails.add(e5);
		empDetails.add(e6);
		for (Object obj : empDetails) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		printEmployeeDetails();
	}
}
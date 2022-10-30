/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.*/

package komalShrivastava.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSortTestClass{

	public static void main(String[] args) {
		ArrayList<Employee> empData = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("Emma", 1, 4500000, 01);
		Employee emp2 = new Employee("Harry", 2, 9500000, 02);
		Employee emp3 = new Employee("Rob", 2, 150000, 02);
		Employee emp4 = new Employee("Draco", 2, 2500000, 03);
		
		empData.add(emp1);
		empData.add(emp2);
		empData.add(emp3);
		empData.add(emp4);
		
		Collections.sort(empData);
		for(Employee emp : empData) {
			System.out.println(emp);
		}
	}
}

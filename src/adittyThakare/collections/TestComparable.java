/*Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.*/

package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Aditty", 101, 880000, 250);
		Employee emp2 = new Employee("Tanya", 102, 760000, 356);
		Employee emp3 = new Employee("Ankush", 103, 330000, 133);
		Employee emp4 = new Employee("Ashish", 104, 708000, 988);
		Employee emp5 = new Employee("Nisha", 105, 987000, 555);

		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);
		listOfEmp.add(emp5);
		
		System.out.println("Sort Employee object based on Salary!");
		System.out.println("\nInput Sequence:");
		for (Employee emp : listOfEmp) {
			
			System.out.println(
					emp.getEmpName() + "\t" + emp.getEmpId() + "\t" + emp.getEmpSalary() + "\t" + emp.getEmpDeptId());
		}
		System.out.println("\nSorted sequence: ");
		Collections.sort(listOfEmp);

		for (Employee emp : listOfEmp) {
			
			System.out.println(
					emp.getEmpName() + "\t" + emp.getEmpId() + "\t" + emp.getEmpSalary() + "\t" + emp.getEmpDeptId());
		}
	}
}

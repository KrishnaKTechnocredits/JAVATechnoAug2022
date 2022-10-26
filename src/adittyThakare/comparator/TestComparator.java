/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.*/
package adittyThakare.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {

	void processEmployeeDetails() {
		ArrayList<EmployeeNew> listOfEmp = new ArrayList<EmployeeNew>();

		EmployeeNew emp1 = new EmployeeNew("Aditty", 101, 880000, 250);
		EmployeeNew emp2 = new EmployeeNew("Tanya", 102, 760000, 356);
		EmployeeNew emp3 = new EmployeeNew("Ankush", 103, 330000, 133);
		EmployeeNew emp4 = new EmployeeNew("Ashish", 104, 708000, 988);
		EmployeeNew emp5 = new EmployeeNew("Nisha", 105, 987000, 555);

		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);
		listOfEmp.add(emp5);

		System.out.println("Sort Employee object based on Salary using Comaparator!");
		System.out.println("\nInput Sequence:");
		for (EmployeeNew emp : listOfEmp) {

			System.out.println(
					emp.getEmpName() + "\t" + emp.getEmpId() + "\t" + emp.getEmpSalary() + "\t" + emp.getEmpDeptId());
		}
		System.out.println("\nSorted sequence: ");
		Collections.sort(listOfEmp, new EmployeeSalaryComparator());

		for (EmployeeNew emp : listOfEmp) {

			System.out.println(
					emp.getEmpName() + "\t" + emp.getEmpId() + "\t" + emp.getEmpSalary() + "\t" + emp.getEmpDeptId());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestComparator testComparator = new TestComparator();
		testComparator.processEmployeeDetails();
	}

}

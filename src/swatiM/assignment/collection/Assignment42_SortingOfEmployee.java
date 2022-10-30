package swatiM.assignment.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment42_SortingOfEmployee {

	static void printEmployeeDetails(ArrayList<Assignment42_Employee> empData) {
		for(Assignment42_Employee emp : empData) {
			System.out.println(emp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Assignment42_Employee> empData = new ArrayList<Assignment42_Employee>();

		Assignment42_Employee emp1 = new Assignment42_Employee("Yuvaan", 1, 50000, 10);
		Assignment42_Employee emp2 = new Assignment42_Employee("Ovi", 2, 95000, 20);
		Assignment42_Employee emp3 = new Assignment42_Employee("Sakshi", 2, 15000, 30);
		Assignment42_Employee emp4 = new Assignment42_Employee("Advik", 3, 35000, 20);
		Assignment42_Employee emp5 = new Assignment42_Employee("Sahil", 5, 10000, 50);


		empData.add(emp1);
		empData.add(emp2);
		empData.add(emp3);
		empData.add(emp4);
		empData.add(emp5);


		System.out.println("Sorting based on Salary");
		Collections.sort(empData, new Assignment42_EmployeeSalaryComparator());
		printEmployeeDetails(empData);

		System.out.println("\nSorting based on EmpID");
		Collections.sort(empData, new Assignment42_EmployeeIdComparator());
		printEmployeeDetails(empData);

		System.out.println("\nSorting based on EmpName");
		Collections.sort(empData, new Assignment42_EmployeeNameComparator());
		printEmployeeDetails(empData);

		System.out.println("\nSorting based on EmpDeptID");
		Collections.sort(empData, new Assignment42_EmployeeEmpDeptIDComparator());
		printEmployeeDetails(empData);
	}

}

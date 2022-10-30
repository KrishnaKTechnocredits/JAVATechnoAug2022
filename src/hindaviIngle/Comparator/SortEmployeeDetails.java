package hindaviIngle.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeDetails {

	static void printEmployeeDetails(ArrayList<Employee> empData) {
		for(Employee emp : empData) {
			System.out.println(emp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empData = new ArrayList<Employee>();

		Employee emp1 = new Employee("John", 1, 50000, 10);
		Employee emp2 = new Employee("Craig", 2, 95000, 20);
		Employee emp3 = new Employee("Rico", 2, 15000, 30);
		Employee emp4 = new Employee("Robert", 3, 35000, 20);
		Employee emp5 = new Employee("Richard", 5, 10000, 50);


		empData.add(emp1);
		empData.add(emp2);
		empData.add(emp3);
		empData.add(emp4);
		empData.add(emp5);


		System.out.println("Sorting based on Salary");
		Collections.sort(empData, new EmployeeSalaryComparator());
		printEmployeeDetails(empData);

		System.out.println("\nSorting based on EmpID");
		Collections.sort(empData, new EmployeeEmpIDComparator());
		printEmployeeDetails(empData);

		System.out.println("\nSorting based on EmpName");
		Collections.sort(empData, new EmployeeEmpNameComparator());
		printEmployeeDetails(empData);

		System.out.println("\nSorting based on EmpDeptID");
		Collections.sort(empData, new EmployeeEmpDeptIDComparator());
		printEmployeeDetails(empData);
	}

	}



package ankitaBarwad;

import java.util.ArrayList;
import java.util.Collections;

public class A42_Test {
	
	ArrayList<A42_Employee> processEmployeeDetails() {
		ArrayList<A42_Employee> listOfEmployees = new ArrayList<A42_Employee>();
		listOfEmployees.add(new A42_Employee("Ankita", 1, 350000, 110, "2016-06-16"));
		listOfEmployees.add(new A42_Employee("Ashwini", 2, 250000, 120, "2016-04-21"));
		listOfEmployees.add(new A42_Employee("Sanket", 3, 850000, 150, "2017-05-24"));
		listOfEmployees.add(new A42_Employee("Sumeet", 4, 450000, 170,"2015-08-30"));
		Collections.sort(listOfEmployees, new A42_EmployeeSalaryComparator());
		return listOfEmployees;
	}
	
	public static void main(String[] args) {
		
		A42_Test test = new A42_Test();
		ArrayList<A42_Employee> empList = test.processEmployeeDetails();
		System.out.println(empList);
	}
}

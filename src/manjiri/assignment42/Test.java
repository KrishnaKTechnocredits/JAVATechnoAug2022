package manjiri.assignment42;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	ArrayList<Employee> processEmployeeDetails() {
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		
		listOfEmployees.add(new Employee("Maulik", 12345, 500000, 10, "2011-05-29"));
		listOfEmployees.add(new Employee("Krishna", 45698, 300000, 20, "2011-04-30"));
		listOfEmployees.add(new Employee("Aashvi", 98562, 350000, 50, "2022-01-10"));
		listOfEmployees.add(new Employee("Chaitanya", 15869, 450000, 70,"2018-03-29"));
		
		Collections.sort(listOfEmployees, new EmployeeSalaryComparator());
		
		return listOfEmployees;
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		ArrayList<Employee> empList = test.processEmployeeDetails();
		System.out.println(empList);
	}
}

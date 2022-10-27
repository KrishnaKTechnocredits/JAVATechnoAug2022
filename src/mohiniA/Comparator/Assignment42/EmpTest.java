package mohiniA.Comparator.Assignment42;


import java.util.ArrayList;
import java.util.Collections;

public class EmpTest {
	
	ArrayList<Employee> processEmployeeDetails() {
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		
		listOfEmployees.add(new Employee("Mohini", 445, 500000, 10, "2010-06-30"));
		listOfEmployees.add(new Employee("Sonal", 896, 200000, 30, "2011-09-14"));
		listOfEmployees.add(new Employee("Peehu", 825, 450000, 80, "2022-03-12"));
		listOfEmployees.add(new Employee("Annisha", 658, 350000, 20,"2018-07-01"));
		
		Collections.sort(listOfEmployees, new EmpSalaryComparator());
		
		return listOfEmployees;
	}
	
	public static void main(String[] args) {
		
		EmpTest test = new EmpTest();
		ArrayList<Employee> empList = test.processEmployeeDetails();
		System.out.println(empList);
	}

}

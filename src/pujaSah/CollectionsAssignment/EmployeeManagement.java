package pujaSah.CollectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManagement {

	public static void main(String[] args) {
		ArrayList<EmployeeDetails> listOfEmployee = new ArrayList<EmployeeDetails>();

		EmployeeDetails empDetail1 = new EmployeeDetails("Abhilasha", 6, 1000, 3001, "06-12-2015");
		EmployeeDetails empDetail2 = new EmployeeDetails("Priya", 2, 2000, 3003, "05-2-2016");
		EmployeeDetails empDetail3 = new EmployeeDetails("Priya", 3, 7000, 3002, "09-2-2013");
		EmployeeDetails empDetail4 = new EmployeeDetails("Santosh", 1, 5000, 3004, "06-12-2016");
		EmployeeDetails empDetail5 = new EmployeeDetails("Rahul", 5, 1000, 3003, "26-12-2010");
		EmployeeDetails empDetail6 = new EmployeeDetails("Abhi", 7, 9000, 3002, "07-11-2015");
		EmployeeDetails empDetail7 = new EmployeeDetails("Priyanka", 4, 2000, 3004, "9-10-2020");
		EmployeeDetails empDetail8 = new EmployeeDetails("Priya", 8, 2000, 3001, "12-6-2012");
		EmployeeDetails empDetail9 = new EmployeeDetails("Rahul", 5, 1000, 3003, "2-1-2014");

		listOfEmployee.add(empDetail1);
		listOfEmployee.add(empDetail2);
		listOfEmployee.add(empDetail3);
		listOfEmployee.add(empDetail4);
		listOfEmployee.add(empDetail5);
		listOfEmployee.add(empDetail6);
		listOfEmployee.add(empDetail7);
		listOfEmployee.add(empDetail8);
		listOfEmployee.add(empDetail9);

		Collections.sort(listOfEmployee, new DateOfJoiningComparator());

		System.out.println("Employee Details in the order: Name-> empId-> DateOfJoining are: \n");
		for (EmployeeDetails employee : listOfEmployee) {
			System.out.println(
					employee.getEmpName() + ", -> " + employee.getEmpId() + ", -> " + employee.getEmpDateOfJoining());
		}
	}
}

package anujaD;


import java.util.ArrayList;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment41{

	public static void main(String[] args) {
		ArrayList<Employee2> listOfEmployees = new ArrayList<Employee2>();

		listOfEmployees.add(new Employee2("Apurva", 1, 5000, 1001));
		listOfEmployees.add(new Employee2("Sejal", 8, 4000, 1002));
		listOfEmployees.add(new Employee2("Priti", 3, 4000, 1003));
		listOfEmployees.add(new Employee2("Ashish", 5, 6000, 1005));
		listOfEmployees.add(new Employee2("Vaibhav", 2, 3500, 1005));
		listOfEmployees.add(new Employee2("Apurva", 7, 5000, 1001));
		listOfEmployees.add(new Employee2("Nikhli", 4, 6500, 1004));
		listOfEmployees.add(new Employee2("Sanjay", 9, 5500, 1002));
		listOfEmployees.add(new Employee2("Vaishnavi", 6, 3500, 1002));
		listOfEmployees.add(new Employee2("Apurva", 10, 2000, 1003));

		Collections.sort(listOfEmployees);
		System.out.println("Employee Details -> EmpId, EmpName, EmpSalary, EmpDeptId\n");
		for (Employee2 list : listOfEmployees) {
			System.out.println(list.getEmpId() + " -> " + list.getEmpName() + " -> " + list.getEmpSalary() + " -> "
					+ list.getEmpDeptId());
		}
	}
}
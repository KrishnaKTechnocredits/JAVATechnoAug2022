package apurvaBabel.Assignment42;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfEmployee {

	ArrayList<Employee> getEmployeeDetails() {
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();

		listOfEmployees.add(new Employee("Apurva", 1, 5000, 1001));
		listOfEmployees.add(new Employee("Sejal", 8, 4000, 1002));
		listOfEmployees.add(new Employee("Priti", 3, 4000, 1003));
		listOfEmployees.add(new Employee("Ashish", 5, 6000, 1005));
		listOfEmployees.add(new Employee("Vaibhav", 2, 3500, 1005));
		listOfEmployees.add(new Employee("Apurva", 7, 5000, 1001));
		listOfEmployees.add(new Employee("Nikhli", 4, 6500, 1004));
		listOfEmployees.add(new Employee("Sanjay", 9, 5500, 1002));
		listOfEmployees.add(new Employee("Vaishnavi", 6, 3500, 1002));
		listOfEmployees.add(new Employee("Apurva", 10, 2000, 1003));

		Collections.sort(listOfEmployees, new EmployeeSalaryComparator());
		// Collections.sort(listOfEmployees, new EmployeeNameComparator());
		// Collections.sort(listOfEmployees, new EmployeeIdComparator());

		return listOfEmployees;
	}

	public static void main(String[] args) {
		SortingOfEmployee sortingOfEmployee = new SortingOfEmployee();
		ArrayList<Employee> listOfEmployees = sortingOfEmployee.getEmployeeDetails();
		System.out.println("Employee Details -> EmpId, EmpName, EmpSalary, EmpDeptId\n");
		for (Employee e : listOfEmployees) {
			System.out.println(e);
		}
	}
}

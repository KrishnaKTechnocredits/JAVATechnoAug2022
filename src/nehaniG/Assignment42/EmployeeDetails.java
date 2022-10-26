package nehaniG.Assignment42;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDetails {

	void ProcessDetails() {
		ArrayList<Employee> listOfEmp = new ArrayList<>();
		Employee emp1 = new Employee("Nehani", 1, 40000, 3);
		Employee emp2 = new Employee("Navya", 4, 55000, 2);
		Employee emp3 = new Employee("Tvisha", 12, 70000, 1);
		Employee emp4 = new Employee("Rahul", 6, 12000, 4);
		Employee emp5 = new Employee("Namita", 7, 67000, 7);

		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);
		listOfEmp.add(emp5);

		System.out.println("Sorting based on Salary");
		Collections.sort(listOfEmp, new EmpSalaryComparator());
		printSortedObject(listOfEmp);

		System.out.println("Sorting based on Department");
		Collections.sort(listOfEmp, new EmpDeptIdComparator());
		printSortedObject(listOfEmp);

		System.out.println("Sorting based on Name");
		Collections.sort(listOfEmp, new EmpNameComparator());
		printSortedObject(listOfEmp);

		System.out.println("Sorting based on id");
		Collections.sort(listOfEmp, new EmployeeIdComparator());
		printSortedObject(listOfEmp);

	}

	void printSortedObject(ArrayList<Employee> listOfEmp) {
		for (Employee emp : listOfEmp) {
			System.out.println(
					emp.getEmpName() + "\t" + emp.getEmpId() + "\t" + emp.getEmpSalary() + "\t" + emp.getEmpDeptId());

		}
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {

		EmployeeDetails emp = new EmployeeDetails();
		emp.ProcessDetails();

	}
}

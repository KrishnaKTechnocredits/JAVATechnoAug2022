package vibhaS.Assignment42;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment42 {

	ArrayList<Employee1> getEmployeeDetails() {
		System.out.println("Employee list :- empName,empId,empSalary,empDepId");

		ArrayList<Employee1> listOfEmployee = new ArrayList<Employee1>();
		listOfEmployee.add(new Employee1("Vibha", 1002, 3000, 3456));
		listOfEmployee.add(new Employee1("Krishna", 1005, 1000, 6543));
		listOfEmployee.add(new Employee1("Yashwant", 1001, 6000, 7891));
		listOfEmployee.add(new Employee1("Sachin", 1000, 999, 1009));

		Collections.sort(listOfEmployee, new EmployeeSalaryDetails());
		return listOfEmployee;
	}

	public static void main(String[] args) {
		Assignment42 assignment42 = new Assignment42();
		ArrayList<Employee1> listOfEmployee = assignment42.getEmployeeDetails();
		for (Employee1 ae : listOfEmployee) {
			System.out.println(ae);
		}

	}
}

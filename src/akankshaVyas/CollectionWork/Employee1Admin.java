package akankshaVyas.CollectionWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee1Admin {

	List<Employee1> getEmployeeDetails() {

		List<Employee1> listOfEmployee = new ArrayList();

		Employee1 employee1 = new Employee1("Akanksha", 07, 70000, 'T');
		Employee1 employee2 = new Employee1("Amol", 23, 100000, 'L');
		Employee1 employee3 = new Employee1("Aaradhy", 02, 50000, 'K');
		Employee1 employee4 = new Employee1("Abir", 20, 40000, 'N');

		listOfEmployee.add(employee1);
		listOfEmployee.add(employee2);
		listOfEmployee.add(employee3);
		listOfEmployee.add(employee4);
		Collections.sort(listOfEmployee, new EmployeeSalaryComparator());
		// Collections.sort(listOfEmployee,new EmployeeIDComparator());
//		Collections.sort(listOfEmployee,new EmployeeDeptIDComparator());
//		Collections.sort(listOfEmployee,new EmployeeNameComparator());
		System.out.println("Output from toString method overriding written in Emplyee1 class");
		System.out.println(listOfEmployee);
		System.out.println(
				"=======================================================================================================");
		return listOfEmployee;
	}

	public static void main(String[] args) {
		Employee1Admin employeeAdmin = new Employee1Admin();
		List<Employee1> listOfEmployee = employeeAdmin.getEmployeeDetails();
		for (Employee1 sal : listOfEmployee)
			System.out.println(sal.getEmpName() + "-->" + sal.getEmpSalary() + " , " + sal.getEmpID());
	}
}
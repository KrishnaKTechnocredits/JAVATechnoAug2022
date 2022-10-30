package swatiM.assignment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment41_EmployeeDetailsComparable {

	public static void main(String[] args) {
		System.out.println("Assignment - 41 : 20th Oct'2022\r\n"
				+ "Create POJO class Employee.\r\n"
				+ "Sort Employee object based on Salary.\r\n"
				+ "Employee class should have empName, empId, empSalary, empDeptId as parameters.\r\n"
				+ "Print all instance variable of employee after sorting.\n");
		Assignment41_Employee emp1 = new Assignment41_Employee("Harshal",01,800000,12);
		Assignment41_Employee emp2 = new Assignment41_Employee("Maulik",10,500000,10);
		Assignment41_Employee emp3 = new Assignment41_Employee("Krishna",8,300000,6);

		List<Assignment41_Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);

		Collections.sort(listOfEmployee);

		for(Assignment41_Employee e :listOfEmployee)
			System.out.println(e.getEmpName()+"-->"+e.getEmpId()+"-->"+e.getEmpSalary()+"-->"+e.getEmpDeptId());
	}


}

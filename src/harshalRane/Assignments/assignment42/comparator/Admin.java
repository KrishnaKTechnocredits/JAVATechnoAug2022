package harshalRane.Assignments.assignment42.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Admin {
	List<Employee> getEmployeeDetails(){
	Employee emp1 = new Employee("Harshal",15,800000,12);
	Employee emp2 = new Employee("Maulik",8,500000,10);
	Employee emp3 = new Employee("Krishna",10,300000,6);
	
	List<Employee> listOfEmployee = new ArrayList<>();
	listOfEmployee.add(emp1);
	listOfEmployee.add(emp2);
	listOfEmployee.add(emp3);
	
	//Collections.sort(listOfEmployee, new EmployeeNameComparator());
	//Collections.sort(listOfEmployee, new EmployeeIDComparator());
	Collections.sort(listOfEmployee, new EmployeeSalaryComparator());
		return listOfEmployee;
	}
	
	public static void main(String[] args) {
		Admin admin = new Admin();
		List<Employee> listOfEmployee = admin.getEmployeeDetails();
		for(Employee e : listOfEmployee) {
			admin.getEmployeeDetails();
			System.out.println(e.getEmpName() + "-->" + e.getEmpId()+ "-->" + e.getEmpSalary());
		}
	}
}

package harshalRane.Assignments.assignment41Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDetailsComparable{
	public static void main(String[] args) {
		Employee emp1 = new Employee("Harshal",01,800000,12);
		Employee emp2 = new Employee("Maulik",10,500000,10);
		Employee emp3 = new Employee("Krishna",8,300000,6);
		
		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		
		Collections.sort(listOfEmployee);
		
		for(Employee e :listOfEmployee)
			System.out.println(e.getEmpName()+"-->"+e.getEmpId()+"-->"+e.getEmpSalary()+"-->"+e.getEmpDeptId());
	}
	
}

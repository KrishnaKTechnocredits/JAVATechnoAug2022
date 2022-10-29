/*Assignment 41 : 
Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
*/
package ankitaBarwad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A41_Test {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Ankita", 1, 220000, 1100);
		Employee emp2 = new Employee("Aanchal", 2, 300000, 1108);
		Employee emp3 = new Employee("Sanket", 3, 100000, 1109);
		Employee emp4 = new Employee("Chirag", 4, 500000, 1101);
		
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);
		
		Collections.sort(listOfEmp);
		
		for (Employee e : listOfEmp)
		System.out.println(e.getEmpName() + "-->"+e.getEmpid()+"-->"+e.getEmpSalary()+"-->"+e.getEmpDeptId());
	}
}

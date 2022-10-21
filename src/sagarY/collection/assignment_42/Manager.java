/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.
*/

package sagarY.collection.assignment_42;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Manager {
	
	void getEmployeeDetails() {
	
	EmployeeDetails emp1= new EmployeeDetails("Sagar Yadav", 672028, 45303, "Developer");
	EmployeeDetails emp2= new EmployeeDetails("Deepak Patil", 672021, 50678, "Tester");
	EmployeeDetails emp3= new EmployeeDetails("Rahul Oulkar", 672045, 61987, "Architect");
	EmployeeDetails emp4= new EmployeeDetails("Sagar Honrao", 672056, 76543, "Manager");
	EmployeeDetails emp5= new EmployeeDetails("Vishwanath Patil", 672098, 78675, "Senior Developer");
	EmployeeDetails emp6= new EmployeeDetails("Prashant Kumbhr", 676785, 76543, "Product Owner");
	
	ArrayList<EmployeeDetails> empSet = new ArrayList<EmployeeDetails>();
	
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		empSet.add(emp6);
		
		System.out.println("Sorting based on Employee Name:\n");
		Collections.sort(empSet, new EmployeeNameComparator());
		
		for(EmployeeDetails emp : empSet) {
			System.out.println(emp.getEmpName()+" --> "+emp.getEmpId()+" --> "+emp.getEmpSalary()+" --> "+emp.getEmpDeptId());
		}
		
		System.out.println("===========================================================");
		
		System.out.println("Sorting based on Employee Id:\n");
		Collections.sort(empSet, new EmployeeIdComparator());
		
		for(EmployeeDetails emp : empSet) {
			System.out.println(emp.getEmpName()+" --> "+emp.getEmpId()+" --> "+emp.getEmpSalary()+" --> "+emp.getEmpDeptId());
		}
		
		System.out.println("===========================================================");
		
		System.out.println("Sorting based on Employee Salary:\n");
		Collections.sort(empSet, new EmployeeSalaryComparator());
		
		for(EmployeeDetails emp : empSet) {
			System.out.println(emp.getEmpName()+" --> "+emp.getEmpId()+" --> "+emp.getEmpSalary()+" --> "+emp.getEmpDeptId());
		}
		
		System.out.println("===========================================================");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Assignment 42-:Sort Employee object based multiple \n attribute like name , id, Salary.");
		System.out.println("===========================================================");
		Manager mng = new Manager();
		mng.getEmployeeDetails();
	}
	
	
}

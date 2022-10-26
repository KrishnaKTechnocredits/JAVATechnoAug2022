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
	
	EmployeeDetails emp1= new EmployeeDetails(672028,"2020-12-24", "Sagar Yadav",45303, "Developer");
	EmployeeDetails emp2= new EmployeeDetails(672021,"2021-12-24", "Deepak Patil",  50678, "Tester");
	EmployeeDetails emp3= new EmployeeDetails(672045,"2020-12-17", "Rahul Oulkar",  61987, "Architect");
	EmployeeDetails emp4= new EmployeeDetails(672056,"2020-11-24", "Sagar Honrao",  76543, "Manager");
	EmployeeDetails emp5= new EmployeeDetails(672098,"2021-02-19", "Visha Patil", 78675, "Senior Developer");
	EmployeeDetails emp6= new EmployeeDetails(676785,"2020-10-12", "Pashya Kumbhar", 76543, "Product Owner");
	
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
			System.out.println(emp.getEmpId()+" -->"+emp.getEmpJoiningDate()+" --> "+emp.getEmpName()+" --> "+emp.getEmpSalary() +" --> "+emp.getEmpDeptId());
		}
		
		System.out.println("============================================================================");
		
		System.out.println("Sorting based on Employee Id:\n");
		Collections.sort(empSet, new EmployeeIdComparator());
		
		for(EmployeeDetails emp : empSet) {
			System.out.println(emp.getEmpId()+" -->"+emp.getEmpJoiningDate()+" --> "+emp.getEmpName()+" --> " +emp.getEmpSalary()+" --> "+emp.getEmpDeptId());
		}
		
		System.out.println("=============================================================================");
		
		System.out.println("Sorting based on Employee Salary:\n");
		Collections.sort(empSet, new EmployeeSalaryComparator());
		
		for(EmployeeDetails emp : empSet) {
			
			System.out.println(emp.getEmpId()+" -->"+emp.getEmpJoiningDate()+" --> "+emp.getEmpName()+" --> "+emp.getEmpSalary()+" --> "+emp.getEmpDeptId());
		}
		
		System.out.println("=============================================================================");
		
		System.out.println("Sorting based on Employee Joining Date:\n");
		Collections.sort(empSet, new EmployeeJoinigDateComparator());
		
		for(EmployeeDetails emp : empSet) {
			
			System.out.println(emp.getEmpId()+" -->"+emp.getEmpJoiningDate()+" --> "+emp.getEmpName()+" --> "+emp.getEmpSalary()+" --> "+emp.getEmpDeptId());
			
		}
		
		System.out.println("==============================================================================");
		
	}

	public static void main(String[] args) {
		System.out.println("Assignment 42-:Sort Employee object based multiple \n attribute like name , id, Salary.");
		System.out.println("==============================================================================");
		Manager mng = new Manager();
		mng.getEmployeeDetails();
	}

}

/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
*/

package sagarY.collection.assignment_41;

import java.util.TreeSet;

public class Manager {
	
	void getEmployeeDetails() {
	
	EmployeeDetails emp1= new EmployeeDetails("Sagar Yadav", 672028, 45303, "Developer");
	EmployeeDetails emp2= new EmployeeDetails("Deepak Patil", 672021, 50678, "Tester");
	EmployeeDetails emp3= new EmployeeDetails("Rahul Oulkar", 672045, 61987, "Architect");
	EmployeeDetails emp4= new EmployeeDetails("Sagar Honrao", 672056, 76543, "Manager");
	EmployeeDetails emp5= new EmployeeDetails("Vishwanath Patil", 672098, 78675, "Senior Developer");
	EmployeeDetails emp6= new EmployeeDetails("Prashant Kumbhr", 676785, 76543, "Product Owner");
	
	TreeSet<EmployeeDetails> empSet = new TreeSet<EmployeeDetails>();
	
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		empSet.add(emp6);
	
		for(EmployeeDetails emp : empSet) {
			System.out.println(emp.getEmpName()+" --> "+emp.getEmpId()+" --> "+emp.getEmpSalary()+" --> "+emp.getEmpDeptId());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Assignment 41-:Sort Employee object based on Salary. \n-If salary is same then sort based on name");
		System.out.println("=========================================================");
		Manager mng = new Manager();
		mng.getEmployeeDetails();
	}
	
	
}

/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
*/

package komalShrivastava.Collections;

public class Employee implements Comparable<Employee> {
	String empName;
	int empId;
	int empSalary;
	int empDeptId;
	
	Employee(String empName, int empId, int empSalary, int empDeptId){
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
		this.empDeptId=empDeptId;
	}
	
	public String toString() {
		return empName+" with id:"+empId+" from dept:"+empDeptId+" has Salary: "+empSalary;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.empSalary-o.empSalary;
	}
}
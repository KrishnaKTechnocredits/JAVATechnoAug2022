/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.
*/


package sagarY.collection.assignment_42;

import java.util.Comparator;

public class EmployeeDetails implements Comparator<EmployeeDetails>{
	
	private  String empName;
	private int empId;
	private int empSalary;
	private String empDeptId;
	
	public EmployeeDetails(String empName, int empId, int empSalary, String empDeptId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public String getEmpDeptId() {
		return empDeptId;
	}
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		
		
		return 0;
	}
	
	
	
}

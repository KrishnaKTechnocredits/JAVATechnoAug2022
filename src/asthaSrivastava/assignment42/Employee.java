/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.*/
package asthaSrivastava.assignment42;

public class Employee {

	public Employee (String empName, int empId, int empDeptId, double empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.empSalary = empSalary;
	}

	private String empName;
	private int empId, empDeptId;
	private double empSalary;

	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}

	public double getEmpSalary() {
		return empSalary;
	}
}

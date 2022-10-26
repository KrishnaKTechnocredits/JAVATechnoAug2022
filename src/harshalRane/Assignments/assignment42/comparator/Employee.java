/*
 * Assignment - 42 : 21th Oct'2022
Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
Hint : Use Comparator.
 */
package harshalRane.Assignments.assignment42.comparator;

public class Employee {
	private String empName;
	private int empId;
	private double empSalary;
	private int empDeptId;
	
	public Employee(String empName, int empId, double empSalary, int empDeptId) {
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

	public double getEmpSalary() {
		return empSalary;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}
}

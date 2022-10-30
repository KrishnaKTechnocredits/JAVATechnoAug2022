/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.*/
package nilamP.assignment41;

public class Employee implements Comparable<Employee> {

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

	public int compareTo(Employee o) {
		return (int) (this.empSalary - o.empSalary);
	}

}

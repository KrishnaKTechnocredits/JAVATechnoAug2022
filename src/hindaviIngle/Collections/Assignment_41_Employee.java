/*
 * Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
 */
package hindaviIngle.Collections;

public class Assignment_41_Employee implements Comparable<Assignment_41_Employee> {

	private String empName, empId, empDeptId;
	private int empSalary;

	public Assignment_41_Employee(String empName, String empId, String empDeptId, int empSalary) {
		this.empName = empName;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpDeptId() {
		return empDeptId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Assignment_41_Employee o) {
		// TODO Auto-generated method stub

		return (int) (this.empSalary - o.empSalary);
	}
}

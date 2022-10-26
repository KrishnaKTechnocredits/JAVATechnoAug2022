/*

  Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.
*/

package akankshaVyas.CollectionWork;

public class Employee1 {

	private String empName;
	private int empID;
	private int empSalary;
	private char empDeptId;

	public Employee1(String empName, int empID, int empSalary, char empDeptId) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpID() {
		return empID;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public char getEmpDeptId() {
		return empDeptId;
	}

	public String toString() {

		return this.empName + "-->" + this.empSalary + "->" + this.empID + "->" + this.empDeptId;

	}

}

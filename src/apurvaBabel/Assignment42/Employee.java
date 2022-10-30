/*Assignment - 42 
Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
Hint : Use Comparator.
*/
package apurvaBabel.Assignment42;

public class Employee { // Pojo class of Employee

	private String empName;
	private int empId;
	private int empSalary;
	private int empDeptId;

	public Employee(String empName, int empId, int empSalary, int empDeptId) {
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

	public int getEmpDeptId() {
		return empDeptId;
	}

	@Override // to string method overridden
	public String toString() {
		return this.getEmpId() + " -> " + this.getEmpName() + " -> " + this.getEmpSalary() + " -> "
				+ this.getEmpDeptId();
	}
}

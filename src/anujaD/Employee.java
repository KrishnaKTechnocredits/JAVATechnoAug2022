package anujaD;

public class Employee implements Comparable<Employee> { // Pojo class of employee

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

	// Overridden method from comparable interface 
	@Override
	public int compareTo(Employee o) {
		if (this.empSalary != o.empSalary) {
			return this.empSalary - o.empSalary;
		} else if (!this.empName.equals(o.empName) ) {
			return this.empName.compareTo(o.empName);
		} else if (this.empDeptId != o.empDeptId) {
			return this.empDeptId - o.empDeptId;
		} else {
			return this.empId - o.empId;
		}
	}
}

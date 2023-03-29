package anujaD;

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

package shubhamG.Assignment41to50.Assignment42Comparator;

public class Employee {
	private String empName;
	private String empDeptId;
	private int empId;
	private int empSalary;

	public Employee(String empName, int empId, int empSalary, String empDeptId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;

	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDeptId() {
		return empDeptId;
	}

	public int getEmpId() {
		return empId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public String toString() {
		return empName + " -> " + empId + " -> " + empSalary + " -> " + empDeptId;
	}
}
package rashmiG.Collections.Assignment42_Comparator;

public class Employee {
	String empName, empDeptId;
	int empId;
	double empSalary;

	public Employee(String empName, int empId, double empSalary, String empDeptId) {
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

	public double getEmpSalary() {
		return empSalary;
	}

	public String toString() {
		return empName + "-->" + empId + "-->" + empSalary + "-->" + empDeptId;
	}
}
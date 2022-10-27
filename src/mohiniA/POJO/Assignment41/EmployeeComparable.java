package mohiniA.POJO.Assignment41;

import mohiniA.Comparator.Assignment42.Employee;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
	String empName;
	int empid;
	double empSalary;
	int empDeptId;

	public EmployeeComparable(String empName, int empid, double empSalary, int empDeptId) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpid() {
		return empid;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}

	@Override
	public int compareTo(EmployeeComparable o) {
		return (int) (this.empSalary - o.empSalary);
	}
}

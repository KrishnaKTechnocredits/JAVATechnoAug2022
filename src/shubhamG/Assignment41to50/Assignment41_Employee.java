package shubhamG.Assignment41to50;

public class Assignment41_Employee implements Comparable<Assignment41_Employee> {

	private String empName;
	private int empId;
	private int empSalary;
	private String empDeptId;

	public Assignment41_Employee(String empName, int empId, int empSalary, String empDeptId) {
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

	public String getEmpDeptId() {
		return empDeptId;
	}

	@Override
	public int compareTo(Assignment41_Employee e) {

		if (this.empSalary != e.empSalary)
			return this.empSalary - e.empSalary;
		else
			return this.empName.compareTo(e.empName);
	}

}

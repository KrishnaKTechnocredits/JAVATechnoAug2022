package vinod.Assignment;

public class Assignment41_Employee implements Comparable<Assignment41_Employee> {

	private String empName;
	private int empId;
	private double empSalary;
	private int empDeptId;

	public Assignment41_Employee(String empName, int empId, double empSalary, int empDeptId) {
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

	@Override
	public int compareTo(Assignment41_Employee o) {
		return (int) (this.empSalary - o.empSalary);
	}

}

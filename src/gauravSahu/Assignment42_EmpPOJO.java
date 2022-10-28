package gauravSahu;

public class Assignment42_EmpPOJO {

	private String empName;
	private String empDeptId;
	private int empId;
	private int empSalary;

	public Assignment42_EmpPOJO(String empName, int empId, int empSalary, String empDeptId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
	}

	public String getName() {
		return empName;
	}

	public String getDeptId() {
		return empDeptId;
	}

	public int getId() {
		return empId;
	}

	public int getSalary() {
		return empSalary;
	}

	public String toString() {
		return empName + " -> " + empId + " -> " + empSalary + " -> " + empDeptId;
	}
}

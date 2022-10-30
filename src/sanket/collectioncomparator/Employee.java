package sanket.collectioncomparator;

public class Employee {

	private String empName, empId, empDeptId;
	private int empSalary;

	public Employee(String empName, String empId, String empDeptId, int empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpDeptId() {
		return empDeptId;
	}

	public int getEmpSalary() {
		return empSalary;
	}
	
	public String toString() {
		return empName + "--" + empSalary + "--" + empId + "--" + empDeptId;
	}
}

//Employee class should have empName, empId, empSalary, empDeptId as parameters.


package hemanshi;

public class Employee42 {

	private String empName;
	private int empId;
	private int empSalary;
	private int empDeptId;

	public Employee42(String empName, int empId, int empSalary, int empDeptId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary =  empSalary;
		this.empDeptId = empDeptId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}

	public void setEmpDeptId(int empDeptId) {
		this.empDeptId = empDeptId;
	}
}

package adittyThakare.comparator;

public class EmployeeNew {
	String empName;
	int empId;
	int empSalary;
	int empDeptId;

	public EmployeeNew(String empName, int empId, int empSalary, int empDeptId) {
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

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public void setEmpDeptId(int empDeptId) {
		this.empDeptId = empDeptId;
	}

}

package swatiM.assignment.collection;

public class Assignment42_Employee {
	String empName;
	int empId;
	int empSalary;
	int empDeptId;


	public Assignment42_Employee(String empName, int empId, int empSalary, int empDeptId){
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
		this.empDeptId=empDeptId;
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

	public String toString() {
		return  empId+" "+empName+" "+empDeptId+" "+empSalary;
	}

}

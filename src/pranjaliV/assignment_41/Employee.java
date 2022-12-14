//Employee class should have empName, empId, empSalary, empDeptId as parameters.

package pranjaliV.assignment_41;

public class Employee implements Comparable<Employee> {

	private String empName;
	private int empId;
	private int empSalary;
	private int empDeptId;
	
	public Employee(String empName,	int empId, int empSalary, int empDeptId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
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


	@Override
	public int compareTo(Employee o) {
		if(this.empSalary!= o.empSalary)		
			return this.empSalary-o.empSalary; 
		else if(this.empDeptId!= o.empDeptId) 
			return this.empDeptId-o.empDeptId;
		else
			return this.empName.compareTo(o.empName);
	}

}

/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
*/


package sagarY.collection.assignment_41;

public class EmployeeDetails implements Comparable<EmployeeDetails>{
	
	private  String empName;
	private int empId;
	private int empSalary;
	private String empDeptId;
	
	public EmployeeDetails(String empName, int empId, int empSalary, String empDeptId) {
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
	public int compareTo(EmployeeDetails o) {
		
		if(this.empSalary!=o.empSalary)		
			return this.empSalary-o.empSalary;
		else
			return this.empName.compareTo(o.empName);
	}
	
	
	
}

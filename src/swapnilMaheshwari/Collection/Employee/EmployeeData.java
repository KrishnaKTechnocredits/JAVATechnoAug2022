package swapnilMaheshwari.Collection.Employee;

import technocredits.collectionsdemo.advance.Builder;

public class EmployeeData implements Comparable<EmployeeData> {

	private String empName;
	private int empDptId,empSalary,empId;
	public EmployeeData(String empName, int empDptId, int empSalary, int empId) {
		super();
		this.empName = empName;
		this.empDptId = empDptId;
		this.empSalary = empSalary;
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpDptId() {
		return empDptId;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public int compareTo(EmployeeData empDetail) {
		if(this.empSalary != empDetail.empSalary)
			return this.empSalary - empDetail.empSalary;
		else
			return this.empName.compareTo(empDetail.empName);
	}
}

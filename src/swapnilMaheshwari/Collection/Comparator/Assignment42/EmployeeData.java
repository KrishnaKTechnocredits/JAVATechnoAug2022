package swapnilMaheshwari.Collection.Comparator.Assignment42;

import java.util.Comparator;

public class EmployeeData implements Comparator<EmployeeData> {
	
	private String empName;
	private int empId, empDepId, empSalary;
	
	public EmployeeData(String empName, int empId, int empDepId, int empSalary) {
		super();
		this.empName=empName;
		this.empId=empId;
		this.empDepId=empDepId;
		this.empSalary=empSalary;
	}
	public String getEmployeeName() {
		return empName;
	}
	public int getEmployeeId() {
		return empId;
	}
	public int getEmployeeDepartmentId() {
		return empDepId;
	}
	public int getEmployeeSalary() {
		return empSalary;
	}
	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

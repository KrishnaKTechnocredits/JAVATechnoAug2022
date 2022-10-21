package rashmiG.Collections.Assignment42_Comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private String empName, empDeptId;
	private int empId;
	private double empSalary;
	private String empJoiningDateText;
	private Date empJoiningDate;

	

	public Employee(String empName, int empId, double empSalary, String empDeptId, String empJoiningDateText) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
		this.empJoiningDateText = empJoiningDateText;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		try {
			empJoiningDate = dateFormat.parse(empJoiningDateText);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		
		}
	}
	public Date getEmpJoiningDate() {
		return empJoiningDate;
	}
	
	public String getEmpName() {
		return empName;
	}

	public String getEmpDeptId() {
		return empDeptId;
	}

	public int getEmpId() {
		return empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public String toString() {
		return empName + "-->" + empId + "-->" + empSalary + "-->" + empDeptId+"-->"+empJoiningDateText;
	}
}
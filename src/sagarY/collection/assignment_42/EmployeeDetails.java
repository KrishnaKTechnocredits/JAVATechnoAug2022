/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.
*/


package sagarY.collection.assignment_42;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;

public class EmployeeDetails{
	
	private int empId;
	private String empJoiningDate;
	private  String empName;
	private int empSalary;
	private String empDeptId;
	
	public EmployeeDetails( int empId, String empJoiningDate, String empName,int empSalary, String empDeptId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
		this.empJoiningDate = empJoiningDate;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dateFormat.parse(empJoiningDate);
		} catch (ParseException e) {
			System.out.println("Invalid Date Format");
		}
	}

	public String getEmpJoiningDate() {
		return empJoiningDate;
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
	
	public String toString() {
		return  empId+" "+empJoiningDate+" "+empName+" "+empDeptId+" "+empSalary;
	}
	
}

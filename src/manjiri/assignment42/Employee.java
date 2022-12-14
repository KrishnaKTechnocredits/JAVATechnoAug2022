/*Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.*/

package manjiri.assignment42;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//Pojo class
public class Employee {
	
	private String empName;
	private int empId;
	private int empSalary;
	private int empDeptId;
	private String empJoiningDate;
	
	public Employee(String empName, int empId, int empSalary, int empDeptId, String empJoiningDate) {
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
	
	public String getempJoiningDate() {
		return empJoiningDate;
	}
	
	public String toString() {
		return empName + "-->" +empId+ "-->" +empSalary+ "-->" +empDeptId;
	}
}

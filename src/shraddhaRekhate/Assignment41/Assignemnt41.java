package shraddhaRekhate.Assignment41;
//Assignment - 41 : 20th Oct'2022
//
//Sort Employee object based on Salary.
//Employee class should have empName, empId, empSalary, empDeptId as parameters.
//Print all instance variable of employee after sorting.

public class Assignemnt41 implements Comparable<Assignemnt41>{
  private String empName;
 private int empId;
 private double empSalary;
 private int empDeptId;
 

public Assignemnt41(String empName, int empId, double empSalary, int empDeptId) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.empSalary = empSalary;
	this.empDeptId = empDeptId;
}

public int getEmpId() {
	return empId;
}

public double getEmpSalary() {
	return empSalary;
}

public int getEmpDeptId() {
	return empDeptId;
}

public String getEmpName() {
	return empName;
}
@Override
public int compareTo(Assignemnt41 o) {
	return (int)( this.empSalary-o.empSalary);
}


 
 
}

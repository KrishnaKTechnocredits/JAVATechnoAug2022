/*Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.*/

package asthaSrivastava.collections.assignment41;

public class Employee implements Comparable<Employee> {
	public Employee(String empName, int empId, int empSalary, int empDeptId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
	}

	private String empName;
	private int empId, empSalary, empDeptId;

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

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (this.empSalary - o.empSalary);
	}
}

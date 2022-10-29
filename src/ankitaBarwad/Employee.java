/*Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
*/
package ankitaBarwad;

//POJO Class
public class Employee implements Comparable<Employee> {
	String empName;
	int empid;
	double empSalary;
	int empDeptId;

	public Employee(String empName, int empid, double empSalary, int empDeptId) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpid() {
		return empid;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}

	@Override
	public int compareTo(Employee o) {
		return (int) (this.empSalary - o.empSalary);
	}
}

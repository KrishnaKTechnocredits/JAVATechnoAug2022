/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
*/

package sanket.collectionscomparable;

public class Employee implements Comparable<Employee> {

	private String empName, empId, empDeptId;
	private int empSalary;

	public Employee(String empName, String empId, String empDeptId, int empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpDeptId() {
		return empDeptId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	@Override
	public int compareTo(Employee e) {
		if (this.empId != e.empId) {
			if (this.empSalary != e.empSalary)
				return this.empSalary - e.empSalary;
			else if (!this.empName.equals(e.empName))
				return this.empName.compareTo(e.empName);
			else
				return this.empId.compareTo(e.empId);

		}
		return 0;
	}

}
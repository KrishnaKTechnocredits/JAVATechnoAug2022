/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.*/

package gauravSahu;

public class Assignment41POJO implements Comparable<Assignment41POJO> {

	private String empName;
	private int empId;
	private int empSalary;
	private int empDeptId;

	public Assignment41POJO(String empName, int empId, int empDeptId, int empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empSalary = empDeptId;
	}

	public String getName() {
		return empName;
	}

	public int getId() {
		return empId;
	}

	public int getSalary() {
		return empSalary;
	}

	public int getdeptId() {
		return empDeptId;
	}

	@Override
	public int compareTo(Assignment41POJO o) {
		if (this.empSalary != o.empSalary)
			return this.empSalary - o.empSalary;
		else
			return this.empName.compareTo(o.empName);
	}
}

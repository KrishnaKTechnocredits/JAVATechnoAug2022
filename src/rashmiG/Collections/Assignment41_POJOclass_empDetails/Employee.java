package rashmiG.Collections.Assignment41_POJOclass_empDetails;

public class Employee implements Comparable<Employee> {

	int empId, empSalary;
	String empName, deptId;

	public Employee(String empName, int empId, int empSalary, String deptId) {
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.deptId = deptId;
	}

	String getEmpName() {
		return empName;
	}

	int getEmpId() {
		return empId;
	}

	int getEmpSalary() {
		return empSalary;
	}

	String getDeptId() {
		return deptId;
	}

	public String toString() {
		return empName + " " + empId + " " + empSalary + " " + deptId;
	}

	public int compareTo(Employee e) {
		if (this.empId != e.empId) {
			if (this.empSalary != e.empSalary)
				return this.empSalary - e.empSalary;
			else if (!this.empName.equals(e.empName))
				return this.empName.compareTo(e.empName);
			else
				return this.empId - e.empId;

		}
		return 0;
	}
}
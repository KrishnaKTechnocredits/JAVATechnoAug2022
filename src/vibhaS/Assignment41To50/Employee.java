package vibhaS.Assignment41To50;

public class Employee implements Comparable<Employee> {

	private String empName;
	private int empId;
	private int empSalary;
	private int empDepId;

	public Employee(String empName, int empId, int empSalary, int empDepId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDepId = empDepId;

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

	public int getEmpDepId() {
		return empDepId;
	}

	public int compareTo(Employee o) {
		return this.empSalary - o.empSalary;
	}

}

package vibhaS.Assignment42;

public class Employee1 {

	private String empName;
	private int empId;
	private int empSalary;
	private int empDepId;

	public Employee1(String empName, int empId, int empSalary, int empDepId) {
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

	public String toString() {
		return this.getEmpId() + "--> " + this.getEmpName() + "--> " + this.getEmpSalary() + "--> "
				+ this.getEmpDepId();
	}

}

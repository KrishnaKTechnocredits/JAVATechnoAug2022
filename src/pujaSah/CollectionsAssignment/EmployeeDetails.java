package pujaSah.CollectionsAssignment;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class EmployeeDetails {

	String empName;
	int empId, empSalary, empDeptId;
	Date empDateOfJoining;
	String empDoj;

	EmployeeDetails(String name, int id, int salary, int deptId, String doj) {
		empName = name;
		empId = id;
		empSalary = salary;
		empDeptId = deptId;
		empDoj = doj;
		SimpleDateFormat sdateFormat = new SimpleDateFormat("YYYY-MM-dd");

		try {
			empDateOfJoining = sdateFormat.parse(empDoj);
		} catch (ParseException e) {
			System.out.println("Date is not in the expected format");
		}
	}

	public String getEmpName() {
		return this.empName;
	};

	public int getEmpId() {
		return this.empId;
	};

	public int getEmpSalary() {
		return this.empSalary;
	};

	public int getEmpDepId() {
		return this.empDeptId;
	}

	public String getEmpDateOfJoining() {
		return this.empDoj;
	}

}
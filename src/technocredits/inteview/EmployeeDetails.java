package technocredits.inteview;

import java.util.HashMap;

public class EmployeeDetails implements Cloneable{

	String empName;
	String empDeptName;
	int empId;
	int empDeptNum;

	public EmployeeDetails(String empName, String empDeptName, int empId, int empDeptNum) {
		super();
		this.empName = empName;
		this.empDeptName = empDeptName;
		this.empId = empId;
		this.empDeptNum = empDeptNum;
	}

	EmployeeDetails getClonnedObject(EmployeeDetails e) throws CloneNotSupportedException {
		EmployeeDetails empDetails = null;
		HashMap<String, String> hm;
		try {
			empDetails = (EmployeeDetails) e.clone();
		} catch (CloneNotSupportedException ne) {
			System.out.println("Puja");
		}
		// System.out.println(empDetails);
		return empDetails;
	}

	public static void main(String[] args) {
		System.out.println(1);
		EmployeeDetails details = new EmployeeDetails("Techno", "IT", 12121, 101);
		// System.out.println(details);
		System.out.println(2);

		EmployeeDetails temp;
		try {
			temp = details.getClonnedObject(details);
			if(temp != null)
				System.out.println(temp.empName);
		} catch (CloneNotSupportedException e) {
			System.out.println("Maulik");
		}

		System.out.println("end");
	}
}

package swapnilMaheshwari.Collection.Comparator.Assignment42;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDetails {
	
	void getEmployeeDetails() {
		ArrayList<EmployeeData> listfOfEmployee=new ArrayList<EmployeeData>();
		listfOfEmployee.add(new EmployeeData("Shrikant",5001,1010,12500));
		listfOfEmployee.add(new EmployeeData("Maulik",5007,1012,125000));
		listfOfEmployee.add(new EmployeeData("Ajay",5050,1012,25000));
		listfOfEmployee.add(new EmployeeData("Harsh",5007,1011,50050));
		
		Collections.sort(listfOfEmployee, new  EmpSalaryComparator());		
		
		for(EmployeeData empDetails : listfOfEmployee) {
			System.out.println(empDetails.getEmployeeSalary()+"--"+empDetails.getEmployeeName()+"--"+empDetails.getEmployeeId()+"--"+empDetails.getEmployeeDepartmentId());
		}
	}

	public static void main(String[] args) {
		new EmployeeDetails().getEmployeeDetails();

	}
}

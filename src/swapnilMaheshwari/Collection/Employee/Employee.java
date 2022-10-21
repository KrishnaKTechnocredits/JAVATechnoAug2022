package swapnilMaheshwari.Collection.Employee;

import java.util.TreeSet;

public class Employee {
	
	void getEmployeeSalaryList () {
		TreeSet<EmployeeData> listOfEmployee=new TreeSet<EmployeeData>();
		listOfEmployee.add(new EmployeeData("Swapnil",1010,50000,765));
		listOfEmployee.add(new EmployeeData("Prashant",1000,75000,997));
		listOfEmployee.add(new EmployeeData("Kavita",1012,100000,454));
		listOfEmployee.add(new EmployeeData("Ashok",1016,40000,112));
		
		for (EmployeeData empData :listOfEmployee) {
			System.out.println(empData.getEmpName()+" -->"+empData.getEmpDptId()+"-->"+empData.getEmpId()+"-->"+empData.getEmpSalary());
		}
	}
	public static void main(String[] args) {
		new Employee().getEmployeeSalaryList();
		
	}

}

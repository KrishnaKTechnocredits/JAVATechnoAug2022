/*
 Assignment - 42 : 21th Oct'2022
Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
Hint : Use Comparator.
 */


package hemanshi;
import java.util.ArrayList;
import java.util.Collections;

public class Main42 {
	ArrayList<Employee42> getEmployeeList() {
		ArrayList<Employee42> listOfEmp = new ArrayList<Employee42> ();
		listOfEmp.add(new Employee42("Hemanshi" , 89836 , 72456 , 5432));
		listOfEmp.add(new Employee42("Kajal" , 96604 , 77876 , 1234));
		listOfEmp.add(new Employee42("Hemu" , 12786 , 55983 , 9876));
		listOfEmp.add(new Employee42("Drashti" , 69432 , 55834 , 4532));
		listOfEmp.add(new Employee42("Reshma" , 27195 , 56783 , 7342));
		return listOfEmp;
	}

	void getSortSalaryEmployeeDetails() {
		ArrayList<Employee42>  listOfEmp	= getEmployeeList();
		Collections.sort(listOfEmp, new EmployeeSalaryComparator());
		for(Employee42 emp : listOfEmp) {
			System.out.println(emp.getEmpName() + " - " + emp.getEmpId() + " - " + emp.getEmpSalary() + " - " +  emp.getEmpDeptId());


		}
	}

	void getSortEmpIdEmployeeDetails() {
		ArrayList<Employee42>  listOfEmp	= getEmployeeList();
		Collections.sort(listOfEmp, new EmployeeIdComparator());
		for(Employee42 emp : listOfEmp) {
			System.out.println(emp.getEmpName() + " - " + emp.getEmpId() + " - " + emp.getEmpSalary() + " - " +  emp.getEmpDeptId());


		}
	}

	void getSortEmpNameEmployeeDetails() {
		ArrayList<Employee42>  listOfEmp	= getEmployeeList();
		Collections.sort(listOfEmp, new EmployeeNameComparator());
		for(Employee42 emp : listOfEmp) {
			System.out.println(emp.getEmpName() + " - " + emp.getEmpId() + " - " + emp.getEmpSalary() + " - " +  emp.getEmpDeptId());


		}
	}


	public static void main(String[] args) {
		Main42 main42 = new Main42();
		System.out.println("*****Sort by Salary*****");
		main42.getSortSalaryEmployeeDetails();
		System.out.println("");

		System.out.println("*****Sort by Emp Id*****");
		main42.getSortEmpIdEmployeeDetails();
		System.out.println("");

		System.out.println("*****Sort by Emp Name*****");
		main42.getSortEmpNameEmployeeDetails();
		System.out.println("");
	}


}

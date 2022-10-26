/*
 Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.

 */

package pranjaliV.assignment42;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment42 {
	
	ArrayList<Employee> getEmployeeList() {
		ArrayList<Employee> listOfEmp = new ArrayList<Employee> ();
		listOfEmp.add(new Employee("Pranjali" , 89836 , 72456 , 5432));
		listOfEmp.add(new Employee("Kajal" , 96604 , 77876 , 1234));
		listOfEmp.add(new Employee("Sarvani" , 12786 , 55983 , 9876));
		listOfEmp.add(new Employee("Harpreet" , 69432 , 55834 , 4532));
		listOfEmp.add(new Employee("Chitra" , 27195 , 56783 , 7342));
		return listOfEmp;
	}
		
	void getSortSalaryEmployeeDetails() {
		ArrayList<Employee>  listOfEmp	= getEmployeeList();
		Collections.sort(listOfEmp, new EmployeeSalaryComparator());
		for(Employee emp : listOfEmp) {
			System.out.println(emp.getEmpName() + " - " + emp.getEmpId() + " - " + emp.getEmpSalary() + " - " +  emp.getEmpDeptId());
		
		
		}
	}
	
	void getSortEmpIdEmployeeDetails() {
		ArrayList<Employee>  listOfEmp	= getEmployeeList();
		Collections.sort(listOfEmp, new EmployeeIdComparator());
		for(Employee emp : listOfEmp) {
			System.out.println(emp.getEmpName() + " - " + emp.getEmpId() + " - " + emp.getEmpSalary() + " - " +  emp.getEmpDeptId());
		
		
		}
	}
	
	void getSortEmpNameEmployeeDetails() {
		ArrayList<Employee>  listOfEmp	= getEmployeeList();
		Collections.sort(listOfEmp, new EmployeeNameComparator());
		for(Employee emp : listOfEmp) {
			System.out.println(emp.getEmpName() + " - " + emp.getEmpId() + " - " + emp.getEmpSalary() + " - " +  emp.getEmpDeptId());
		
		
		}
	}
		

	public static void main(String[] args) {
		Assignment42 ex42 = new Assignment42();
		System.out.println("-----Sort by Salary-----");
		ex42.getSortSalaryEmployeeDetails();
		System.out.println("");
		
		System.out.println("-----Sort by Emp Id-----");
		ex42.getSortEmpIdEmployeeDetails();
		System.out.println("");
		
		System.out.println("-----Sort by Emp Name-----");
		ex42.getSortEmpNameEmployeeDetails();
		System.out.println("");
	}

}

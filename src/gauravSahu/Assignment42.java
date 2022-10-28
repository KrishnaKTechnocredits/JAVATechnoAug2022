/*Assignment - 42 : 21th Oct'2022
Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
Hint : Use Comparator.
*/

package gauravSahu;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment42 {

	void getEmployeeDetails() {
		ArrayList<Assignment42_EmpPOJO> listOfEmp = new ArrayList<Assignment42_EmpPOJO>();

		listOfEmp.add(new Assignment42_EmpPOJO("Gaurav", 15, 5000, "Section1"));
		listOfEmp.add(new Assignment42_EmpPOJO("Avinash", 14, 6000, "Section2"));
		listOfEmp.add(new Assignment42_EmpPOJO("Akanksha", 31, 7000, "Section3"));
		listOfEmp.add(new Assignment42_EmpPOJO("Hemant", 35, 2000, "Section4"));
		listOfEmp.add(new Assignment42_EmpPOJO("XYZ", 22, 8000, "Section5"));

		System.out.println("-------------Sorting based on Name: ");
		Collections.sort(listOfEmp, new Assignment42_EmpName_Comparator());
		for (Assignment42_EmpPOJO emp : listOfEmp) {
			System.out.println(emp.getName() + "--" + emp.getId() + "--" + emp.getSalary() + "--" + emp.getDeptId());
		}

		System.out.println("----------Sorting based on Id:");
		Collections.sort(listOfEmp, new Assignment42_EmpId_Comparator());
		for (Assignment42_EmpPOJO emp : listOfEmp) {
			System.out.println(emp.getName() + "--" + emp.getId() + "--" + emp.getSalary() + "--" + emp.getDeptId());
		}

		System.out.println("---------Sorting based on Salary:");
		Collections.sort(listOfEmp, new Assignment42_EmpSalary_Comparator());
		for (Assignment42_EmpPOJO emp : listOfEmp) {
			System.out.println(emp.getName() + "--" + emp.getId() + "--" + emp.getSalary() + "--" + emp.getDeptId());
		}

	}

	public static void main(String[] args) {
		Assignment42 a42 = new Assignment42();
		a42.getEmployeeDetails();
	}

}

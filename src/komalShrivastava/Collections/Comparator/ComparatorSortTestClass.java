/*Assignment - 42 : 21th Oct'2022

Sort Employee object based multiple attribute like name , id, Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.

Hint : Use Comparator.
*/

package komalShrivastava.Collections.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSortTestClass {
	
	static void printEmployeeInfo(ArrayList<Employee> empData) {
		for(Employee emp : empData) {
			System.out.println(emp);
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> empData = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("Emmaa", 1, 45000, 01);
		Employee emp2 = new Employee("Harry", 2, 95000, 02);
		Employee emp3 = new Employee("Robin", 2, 15000, 02);
		Employee emp4 = new Employee("Draco", 3, 25000, 04);
		Employee emp5 = new Employee("Brian", 3, 10000, 03);
		
		empData.add(emp1);
		empData.add(emp2);
		empData.add(emp3);
		empData.add(emp4);
		
		System.out.println("Sorting based on Salary");
		Collections.sort(empData, new EmployeeSalaryComparator());
		printEmployeeInfo(empData);
		
		System.out.println("\nSorting based on EmpID");
		Collections.sort(empData, new EmployeeEmpIDComparator());
		printEmployeeInfo(empData);
		
		System.out.println("\nSorting based on EmpName");
		Collections.sort(empData, new EmployeeEmpNameComparator());
		printEmployeeInfo(empData);
		
		System.out.println("\nSorting based on EmpDeptID");
		Collections.sort(empData, new EmployeeEmpDeptIDComparator());
		printEmployeeInfo(empData);
	}
}
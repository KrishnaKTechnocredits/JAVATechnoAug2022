/*
 * Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
 */

package akankshaVyas.CollectionWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {

	private String empName;
	private int empID;
	private int empSalary;
	private char empDeptId;

	public Employee(String empName, int empID, int empSalary, char empDeptId) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empSalary = empSalary;
		this.empDeptId = empDeptId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpID() {
		return empID;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public char getEmpDeptId() {
		return empDeptId;

	}

	@Override
	public int compareTo(Employee o) {
		if (this.empSalary != o.empSalary)
			return this.empSalary - o.empSalary;
		else
			return this.empName.compareTo(o.empName);
	}

	public String toString() {
		return this.empName + "->" + this.empSalary + "->" + this.empDeptId + "->" + this.empID;
	}
	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		
		Employee employee1 = new Employee("Akanksha", 07, 70000, 'T');
		Employee employee2 = new Employee("Amol", 23, 100000, 'L');
		Employee employee3 = new Employee("Aaradhy", 02, 50000, 'K');
		Employee employee4 = new Employee("Abir", 20, 40000, 'N');

		listOfEmployee.add(employee1);
		listOfEmployee.add(employee2);
		listOfEmployee.add(employee3);
		listOfEmployee.add(employee4);
		listOfEmployee.add(new Employee("Mikku", 07, 70000, 'T'));

		System.out.println("output from override toString method \n");
		System.out.println(listOfEmployee);
		Collections.sort(listOfEmployee); // not needed on treeSet and TreeMap
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("With ArrayList \n");
		for (Employee emp : listOfEmployee) {
			System.out.println(emp.getEmpName() + "-->" + emp.getEmpSalary() +" , " + emp.getEmpID()+ " , " + emp.getEmpDeptId());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("With Tree Set \n");

		TreeSet<Employee> setOfEmployee = new TreeSet<Employee>();
		setOfEmployee.add(employee1);
		setOfEmployee.add(employee2);
		setOfEmployee.add(employee3);
		setOfEmployee.add(employee4);

		for (Employee emp : setOfEmployee) {
			System.out.println(emp.getEmpName() + "-->" + emp.getEmpSalary());
		}

	}

}

package asthaSrivastava.collections.assignment41;

import java.util.*;

public class EmpComparable {

	public static void main(String[] args) {
		TreeSet<Employee> emp1 = new TreeSet<Employee>();
		emp1.add(new Employee("Karuna", 123, 50000, 1));
		emp1.add(new Employee("KK", 124, 55500, 1));
		emp1.add(new Employee("Purav", 125, 60000, 2));
		emp1.add(new Employee("Tanmay", 126, 90000, 3));

		for (Employee emp : emp1) {
			System.out.println(
					emp.getEmpName() + "->" + emp.getEmpId() + "->" + emp.getEmpSalary() + "->" + emp.getEmpDeptId());
		}
	}
}

package hindaviIngle.Collections;

import java.util.Set;
import java.util.TreeSet;

public class Assignment41_Client {
	static void findSortedEmployeeSalary() {
		Set<Assignment_41_Employee> listOfEmployee = new TreeSet<Assignment_41_Employee>();
		listOfEmployee.add(new Assignment_41_Employee("Arundhati", "AASD", "GH675", 300500));
		listOfEmployee.add(new Assignment_41_Employee("Rajesh", "TYRE", "JH765", 307500));
		listOfEmployee.add(new Assignment_41_Employee("Suraj", "YUHN", "IU876", 200500));
		listOfEmployee.add(new Assignment_41_Employee("Kajal", "YHNB", "LK876", 370500));
		listOfEmployee.add(new Assignment_41_Employee("Nishant", "UYTR", "JH765", 103500));
		for (Assignment_41_Employee e : listOfEmployee) {
			System.out.println(e.getEmpName() + "-" + e.getEmpSalary() + "-" + e.getEmpDeptId() + "-" + e.getEmpId());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment41_Client.findSortedEmployeeSalary();
	}

}

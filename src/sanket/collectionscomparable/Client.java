package sanket.collectionscomparable;

import java.util.Set;
import java.util.TreeSet;

public class Client {

	static void getSortedEmployeeSalary() {
		Set<Employee> listOfEmployee = new TreeSet<Employee>();
		listOfEmployee.add(new Employee("Arundhati", "AASD", "GH675", 300500));
		listOfEmployee.add(new Employee("Rajesh", "TYRE", "JH765", 307500));
		listOfEmployee.add(new Employee("Suraj", "YUHN", "IU876", 200500));
		listOfEmployee.add(new Employee("Kajal", "YHNB", "LK876", 370500));
		listOfEmployee.add(new Employee("Nishant", "UYTR", "JH765", 103500));

		for (Employee e : listOfEmployee) {
			System.out.println(e.getEmpName() + "-" + e.getEmpSalary() + "-" + e.getEmpDeptId() + "-" + e.getEmpId());
		}
	}

	public static void main(String[] args) {
		getSortedEmployeeSalary();
	}
}

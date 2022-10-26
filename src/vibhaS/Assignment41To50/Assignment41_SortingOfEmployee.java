package vibhaS.Assignment41To50;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment41_SortingOfEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee("Vibha", 1, 5000, 1001));
		listOfEmployee.add(new Employee("Krishna", 3, 6000, 1003));
		listOfEmployee.add(new Employee("Yashwant", 4, 9000, 1002));
		listOfEmployee.add(new Employee("Mahesh", 8, 5000, 1005));
		listOfEmployee.add(new Employee("Usha", 6, 3000, 1004));
		listOfEmployee.add(new Employee("Sachin", 7, 7000, 1000));

		Collections.sort(listOfEmployee);
		System.out.println("Employee Details--> EmpId,EpName,EmpSalary,EmpDepId");
		for (Employee list : listOfEmployee) {
			System.out.println(list.getEmpId() + " --> " + list.getEmpName() + " --> " + list.getEmpSalary() + " --> "
					+ list.getEmpDepId());
		}
	}
}

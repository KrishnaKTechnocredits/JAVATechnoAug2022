package nehaniG.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment41_EmployeeSorting {

	
		public static void main(String[] args) {
			ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();

		listOfEmployees.add(new Employee("Twinkle", 1, 4000, 01));
			listOfEmployees.add(new Employee("Nehani", 2, 7000, 02));
			listOfEmployees.add(new Employee("Priti", 3, 2000, 03));
			listOfEmployees.add(new Employee("Tvisha", 7, 6000, 05));
			listOfEmployees.add(new Employee("Navya", 6, 3500, 06));
			listOfEmployees.add(new Employee("Himanshu", 7, 9000, 01));
			listOfEmployees.add(new Employee("Nehani", 9, 2500, 04));
			listOfEmployees.add(new Employee("Nikhil", 4, 6500, 05));
			listOfEmployees.add(new Employee("Aayush", 8, 3500, 07));
			listOfEmployees.add(new Employee("Twinkle", 5, 2000, 03));

			Collections.sort(listOfEmployees);
			System.out.println("Employee Details -> EmpId, EmpName, EmpSalary, EmpDeptId\n");
			for (Employee list : listOfEmployees) {
				System.out.println(list.getEmpId() + " -> " + list.getEmpName() + " -> " + list.getEmpSalary() + " -> "
						+ list.getEmpDeptId());
			}
		}
	}
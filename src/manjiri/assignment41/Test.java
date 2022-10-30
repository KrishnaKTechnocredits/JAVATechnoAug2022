package manjiri.assignment41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Maulik", 1001, 500000, 100);
		Employee emp2 = new Employee("Krishna", 1004, 300000, 108);
		Employee emp3 = new Employee("Hardik", 1005, 100000, 109);
		Employee emp4 = new Employee("Saroj", 1007, 220000, 101);
		
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);
		
		Collections.sort(listOfEmp);
		
		for (Employee e : listOfEmp)
		System.out.println(e.getEmpName() + "-->"+e.getEmpid()+"-->"+e.getEmpSalary()+"-->"+e.getEmpDeptId());
	}
}

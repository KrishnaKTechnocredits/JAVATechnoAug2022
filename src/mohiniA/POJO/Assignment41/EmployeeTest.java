package mohiniA.POJO.Assignment41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeComparable emp1 = new EmployeeComparable("Maulik", 1001, 500000, 100);
		EmployeeComparable emp2 = new EmployeeComparable("Krishna", 1004, 300000, 108);
		EmployeeComparable emp3 = new EmployeeComparable("Hardik", 1005, 100000, 109);
		EmployeeComparable emp4 = new EmployeeComparable("Saroj", 1007, 220000, 101);
		
		List<EmployeeComparable> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);
		
		Collections.sort(listOfEmp);
		
		for (EmployeeComparable e : listOfEmp)
		System.out.println(e.getEmpName() + "-->"+e.getEmpid()+"-->"+e.getEmpSalary()+"-->"+e.getEmpDeptId());
	}

}

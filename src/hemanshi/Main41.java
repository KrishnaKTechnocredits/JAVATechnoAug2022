/*
Assignment - 41 : 20th Oct'2022
Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.
   
 */


package hemanshi;
import java.util.TreeSet;

public class Main41 {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Hemanshi",89836, 72673, 1234);
		Employee emp2 = new Employee("Kajal",96604, 77873, 5432);
		Employee emp3 = new Employee("Hemu",12748, 55204, 2345);
		Employee emp4 = new Employee("Reshma",69432, 55204, 8754);
		Employee emp5 = new Employee("Drashti",27195, 55204, 8754);

		TreeSet<Employee> setOfEmp = new TreeSet<Employee>();
		setOfEmp.add(emp1);
		setOfEmp.add(emp2);
		setOfEmp.add(emp3);
		setOfEmp.add(emp4);
		setOfEmp.add(emp5);

		for(Employee emp : setOfEmp) {
			System.out.println(emp.getEmpName() + " - " + emp.getEmpId() + " - " + emp.getEmpSalary() + " - " + emp.getEmpDeptId());
		}
	}

}

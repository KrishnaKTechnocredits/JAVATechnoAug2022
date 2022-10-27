package shubhamG.Assignment41to50;

import java.util.TreeSet;



public class Assignment41_Test {
	void getEmployeeDetails() {
		
		Assignment41_Employee emp1= new Assignment41_Employee("Shubham Gupta", 148308, 65303, "QA");
		Assignment41_Employee emp2= new Assignment41_Employee("Mukul Gupta", 148309, 50678, "QA1");
		Assignment41_Employee emp3= new Assignment41_Employee("Harshit Bhuradia", 148310, 61987, "Developer");
		Assignment41_Employee emp4= new Assignment41_Employee("Shubham Barua", 148305 ,76543, "BA");
		Assignment41_Employee emp5= new Assignment41_Employee("abc def", 150223, 63664, "Test Lead");
		
		TreeSet<Assignment41_Employee> empSet = new TreeSet<Assignment41_Employee>();
		
			empSet.add(emp1);
			empSet.add(emp2);
			empSet.add(emp3);
			empSet.add(emp4);
			empSet.add(emp5);

			System.out.println("Employee Name  EmpId  Salary   Department\n");
			for(Assignment41_Employee emp : empSet) {
				System.out.println(emp.getEmpName()+"  "+emp.getEmpId()+"  "+emp.getEmpSalary()+" "+emp.getEmpDeptId());
			}
		}
		
		public static void main(String[] args) {
		
			Assignment41_Test test = new Assignment41_Test();
			System.out.println("Sorted list based on employee salary is: \n");
			test.getEmployeeDetails();
		}
		
}

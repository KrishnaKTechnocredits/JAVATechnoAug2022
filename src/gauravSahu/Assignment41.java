/*Assignment - 41 : 20th Oct'2022

Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.*/

package gauravSahu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Assignment41 {
	


	void getSortedOrder() {
		
		ArrayList<Assignment41POJO> empInfoSet = new ArrayList<Assignment41POJO>();
		Assignment41POJO e1 = new Assignment41POJO("Gaurav", 400, 2000000, 15);
		Assignment41POJO e2 = new Assignment41POJO("Avinash", 500, 3000000, 10);
		Assignment41POJO e3 = new Assignment41POJO("Vinod", 900 , 5000000, 11);
		Assignment41POJO e4 = new Assignment41POJO("Mohit", 700, 1000000, 25);
		
	
		empInfoSet.add(e1);		
		empInfoSet.add(e2);	
		empInfoSet.add(e3);		
		empInfoSet.add(e4);	
		 
		
		Collections.sort(empInfoSet);
		
		for(Assignment41POJO emp : empInfoSet) {
			System.out.println(emp.getName()+"--"+ emp.getId()+"--"+ emp.getSalary());
		}
	}

	public static void main(String[] args) {
		Assignment41 a41 = new Assignment41();
		System.out.println("Sorting based on salary");
		a41.getSortedOrder();
	}
}

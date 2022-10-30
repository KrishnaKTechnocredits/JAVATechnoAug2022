package sagarY.collection.assignment_42;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmployeeDetails>{
	

	{
		System.out.println("Emp ID "+"-->" + "Joining Date"+"-->"+" Employee Name "+"-->"+"Salary "+"-->" +" Designation\n");
	}
	
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}

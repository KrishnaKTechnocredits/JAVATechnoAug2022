package sagarY.collection.assignment_42;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<EmployeeDetails>{
	

	{
		System.out.println("Emp ID "+"-->" + "Joining Date"+"-->"+" Employee Name "+"-->"+" Salary "+"-->" +" Designation\n");
	}

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.getEmpId()-o2.getEmpId();
	}

}

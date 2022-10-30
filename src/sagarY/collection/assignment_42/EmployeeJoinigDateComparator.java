package sagarY.collection.assignment_42;

import java.util.Comparator;

public class EmployeeJoinigDateComparator implements Comparator<EmployeeDetails>{
	

	{
		System.out.println("Emp ID "+"-->" + "Joining Date"+"-->"+" Employee Name "+"-->"+" Salary "+"-->" +" Designation\n");
	}

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.getEmpJoiningDate().compareTo(o2.getEmpJoiningDate());
	}

}

package adittyThakare.comparator;

import java.util.Comparator;

public class EmployeeDeptIdComparator implements Comparator<EmployeeNew>{
	@Override
	public int compare(EmployeeNew e1, EmployeeNew e2){
		return e1.getEmpDeptId() - e2.getEmpDeptId();
	}
}

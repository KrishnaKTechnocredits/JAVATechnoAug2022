package adittyThakare.comparator;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<EmployeeNew>{
	@Override
	public int compare(EmployeeNew e1, EmployeeNew e2){
		return e1.getEmpId() - e2.getEmpId();
	}
}

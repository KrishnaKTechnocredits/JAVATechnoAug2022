package adittyThakare.comparator;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmployeeNew> {
	@Override
	public int compare(EmployeeNew e1, EmployeeNew e2){
		return e1.getEmpName().compareTo(e2.getEmpName());
	}
}

package rashmiG.Collections.Assignment42_Comparator;

import java.util.Comparator;

public class EmployeeJoiningDate implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		try {
			return o1.getEmpJoiningDate().compareTo(o2.getEmpJoiningDate());
		}catch(NullPointerException e) {
			return -1;
		}
		
	}
	

}

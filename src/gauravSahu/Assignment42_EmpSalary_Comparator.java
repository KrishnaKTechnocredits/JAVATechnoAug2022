package gauravSahu;

import java.util.Comparator;

public class Assignment42_EmpSalary_Comparator implements Comparator<Assignment42_EmpPOJO> {
	
	@Override
	public int compare(Assignment42_EmpPOJO o1, Assignment42_EmpPOJO o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}

}

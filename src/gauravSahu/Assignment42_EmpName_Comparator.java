package gauravSahu;

import java.util.Comparator;

public class Assignment42_EmpName_Comparator implements Comparator<Assignment42_EmpPOJO> {

	@Override
	public int compare(Assignment42_EmpPOJO o1, Assignment42_EmpPOJO o2) {

		return o1.getName().compareTo(o2.getName());
	}
}

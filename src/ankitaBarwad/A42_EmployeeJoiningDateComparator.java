package ankitaBarwad;

import java.util.Comparator;

public class A42_EmployeeJoiningDateComparator implements Comparator<A42_Employee> {

	@Override
	public int compare(A42_Employee o1, A42_Employee o2) {
		return o1.getempJoiningDate().compareTo(o2.getempJoiningDate());
	}
}

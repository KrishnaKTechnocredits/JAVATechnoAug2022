package ankitaBarwad;

import java.util.Comparator;

public class A42_EmployeeIdComparator implements Comparator<A42_Employee>{

	@Override
	public int compare(A42_Employee o1, A42_Employee o2) {
		return o1.getEmpId() - o2.getEmpId();
	}

}

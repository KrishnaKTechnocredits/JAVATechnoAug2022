package nehaniG.Assignment42;

import java.util.Comparator;


	public class EmpDeptIdComparator implements Comparator<Employee> {
		public int compare(Employee e1, Employee e2) {
			return e1.getEmpDeptId() - e2.getEmpDeptId();
		}
	}



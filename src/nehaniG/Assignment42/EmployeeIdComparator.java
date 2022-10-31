package nehaniG.Assignment42;

import java.util.Comparator;


	public class EmployeeIdComparator implements Comparator<Employee> {
		public int compare(Employee e1, Employee e2) {
			return e1.getEmpId() - e2.getEmpId();
		}
	}


package shraddhaRekhate.Assignment42;
import java.util.Comparator;
public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1,Employee o2) {
		 return (int)( o1.getEmpSalary()-o2.getEmpSalary());
	}
}

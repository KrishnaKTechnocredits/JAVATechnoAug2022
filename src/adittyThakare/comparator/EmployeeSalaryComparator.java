package adittyThakare.comparator;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<EmployeeNew>{
	@Override
	public int compare(EmployeeNew e1, EmployeeNew e2){
		return e1.getEmpSalary() - e2.getEmpSalary();
	}

}

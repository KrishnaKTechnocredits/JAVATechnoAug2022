package shraddhaRekhate.Assignment41;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class EmpleyeeDetailsComparable {
  public static void main(String[] args) {
	Assignemnt41 emp1=new Assignemnt41("SHraddha",01,800000,12);
	Assignemnt41 emp2=new Assignemnt41("Maulik",10,500000,10);
	Assignemnt41 emp3=new Assignemnt41("Krishna",8,300000,6);
			
			List<Assignemnt41> listOfEmp=new ArrayList<>();
	         listOfEmp.add(emp1);
	         listOfEmp.add(emp2);
	         listOfEmp.add(emp3);
	         
	         Collections.sort(listOfEmp);
	         
	         for(Assignemnt41 e:listOfEmp) {
	        	 System.out.println(e.getEmpName()+"->"+e.getEmpId()+"->"+e.getEmpSalary()+"->"+e.getEmpDeptId());
	         }
	
}
}

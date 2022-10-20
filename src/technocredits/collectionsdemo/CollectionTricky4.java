package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTricky4 {

	public static void main(String[] args) {
		
		Map<String, List<Employee>> hm = new HashMap<String, List<Employee>>();
		String key = "7001-Admin";
		
		if(hm.containsKey(key)) {
			Employee e = new Employee();
			//e.setEmpName();
			//e.setEmpId();
			//e.setManagerId();
			List<Employee> listOfEmp = hm.get(key);
			listOfEmp.add(e);
			hm.put("7001-Admin", listOfEmp);
		}else {
			Employee e = new Employee();
			//e.setEmpName();
			//e.setEmpId();
			//e.setManagerId();
			List<Employee> listOfEmp = new ArrayList<Employee>();
			listOfEmp.add(e);
			hm.put("7001-Admin", listOfEmp);
		}
	}
}

// {7001-Admin = {empId=76993, empName=Abhijit Mane, managerId=20209}}
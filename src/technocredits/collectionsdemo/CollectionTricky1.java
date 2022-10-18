package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTricky1 {

	public static void main(String[] args) {
		Map<Integer, List<String>> managerEmpMap = new HashMap<Integer, List<String>>();

		
		////////////////////////////
		for(int i=1;i<=2;i++) {
			int key = 20209; // 
			if (managerEmpMap.containsKey(key)) {
				List<String> employeeList = managerEmpMap.get(key);
				employeeList.add("Sumit Kulkarni");
				managerEmpMap.put(key, employeeList);
				
			} else {
				ArrayList<String> empList = new ArrayList<String>();
				empList.add("Abhijit Mane");
				managerEmpMap.put(key, empList);
			}
		}
			
		System.out.println(managerEmpMap);

		
	}
}

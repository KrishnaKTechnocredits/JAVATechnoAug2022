package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTricky2 {

	public static void main(String[] args) {
		Map<String, List<Integer>> deptEmpMap = new HashMap<String, List<Integer>>();
		String key = "7001-Admin";
		
		for(int i=1;i<=2;i++) {
			if(deptEmpMap.containsKey(key)) {
				List<Integer> empList = deptEmpMap.get(key);
				empList.add(76113);
				deptEmpMap.put(key, empList);
			}else {
				List<Integer> listOfEmpID = new ArrayList<Integer>();
				listOfEmpID.add(76993);
				deptEmpMap.put(key, listOfEmpID);
			}
		}

		System.out.println(deptEmpMap);
		
	}
}

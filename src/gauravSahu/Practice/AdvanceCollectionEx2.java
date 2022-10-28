package gauravSahu.Practice;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class AdvanceCollectionEx2 {
	
	public static void main(String[] args) {
		Map<String, List<Integer>> deptMap = new HashMap<String, List<Integer>>();
		 String key = "Gaurav";
		for(int i = 1; i<=2 ; i++) {
			
			if(deptMap.containsKey(key)) {
				List<Integer> empId = deptMap.get(key);
				empId.add(7);
				deptMap.put(key, empId);
				
			}else {
				List<Integer> empId = new ArrayList<Integer>();
				empId.add(4);
				deptMap.put(key, empId);
			}
		}System.out.println(deptMap);
	}

}

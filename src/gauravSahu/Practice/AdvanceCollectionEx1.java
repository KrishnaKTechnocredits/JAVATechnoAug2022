package gauravSahu.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvanceCollectionEx1 {

	public static void main(String[] args) {
		Map<Integer, List<String>> empMap = new HashMap<Integer, List<String>>();
		for (int i = 1; i <= 2; i++) {
			int key = 5;
			if (empMap.containsKey(key)) {
				List<String> empList = empMap.get(key);
				empList.add("Sahu");
				empList.add("1");
				empList.add("2");
				empList.add("3");
				empMap.put(key, empList);
			} else {
				List<String> empList = new ArrayList<String>();
				empList.add("Gaurav");
				empMap.put(key, empList);
			}
		}
		System.out.println(empMap);
	}
}

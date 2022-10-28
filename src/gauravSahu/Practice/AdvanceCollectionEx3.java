package gauravSahu.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvanceCollectionEx3 {

	public static void main(String[] args) {
		Map<String, List<Map<String, Object>>> hm = new HashMap<String, List<Map<String, Object>>>();

		Map<String, Object> empInfo = new HashMap<String, Object>();
		empInfo.put("Gaurav", "Gaurav");
		empInfo.put("Gaurav", "Sahu");
		List<Object> empList = new ArrayList<Object>();
		empList.add(empList);
		System.out.println(empList);
		
		System.out.println(empInfo);
	}
}
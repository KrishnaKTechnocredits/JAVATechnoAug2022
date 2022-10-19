package technocredits.collectionsdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionTricky3 {

	public static void main(String[] args) {
		
		Map<String, List<Map<String,Object>>> hm = new HashMap<String, List<Map<String,Object>>>();

		Map<String, Object> empInfoMap = new LinkedHashMap<String, Object>();
		empInfoMap.put("empId",76993);
		empInfoMap.put("empName","Abhijit Mane");
		empInfoMap.put("managerId",20209);

		/*
		 * hm.put("7001-Admin",empInfoMap);
		 * 
		 * 
		 * //////////////////////////////////
		 * 
		 * empInfoMap = hm.get("7001-Admin"); empInfoMap.put("empId",76113);
		 * empInfoMap.put("empName","Prayag Mokate"); empInfoMap.put("managerId",20205);
		 * 
		 * hm.put("7001-Admin",empInfoMap);
		 * 
		 * System.out.println(hm);
		 */
		
	}
}

// {7001-Admin = {empId=76993, empName=Abhijit Mane, managerId=20209}}
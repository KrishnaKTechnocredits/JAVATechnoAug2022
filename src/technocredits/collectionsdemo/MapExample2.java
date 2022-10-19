package technocredits.collectionsdemo;

import java.util.HashMap;

public class MapExample2 {
	
	public static void main(String[] args) {
		HashMap<String,String> nameMap = new HashMap<String, String>();
		System.out.println(nameMap.toString());
		
		String temp1 = nameMap.put("Ma", "Maulik");
		nameMap.put("Kr", "Krishna");
		nameMap.put("Mo", "Mohini");
		nameMap.put("Ra", "Rahul");
		String temp2 = nameMap.put("Ma", "Maurvi");
		nameMap.put("ma", "Maa");
		
		System.out.println(nameMap);
	}
}

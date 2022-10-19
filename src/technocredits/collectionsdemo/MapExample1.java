package technocredits.collectionsdemo;

import java.util.HashMap;

public class MapExample1 {
	
	public static void main(String[] args) {
		HashMap<String,String> nameMap = new HashMap<String, String>();
		String temp1 = nameMap.put("Ma", "Maulik");
		nameMap.put("Kr", "Krishna");
		nameMap.put("Mo", "Mohini");
		nameMap.put("Ra", "Rahul");
		String temp2 = nameMap.put("Ma", "Maurvi");
		nameMap.put("ma", "Maa");
		
		System.out.println(nameMap.size());
		System.out.println(nameMap.get("Ma")); // "Maurvi"
		System.out.println("temp1" + temp1);
		System.out.println("temp2 " + temp2);
	
		System.out.println(nameMap.containsKey("ma"));
	}
}

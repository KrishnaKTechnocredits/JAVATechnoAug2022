package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetIterateExample {

	// Sagar --> Yadav
	// Deepak --> Patil
	// Array // Collection interface
	public static void main(String[] args) {
		
		Map<String, String> mapOfName = new HashMap<String, String>();
		mapOfName.put("Sagar", "Yadav");
		mapOfName.put("Deepak", "Patil");
		
		Set<String> keys = mapOfName.keySet();
		for(String currentKey : keys) {
			System.out.println(currentKey + "-->" + mapOfName.get(currentKey));
		}
		ArrayList<String> al = null;	
	}
}

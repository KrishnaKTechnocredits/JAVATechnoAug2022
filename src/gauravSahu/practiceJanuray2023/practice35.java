package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class practice35 {
	
	public static void main(String[] args) {
		String str = "Gaurav"; 
		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();
		
		System.out.println(str1);
		
		String str2 =  "technocredits";
		
		ArrayList<Character> al = new ArrayList<Character>();
		
		
		char [] ch = str2.toCharArray();
		
		for(Character ch2  : ch) {
			al.add(ch2);
		}
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int index=0; index<al.size();index++ ) {
			char ch4  = al.get(index);
			if(map.containsKey(ch4)) {
				int count = map.get(ch4);
				map.put(ch4, count + 1 );
			}else {
				map.put(ch4, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(Character ch5  : keys) {
			System.out.println(ch5 + "  " + map.get(ch5));
		}
		
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
	}

}

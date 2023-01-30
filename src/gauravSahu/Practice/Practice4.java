package gauravSahu.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Practice4 {
	
	public static void main(String[] args) {
		String input = "technocredits";
		char[] ch = input.toCharArray();
		ArrayList<Character> listOfChar = new ArrayList<Character>();
		for(char ch1 : ch) {
			listOfChar.add(ch1);
		}
		
		System.out.println(Arrays.asList(listOfChar));
		
		Map<Character, Integer> charMap = new LinkedHashMap<Character,Integer>();
		for(int i = 0 ; i<listOfChar.size();i++) {
			char ch2 = listOfChar.get(i);
			if(charMap.containsKey(ch2)) {
				int count = charMap.get(ch2);
				charMap.put(ch2,count+1);
			}else {
				charMap.put(ch2,1);
			}
		}System.out.println(Arrays.asList(charMap));
		Set<Character> keys = charMap.keySet();
		for(Character ch3 : keys) {
			System.out.println(ch3 + " ----  " + charMap.get(ch3));
		}
		
		String input2 = "Hi Hello Techno Techno Hi" ;
		String[] arr = input2.split(" ");
		
		ArrayList<String> list = new ArrayList<String>();
		for(String str : arr) {
			list.add(str);
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Map<String, Integer> strMap = new LinkedHashMap<String, Integer>(); 
		for(int j = 0;j<list.size();j++){
			String str1 = list.get(j);
			if(strMap.containsKey(str1)) {
				int count = strMap.get(str1);
				strMap.put(str1, count+1);
			}else {
				strMap.put(str1, 1);
			}
		}System.out.println(Arrays.asList(strMap));
		Set<String> Keys1 = strMap.keySet();
		for(String str3 : Keys1) {
			System.out.println(str3 + " -- " + strMap.get(str3));
		}
		

		String str = "India is my mother land";
		
		char[] ch4 = str.toCharArray();
		
		System.out.println(Arrays.toString(ch4));
	}

	
}

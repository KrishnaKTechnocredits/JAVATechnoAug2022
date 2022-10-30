package deepakPatil.Assignment40Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;


public class Assignment40_6 {
	
	Map<String, Integer> getFrequencyOfWord(String input){
		
		String[]strArray=input.split(" ");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(String str:strArray) {
			
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str, 1);
		}
		
		return map;
	}
	
	void displayMap(Map<String, Integer> wordFreqMap) {
		
		Set<String> setOfKeys = wordFreqMap.keySet();
		Iterator<String> itr1 = setOfKeys.iterator();
		while (itr1.hasNext()) {
			String str1 = itr1.next();
			System.out.println(str1 + "-->" + wordFreqMap.get(str1));
		}
	}
	
	public static void main(String[] args) {
		String name = "Hi Hello Techno Techno Hi";
		System.out.println("Frequency of each word from String: "+name);
		Assignment40_6 assignment40_6 = new Assignment40_6();
		Map<String, Integer> wordFreqMap = assignment40_6.getFrequencyOfWord(name);
		assignment40_6.displayMap(wordFreqMap);
	}

}

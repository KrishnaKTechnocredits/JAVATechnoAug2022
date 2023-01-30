package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import akankshaVyas.StringOperation.Array;

public class practice36 {
	
	public static void main(String[] args) {
		String input = "Hi Hello Techno Techno Hi" ;
		
		String [] str = input.split(" ");
		
		ArrayList<String> al =  new ArrayList<String> ();
		
		
		for(String name : str) {
			al.add(name);
		}
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(int index = 0;index<al.size();index++) {
			String name2  = al.get(index);
			if(map.containsKey(name2)) {
				int count = map.get(name2);
				map.put(name2, count + 1);
			}else {
				map.put(name2, 1);
			}
				
			
		}
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		for(String name : keys) {
			System.out.println(name + "   " + map.get(name));
		}
		
		
		Integer [] input1 =  {10,2,5,2,3,3,3,10,11,8,8,8};
		
		ArrayList<Integer> al4 = new ArrayList<Integer>(Arrays.asList(input1));
		
		Map<Integer, Integer> map2 = new LinkedHashMap<Integer, Integer>();
		
		for(int i = 0;i<al4.size();i++) {
			int num = al4.get(i);
			if(map2.containsKey(num)) {
				int count = map2.get(num);
				map2.put(num, count + 1);
			}else {
				map2.put(num, 1);
			}
		}
		Set<Integer> keys1 = map2.keySet();
		for(Integer a : keys1) {
			System.out.println(a + "    " + map2.get(a) );
		}
		
		System.out.println(map2);
		}
		
			
}

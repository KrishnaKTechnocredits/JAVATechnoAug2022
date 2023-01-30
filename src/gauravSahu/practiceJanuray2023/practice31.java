package gauravSahu.practiceJanuray2023;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class practice31 {
	
	void getUniqueNames(String [] arr) {
		
		HashSet<String> set1 = new HashSet<String>();
		
		for(String name : arr) {
			set1.add(name);
		}
		System.out.println(set1);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		for(String name2 : arr) {
			set2.add(name2);
		}
		
		System.out.println(set2);
	}
	
	void getRemoveChar(String str) {
		
		LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
		
		for(int index = 0; index<str.length()-1;index++) {
			char ch  = str.charAt(index);
			boolean flag = set1.add(ch);
			if(flag) {
				System.out.println("Added : " + ch);
			}else {
				System.out.println("Not added : " + ch);
			}
			
		}
		
		System.out.println(set1);
	}
	
	
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		
		new practice31().getUniqueNames(arr);
		
		String input = "technocredits";
		
		new practice31().getRemoveChar(input);
	}

}

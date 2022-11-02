package vinod.Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment39B {
	
	void getUniqueChar(String input) {
		LinkedHashSet<Character> uniqueChar = new LinkedHashSet<Character>();
		for(int index = 0;index<input.length();index++) {
			char ch = input.charAt(index);
			uniqueChar.add(ch);
		}System.out.println("Unique Character Output using LinkedHashSet : " + uniqueChar);
	}
	
	void getUniqueCharUsingHashSet(String input) {
		HashSet<Character> uniqueChar = new HashSet<Character>();
		for(int index = 0;index<input.length();index++) {
			char ch = input.charAt(index);
			uniqueChar.add(ch);
		}System.out.println("Unique Character Output using Hashset : " + uniqueChar);
	}
	
	public static void main(String[] args) {
		Assignment39B assign39B = new Assignment39B();
		String input = "technocredits";
		System.out.println("Given input : " + input);
		assign39B.getUniqueChar(input);
		assign39B.getUniqueCharUsingHashSet(input);
	}

}

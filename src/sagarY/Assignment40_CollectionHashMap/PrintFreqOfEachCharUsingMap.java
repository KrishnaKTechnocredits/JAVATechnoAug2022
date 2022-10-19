/*Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on	*/

package sagarY.Assignment40_CollectionHashMap;
import java.util.*;

public class PrintFreqOfEachCharUsingMap {
		
	static void printCharFreq(String str) {
		HashMap<Character, Integer> getCharFreqMap = new HashMap<Character, Integer>();
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			
			if(getCharFreqMap.containsKey(ch)) {
				int count = getCharFreqMap.get(ch);
				getCharFreqMap.put(ch, count+1);
			}else {
				getCharFreqMap.put(ch, 1);
			}
		}
		System.out.println("\nOutput: Character Frequency in strings:");
		Set<Character> keys = getCharFreqMap.keySet();
		for(Character key : keys) {
			System.out.println("\t\t "+key +"==>"+getCharFreqMap.get(key));
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Program 5 : WAP to find frequence  of each \n   character in a given String using Map.");
		System.out.println("===========================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String name = sc.next();
		printCharFreq(name);
	}

}

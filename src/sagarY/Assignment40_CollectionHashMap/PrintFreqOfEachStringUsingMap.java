/*Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2	*/

package sagarY.Assignment40_CollectionHashMap;
import java.util.*;

public class PrintFreqOfEachStringUsingMap {
		
	static void printStringFreq(String[] input) {
		
		LinkedHashMap<String, Integer> getStringFreqMap = new LinkedHashMap<String, Integer>();
		for(int index=0;index<input.length;index++) {
			String str = input[index];
			
			if(getStringFreqMap.containsKey(str)) {
				int count = getStringFreqMap.get(str);
				getStringFreqMap.put(str, count+1);
			}else {
				getStringFreqMap.put(str, 1);
			}
		}
		System.out.println("\nOutput: String Frequency is:");
		Set<String> keys = getStringFreqMap.keySet();
		for(String key : keys) {
			System.out.println("\t"+key +"==>"+getStringFreqMap.get(key));
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Program 7 : WAP to find frequence  of each \n\t    word in a given String using Map.");
		System.out.println("----------------------------------------------");
		String name = "Hi Hello Techno Techno Hi";
		String[] arr = name.split(" ");
		System.out.println("Input is: "+Arrays.toString(arr));
		printStringFreq(arr);
	}

}

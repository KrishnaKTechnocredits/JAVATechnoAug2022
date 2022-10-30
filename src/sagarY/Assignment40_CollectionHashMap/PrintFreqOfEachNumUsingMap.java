/*Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1 	*/

package sagarY.Assignment40_CollectionHashMap;
import java.util.*;

public class PrintFreqOfEachNumUsingMap {
		
	static void printNumberFreq(Integer[] input) {
		
		TreeMap<Integer, Integer> getNumFreqMap = new TreeMap<Integer, Integer>();
		
		for(int index=0;index<input.length;index++) {
			int num = input[index];
			
			if(getNumFreqMap.containsKey(num)) {
				int count = getNumFreqMap.get(num);
				getNumFreqMap.put(num, count+1);
			}else {
				getNumFreqMap.put(num, 1);
			}
		}
		System.out.println("\nOutput: Number Frequency is:");
		Set<Integer> keys = getNumFreqMap.keySet();
		for(Integer key : keys) {
			System.out.println("\t"+key +"==>"+getNumFreqMap.get(key));
		}
		
	}	
	
	public static void main(String[] args) {
		System.out.println("Program 7 : WAP to find frequence  of each number \nin a given String using Map.");
		System.out.println("==================================================");
		Integer[] numArray = {10,2,5,2,3,3,3,10,11,8,8,8};
		System.out.println("Input is: \n"+Arrays.toString(numArray));
		printNumberFreq(numArray);
	}

}

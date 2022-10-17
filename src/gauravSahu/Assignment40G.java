/*Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1  */
package gauravSahu;

import java.util.LinkedHashMap;
import java.util.Set;

public class Assignment40G {
	
	void getFreqOfNum(Integer[] input ){
		LinkedHashMap<Integer, Integer> listOfFreq = new LinkedHashMap<Integer, Integer>();
		for(Integer num : input) {
			if(listOfFreq.containsKey(num)) {
				int count = listOfFreq.get(num);
				listOfFreq.put(num,count+1);
			}else {
				listOfFreq.put(num, 1);
			}
		}System.out.println(listOfFreq);
		Set<Integer> key = listOfFreq.keySet();
		for(int num : key) {
			System.out.println(num + " -->>" + listOfFreq.get(num));
		}
	}
	
	public static void main(String[] args) {
		Assignment40G a40 = new Assignment40G();
		Integer[]  input = {10,2,5,2,3,3,3,10,11,8,8,8};
		a40.getFreqOfNum(input);
	}
}

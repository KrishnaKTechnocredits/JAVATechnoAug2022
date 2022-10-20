package shubhamG.Assignment31to40;

import java.util.Arrays;
import java.util.TreeMap;

/*Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1  
*/         
public class Assignment40Program7 {
	void getFrequencyOfEachInteger(Integer[] numArr) {
		
		TreeMap<Integer, Integer> frequency = new TreeMap<Integer, Integer>();
		for (int i = 0; i < numArr.length; i++) {
			if (frequency.containsKey(numArr[i])) {
				frequency.put(numArr[i], frequency.get(numArr[i]) + 1);
			} else {
				frequency.put(numArr[i], 1);
			}
		}
		for (Integer currentKey : frequency.keySet()) {
			System.out.println(currentKey + " ---> " + frequency.get(currentKey));
		}
	}

	public static void main(String[] args) {
		Integer[] input =  {10,2,5,2,3,3,3,10,11,8,8,8} ;
		System.out.println("Input String is: " + Arrays.toString(input));
		new Assignment40Program7().getFrequencyOfEachInteger(input);
	}


}

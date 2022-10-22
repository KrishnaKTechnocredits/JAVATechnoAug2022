/*Assignment 40 : 16th Oct'2022

Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2
*/

package deepakPatil.Assignment40Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment40_1 {
	
	void findFrequencyOfNumber(Integer[]numArray) {
		
		ArrayList <Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(numArray));
		ArrayList <Integer> tempArrayList = new ArrayList <Integer>();
		
		int num=0;
		int alOriginalLength=0;
		int alNewLength=0;
		while(listOfNum.size()>0) {
			
			num=listOfNum.get(0);
			tempArrayList.add(num);
			alOriginalLength=listOfNum.size();
			listOfNum.removeAll(tempArrayList);
			alNewLength=listOfNum.size();
			System.out.println(num+"-->"+(alOriginalLength-alNewLength));
			tempArrayList.clear();			
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] numArray = {3,5,33,3,55,3,11,11};
		System.out.println("Given Array: "+Arrays.toString(numArray));
		System.out.println("frequency of each element form given array as below:");
		new Assignment40_1().findFrequencyOfNumber(numArray);
	}

}

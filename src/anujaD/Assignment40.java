/*Assignment 40 : 16th Oct'2022
Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2
*/
/*Assignment 40 : 16th Oct'2022
Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]
*/

/*Assignment 40 : 16th Oct'2022
Program 3 : Return a reverse String [Method : inplace reverse].
*/

package anujaD;


import java.util.ArrayList;
import java.util.Arrays;

public class Assignment40 {
	
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
	ArrayList<Integer> getMissingNumbers(Integer[] numArray, int startIndex, int endIndex) {
		ArrayList<Integer> numList1 = new ArrayList<Integer>(Arrays.asList(numArray));
		ArrayList<Integer> numList2 = new ArrayList<Integer>();

		for (int index = startIndex; index <= endIndex; index++) {
			numList2.add(index);
		}
		numList2.removeAll(numList1);
		return numList2;
	}
	
	String getInplaceReverseString(String input) {
		char startChar=0;
		char endChar=0;
		
		for(int i=0,j=input.length()-1;i<j;i++,j--) {
			startChar=input.charAt(i);
			endChar=input.charAt(j);
			if(i==0)
				input=endChar+input.substring(i+1, j)+startChar;
			else
				input=input.substring(0,i)+endChar+input.substring(i+1,j)+startChar+input.substring(j+1,input.length());
		}
		return input;
	}
	
	public static void main(String[] args) {
		
		Integer[] numArray = {3,5,33,3,55,3,11,11};
		System.out.println("Given Array: "+Arrays.toString(numArray));
		System.out.println("frequency of each element form given array as below:");
		new Assignment40().findFrequencyOfNumber(numArray);
	
		Integer[] numArray1 = { 60, 54, 51, 57 };
		int startIndex = 50;
		int endIndex = 60;
		System.out.println("Given array is: " + Arrays.toString(numArray1));
		System.out.println("Missing number from given array is:");
		System.out.println(new Assignment40().getMissingNumbers(numArray1, startIndex, endIndex));
		
		String input="technocredits";
		System.out.println("Given string is: " +input);
		System.out.println("Reverse String using inplace replacement: "+new Assignment40().getInplaceReverseString(input));
	}

}



/*Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2
*/package gauravSahu;

import java.util.ArrayList;

public class Assignment40A {
	
	void getFreqOfCharacter(ArrayList<Integer> inputList) {
		System.out.println("Input array list : " + inputList);
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		int num = 0;
		int inputSize = 0;
		int outputSize = 0;
		while(inputList.size()>0) {
			num = inputList.get(0);
			inputSize = inputList.size();
			outputList.	add(num);
			inputList.removeAll(outputList);
			outputSize = inputList.size();
			System.out.println("Frequency of " + num + " is :  " + (inputSize-outputSize));
			outputList.clear();
		}
	}
	
	public static void main(String[] args) {
		Assignment40A a40 = new Assignment40A();
		Integer[] input = {3,5,33,3,55,3,11,11};
		ArrayList<Integer> givenNumList = new ArrayList<Integer>();
		for(int num : input) {
			givenNumList.add(num);
		}
		a40.getFreqOfCharacter(givenNumList);
		
	}

}

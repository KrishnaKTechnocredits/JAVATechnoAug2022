package komalShrivastava;

import java.util.Arrays;

public class DuplicateUniqueNumbers {

	//get replacing number in array
	
	int getReplaceNumber(int[] arr) {
		int replaceNum = 0;
		boolean isZeroAvailable = false;
		int minNum = arr[0];
		for(int num : arr) {
			if(num == 0)
				isZeroAvailable = true;
			if(minNum>num)
				minNum = num;
		}
		return replaceNum = isZeroAvailable ? minNum -1 : replaceNum;
	}
	
	//print duplicate numbers from given array
	
	void printDuplicateNum(int[] arrInput) {
		int replaceNum = getReplaceNumber(arrInput);
		for(int index = 0; index < arrInput.length; index++) {
			int count = 0;
			for(int j = index+1; j< arrInput.length; j++) {
				if((arrInput[index]==arrInput[j]) && arrInput[index]!=replaceNum) {
					count++;
					arrInput[j] = replaceNum;
				}
			}
			if(count>0) {
				System.out.print(arrInput[index] + " ");
			}
		}
		System.out.println("\n");
	}
	
	//print unique numbers from given array (having freq 1)
	
	void printUniqueNum(int[] arrInput) {
		int replaceNum = getReplaceNumber(arrInput);
		for(int index = 0; index < arrInput.length; index++) {
			int count = 0;
			for(int j = index+1; j< arrInput.length; j++) {
				if((arrInput[index]==arrInput[j]) && arrInput[index]!=replaceNum) {
					count++;
					arrInput[j] = replaceNum;
				}
			}
			if(count==0 && arrInput[index]!=replaceNum) {
				System.out.print(arrInput[index] + " ");
			}
		}
		System.out.println("\n");
	}
	
	//print missing numbers from given array from range 1 to 10
	
	void printMissingNum(int[] arrInput) {
		for(int num=1; num<=10; num++) {
			boolean missingNumberFlag = true;
			for(int index=0; index<arrInput.length; index++) {
				if(num == arrInput[index]) {
					missingNumberFlag = false;
					break;
				}
			}
			if(missingNumberFlag)
				System.out.print(num + " ");
		}
		System.out.println("\n");
	}
	
	//print duplicate names from given array (do not consider case sensitivity)
	
	void printDuplicateNames(String[] arrInput) {
		for(int index=0; index<arrInput.length; index++) {
			int count = 0;
			for(int j=index+1; j<arrInput.length; j++) {
				if(arrInput[index].equalsIgnoreCase(arrInput[j])) {
					count++;
					arrInput[j] = "";
				}
			}
			if(count>0)
				System.out.print(arrInput[index].toLowerCase() + " ");
		}
		System.out.println("\n");
	}
	
	//print unique names from given array
	
	void printUniqueNames(String[] arrInput) {
		for(int index=0; index<arrInput.length; index++) {
			int count = 0;
			for(int j=index+1; j<arrInput.length; j++) {
				if(arrInput[index].equalsIgnoreCase(arrInput[j]) && !arrInput[index].equals("")) {
					count++;
					arrInput[j]="";
				}
			}
			if(count==0)
				System.out.print(arrInput[index].toLowerCase() + " ");
		}
		System.out.println("\n");
	}
	
	//print unique numbers from given array (all content uniquely)
	
	void getAllNumbers(int[] arrInput) {
		int replaceNum = getReplaceNumber(arrInput);
		for(int index=0; index<arrInput.length; index++) {
			for(int innerIndex=index+1; innerIndex<arrInput.length; innerIndex++ ) {
				if(arrInput[index] == arrInput[innerIndex] && arrInput[index]!=replaceNum) {
					arrInput[innerIndex] = replaceNum;
				}
			}
			if(arrInput[index]!=replaceNum)
				System.out.print(arrInput[index] + " ");
		}
		System.out.println("\n");
	}
	
	//print each number with its frequency
	
	void printNumberFrequency(int[] arrInput) {
		int replaceNum = getReplaceNumber(arrInput);
		for(int index=0; index<arrInput.length; index++) {
			int count=1;
			for(int j=index+1; j<arrInput.length; j++) {
				if(arrInput[index]==arrInput[j] && arrInput[index]!=replaceNum) {
					count++;
					arrInput[j] = replaceNum;
				}
			}
			if(arrInput[index]!=replaceNum)
			System.out.println(arrInput[index] + "-->" + count);
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		DuplicateUniqueNumbers duplicateUniqueNumbers = new DuplicateUniqueNumbers();
		
		int[] input = {10,20,10,0,20,10,44,0,-1,55};
		System.out.println("Duplicate Numbers \nInput : " + Arrays.toString(input) + "\nOutput : ");
		duplicateUniqueNumbers.printDuplicateNum(input);

		int[] input2 = {15,30,30,150,94,60};
		System.out.println("Unique Numbers \nInput : " + Arrays.toString(input2) + "\nOutput : ");
		duplicateUniqueNumbers.printUniqueNum(input2);
		
		int[] input3 = {1,3,9,5,6,10};
		System.out.println("Missing Numbers \nInput : " + Arrays.toString(input3) + "\nOutput : ");
		duplicateUniqueNumbers.printMissingNum(input3);
		
		String[] input4 = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Duplicate Names \nInput : " + Arrays.toString(input4) + "\nOutput : ");
		duplicateUniqueNumbers.printDuplicateNames(input4);
		
		String[] input5 = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Unique Names \nInput : " + Arrays.toString(input5) + "\nOutput : ");
		duplicateUniqueNumbers.printUniqueNames(input5);
		
		int[] input6 = {10,20,10,0,20,10,44,0,-1,55};
		System.out.println("All Distinct Numbers \nInput : " + Arrays.toString(input6) + "\nOutput : ");
		duplicateUniqueNumbers.getAllNumbers(input6); 
		
		int[] input7 = {10,20,10,0,20,10,44,0,-1,55};
		System.out.println("Frequency of Numbers \nInput : " + Arrays.toString(input7) + "\nOutput : ");
		duplicateUniqueNumbers.printNumberFrequency(input7);
	}
}
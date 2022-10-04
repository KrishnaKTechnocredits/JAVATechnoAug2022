package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Test3_Program2 {
	
	char[] getMiddleCharOfArrayElement(String[] inputArray) {
		int strIndex = 0;
		char[] outputArray = new char[inputArray.length];
		
		for(int index=0;index<inputArray.length;index++) {
			int strLength = inputArray[index].length();
			if(strLength%2==0) {
				strIndex = strLength/2-1;
				outputArray[index] = inputArray[index].charAt(strIndex);
			}	
			else {	
				strIndex = strLength/2;
				outputArray[index] = inputArray[index].charAt(strIndex);
			}
		}
		return outputArray;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3_Program2 test = new Test3_Program2();
		
		String[] arr = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		char[] opArray= test.getMiddleCharOfArrayElement(arr);
		
		System.out.println("Input Array: "+Arrays.toString(arr));
		System.out.println("\nMiddle characters of each element:");
		for(int index=0; index<opArray.length;index++) {
			System.out.println(arr[index]+" -> "+opArray[index]);
		}
		
	}

}

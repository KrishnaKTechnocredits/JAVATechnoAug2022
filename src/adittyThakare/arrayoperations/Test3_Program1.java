package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Test3_Program1 {
	
	char getMiddleCharOfMaxLengthString(String[] inputArray) {
		int maxLength = inputArray[0].length();
		int strIndex = 0;
		char outputChar=' ';
		
		for(int index=0;index<inputArray.length;index++) {
			int stringLength = inputArray[index].length();
			
			if(maxLength<stringLength) {
				maxLength = inputArray[index].length();
				
				 if(maxLength%2==0) { 
					 strIndex = maxLength/2-1; 
				 } 
				 else { 
					strIndex = maxLength/2; 
				 }
				 outputChar= inputArray[index].charAt(strIndex);
			}
		}
		return outputChar;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3_Program1 test1 = new Test3_Program1();
		String[] inputArray = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		char outputChar = test1.getMiddleCharOfMaxLengthString(inputArray);
		
		System.out.println("Input Array: "+Arrays.toString(inputArray));
		System.out.println("Middle character of max length string: "+outputChar);
		}
	}


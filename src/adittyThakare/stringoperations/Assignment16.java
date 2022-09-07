/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)
// boolean isPrimeNumber()
// display()
// printInfo()

//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c
*/package adittyThakare.stringoperations;

public class Assignment16 {
	
	int getStringLength(String str) {
		
		int strLength = str.length();
		return strLength;
	}
	
	char getStringChar(String str) {
		
		int strIndex = 0;
		int strLength = getStringLength(str);
		
		if(strLength%2==0)
			strIndex = strLength/2-1;
		else	
			strIndex = strLength/2;

		return  str.charAt(strIndex);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment16 assignment16 = new Assignment16();
		System.out.println("Program to find string length and middle character!");
		
		String inputString = "Aditty";
		char result = assignment16.getStringChar(inputString);
		System.out.println("\nInput String - "+inputString);
		System.out.println("Length: "+assignment16.getStringLength(inputString));
		System.out.println("Middle character: "+result);
		
		String inputString1 = "Technocredits";
		char result1 = assignment16.getStringChar(inputString1);
		System.out.println("\nInput String - "+inputString1);
		System.out.println("Length: "+assignment16.getStringLength(inputString1));
		System.out.println("Middle character: "+result1);
		
	}

}

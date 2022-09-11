/*
 * Test - 3 : 10th Sep'2022

Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h

2nd problem : 

char[] getMiddleCharFromName(String[] arr){
}

char[] ch = new char[arr.length];

sop(input[0] + "->" + output[0])

sop(input[index] + "->" + output[index])

 */
package rahulSaswadkar;

import java.util.Arrays;

public class ArrayProgram2 {
	public static void main(String[] args) {
		ArrayProgram2 arrayProgram2 = new ArrayProgram2();
		String[] str = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		System.out.println("Program 1 -" + "\nGiven Array : " + Arrays.toString(str));
		System.out.println("Max Lenght Element of given Array is : " + arrayProgram2.m1(str));
		System.out.println("Middle Character of Max lenght Element \'" + arrayProgram2.m1(str) +"\' of given array is : " + arrayProgram2.m2(arrayProgram2.m1(str)));
		
		String[] str1 = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		System.out.println("\nProgram 2 -" + "\nGiven Array : " + Arrays.toString(str1));
		System.out.println("Array of Miiddle character of each element of given array : " + Arrays.toString(arrayProgram2.m3(str1)));
		arrayProgram2.displayData(str1,arrayProgram2.m3(str1));
	}
	
	String m1(String[] str) {
		//int arrayLength = str.length;
		String maxString = str[0];
		for(int index=1;index<str.length;index++) {
			if(str[index].length()> maxString.length()) {
				maxString = str[index];
			}
			
		}
		return maxString;
	}
	
	char m2(String str) {
		char midChar = ' ';
		if(str.length() % 2 == 0) 
			midChar = str.charAt(str.length()/2-1);
		else
			midChar = str.charAt(str.length()/2);
		return midChar;

		}
	
	char[] m3(String[] str1) {
		char[] midChar = new char[str1.length];
		for(int index=0;index<str1.length;index++) {
			midChar[index] = m2(str1[index]);
		}
		return midChar;
		
	}
	
	void displayData(String[] str1, char[] midCharArr) {
		for(int index = 0;index<str1.length;index++) {
			System.out.println(str1[index] + "-->" + midCharArr[index]);
		}
	}
	
	
}

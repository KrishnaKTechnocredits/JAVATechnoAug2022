/*Test - 3 : 10th Sep'2022

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

sop(input[index] + "->" + output[index])*/
package shrutiArora;

import java.util.Arrays;

public class ProgrammingTest_3 {
	int maxLength = 0;
	String maxName = "";
	char getMiddleCharOfMaxLength(String[]input) {
		for(int index = 0; index<input.length;index++) {
			int length = input[index].length();
			if(maxLength< length) {
				maxLength = length ;
				maxName = input[index];
			}
		}
		char ch = getMiddleCharFromString(maxName);
		System.out.println(maxName + " : ");
		return ch ;
	}
	char getMiddleCharFromString(String name) {
		int length = name.length();
		int index = 0;
		if(length%2==0) {
			index = (length/2)-1;
		}
		else {
			index = length/2;
		}
		return name.charAt(index);
	}
	char[] getMiddleCharOfArrayElement(String[]name) {
		char[] output = new char[name.length];
		for(int index = 0 ; index< output.length;index++) {
			output[index] = getMiddleCharFromString(name[index]);
		}
		return output;
	}
		
	public static void main(String[] args) {
		ProgrammingTest_3 programmingTest_3 = new ProgrammingTest_3();
		System.out.println("*****************************************Program-1*****************************************");
		String[]input = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		System.out.println(" input: " + Arrays.toString(input));
		System.out.println(" Output: " + programmingTest_3.getMiddleCharOfMaxLength(input));
		System.out.println("*****************************************Program-2*****************************************");
		String[] input1 = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		System.out.println(" input: " + Arrays.toString(input1));
		System.out.println(" Output: ");
		char[] output = programmingTest_3.getMiddleCharOfArrayElement(input1);
		for(int index = 0 ; index<input1.length;index++) {
			System.out.println(input1[index]+ " -> " +  output[index]);
		}
	}
}
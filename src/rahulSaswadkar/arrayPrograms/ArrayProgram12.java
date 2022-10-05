/*
 * 
 * Assignment - 28 : 25th Sep'2022

Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4

Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e

Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
		 
		 
Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1
 */

package rahulSaswadkar.arrayPrograms;

import java.util.Arrays;

public class ArrayProgram12 {
	public static void main(String[] args) {
		ArrayProgram12 arrayProgram12 = new ArrayProgram12();
		
		String str1 = "TechnOcredits";
		String str2 = "technocredits";
		String[] str3 = {"technocredits", "swati", "aashvi"};
		
		System.out.println("Input String : " + str1);
		System.out.println("Count of Vowels in given String is : " + arrayProgram12.getCountOfVowelInStr(str1));
		
		System.out.println("\nInput String : " + str2);
		System.out.println("First Vowel in given String is : " + arrayProgram12.getFirstVowelInStr(str2));
		
		System.out.println("\nInput String : " + str2);
		arrayProgram12.printCountOfEachVowelInStr(str2);
		
		System.out.println("\nInput String Array : " + Arrays.toString(str3));
		arrayProgram12.printCountOfEachVowelInEachEleOfStrArr(str3);
		
		
	}
	
	int getCountOfVowelInStr(String str){
		int countVowel = 0;
		//String orgStr = str;
		str = str.toLowerCase();
		//System.out.println(orgStr + str);
		char ch = ' ';
		
		for(int index = 0; index < str.length() ; index++) {
			ch = str.charAt(index);
			switch(ch) {
				case 'a':
					countVowel += 1;
					break;
					
				case 'e':
					countVowel += 1;
					break;
				
				case 'i':
					countVowel += 1;
					break;
					
				case 'o':
					countVowel += 1;
					break;
					
				case 'u':
					countVowel += 1;
					break;
					
				default:
					break;
			
			}
		}
		return countVowel;
	}
	
	char getFirstVowelInStr(String str){
		char firstVowel = ' ';
		int countVowel = 0;
		//String orgStr = str;
		//str = str.toLowerCase();
		//System.out.println(orgStr + str);
		char ch = ' ';
		
		for(int index = 0; index < str.length() ; index++) {
			ch = str.charAt(index);
			switch(ch) {
				case 'a':
					countVowel += 1;
					break;
					
				case 'e':
					countVowel += 1;
					break;
				
				case 'i':
					countVowel += 1;
					break;
					
				case 'o':
					countVowel += 1;
					break;
					
				case 'u':
					countVowel += 1;
					break;
					
				default:
					break;
			
			}
			if(countVowel > 0)
				return ch;
		}
		return firstVowel;
		
	}
	
	void printCountOfEachVowelInStr(String str){
		//char firstVowel = ' ';
		int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
		//String orgStr = str;
		//str = str.toLowerCase();
		//System.out.println(orgStr + str);
		char ch = ' ';
		
		for(int index = 0; index < str.length() ; index++) {
			ch = str.charAt(index);
			switch(ch) {
				case 'a':
					counta += 1;
					break;
					
				case 'e':
					counte += 1;
					break;
				
				case 'i':
					counti += 1;
					break;
					
				case 'o':
					counto += 1;
					break;
					
				case 'u':
					countu += 1;
					break;
					
				default:
					break;
			
			}
		}
		if(counta > 0) {
			System.out.println("Occurnece of a in given String --> " + counta);
		}
		if(counte > 0) {
			System.out.println("Occurnece of e in given String --> " + counte);
		}
		if(counti> 0) {
			System.out.println("Occurnece of i in given String --> " + counti);
		}
		if(counto > 0) {
			System.out.println("Occurnece of o in given String --> " + counto);
		}
		if(countu > 0) {
			System.out.println("Occurnece of u in given String --> " + countu);
		}
		
	}
	
	void printCountOfEachVowelInEachEleOfStrArr(String[] str) {
		for(int index = 0 ; index < str.length ; index++) {
			System.out.println("Vowel count in Element " + index + " of Input Array \"" + str[index] + "\" :");
			printCountOfEachVowelInStr(str[index]);
		}
	}
	
	

}

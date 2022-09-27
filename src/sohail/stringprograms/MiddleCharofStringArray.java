//Write a method to return middle character of each elements from given array.
//input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
//output : Mahesh -> h
//              Avni -> v
//              Puja -> u
//              Harshal -> s
//              Aditty -> i
//              Rahul -> h

package sohail.stringprograms;

import sohail.array.MiddleCharacterOfMaxLengtheString;

public class MiddleCharofStringArray {

	char getMiddleCharacter(String max) {
		int charIndex = max.length() / 2;
		if (max.length() % 2 == 0) {
			charIndex = charIndex - 1;
		}
		return max.toCharArray()[charIndex];
	}
	public static void main(String[] args) {

		String [] arrayInput= {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		MiddleCharofStringArray middlechar=new MiddleCharofStringArray();
		for(int index=0;index<arrayInput.length;index++) {
			char result= middlechar.getMiddleCharacter(arrayInput[index]);
			System.out.println(arrayInput[index] + " -> " + result);
		}

	}

}
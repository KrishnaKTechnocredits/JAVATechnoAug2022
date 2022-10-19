package shubhamG.Assignment31to40;

import java.util.LinkedHashSet;

/*
Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]

Set<Character> getUniqueCharacter(String name){

}
*/
public class Assignment39SetProg3 {
	LinkedHashSet<Character> getUniqueCharacter(String name) {
		LinkedHashSet<Character> uniqueChar = new LinkedHashSet<Character>();
		for (int i=0;i<name.length();i++) {
			Character ch =name.charAt(i);
			uniqueChar.add(ch);
			
		}
		return uniqueChar;
	}

	public static void main(String[] args) {
		Assignment39SetProg3 uniqueCharacter = new Assignment39SetProg3();

		String str = "technocredits";
		System.out.println("Input String is : " + str);
		LinkedHashSet<Character> output = uniqueCharacter.getUniqueCharacter(str);
		System.out.println("\nUnique Characters from given string are: \n" + output);
	}

}

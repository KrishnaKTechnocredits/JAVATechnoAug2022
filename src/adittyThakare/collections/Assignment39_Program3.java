/*Assignment 39 : 15th Oct'2022
Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]

Set<Character> getUniqueCharacter(String name){

}*/
package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment39_Program3 {
	
	Set<Character> getUniqueCharactersFromName(String name){
		char[] charArr = name.toCharArray();
		Set<Character> outputSet = new LinkedHashSet<>();
		for(char ch:charArr) {
			outputSet.add(ch);
		}
		return outputSet;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment39_Program3 assignment39_Program3 = new Assignment39_Program3();
		String input = "technocredits";
		System.out.println("Input String: "+input);
		System.out.println("Unique Characters: "+assignment39_Program3.getUniqueCharactersFromName(input));
	}

}

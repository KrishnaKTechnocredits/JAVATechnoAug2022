/*
 * Assignment 39
 * Program 3 : Write a program to return unique characters from given name.
input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]
 */
package harshalRane.Assignments.assignment39;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharactersFromName {
	Set<Character> getUniqueCharacters(String name){
		char[] ch = name.toCharArray();
		Set<Character> setOfCharacters = new LinkedHashSet<Character>();
		for(char ch1 : ch) {
			setOfCharacters.add(ch1);
		}
		return setOfCharacters;
	}
	
	public static void main(String[] args) {
		UniqueCharactersFromName uniqueCharactersFromName = new UniqueCharactersFromName();
		String name = "technocredits";
		System.out.println("------Unique characters from name using LinkedHashSet------");
		System.out.println("Input: "+ name);
		System.out.println("Output: "+uniqueCharactersFromName.getUniqueCharacters(name));
	}
}

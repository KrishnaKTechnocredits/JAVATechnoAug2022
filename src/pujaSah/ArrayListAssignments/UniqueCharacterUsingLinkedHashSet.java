/*
Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]
*/

package pujaSah.ArrayListAssignments;

import java.util.LinkedHashSet;

class UniqueCharacterUsingLinkedHashSet {

	// Method to return unique characters from given name
	LinkedHashSet<Character> getUniqueCharacterFromString(String str) {
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> setOfChars = new LinkedHashSet<Character>();
		System.out.println("Original String: " + str);

		for (char uniqueChars : ch) {
			setOfChars.add(uniqueChars);
		}
		return setOfChars;
	}

	public static void main(String[] args) {
		String str = "technocredits";
		System.out.println("List of unique characters in string " + str + " are: "
				+ new UniqueCharacterUsingLinkedHashSet().getUniqueCharacterFromString(str));
	}
}
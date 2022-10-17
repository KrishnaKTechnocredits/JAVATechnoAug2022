/*
 Program 3 : Write a program to return unique characters from given name.
input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]
 */

package swapnilMaheshwari.Collection.SetPrograms.Assignment39;

import java.util.LinkedHashSet;

public class UniqueCharacters {
	LinkedHashSet<Character> listOfCharacter = new LinkedHashSet<Character>();

	LinkedHashSet<Character> getUniqueChacters(String strInput) {
		for (int index = 0; index < strInput.length(); index++) {
			char ch = strInput.charAt(index);
			listOfCharacter.add(ch);
		}
		return listOfCharacter;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		System.out.println("Input :" + input);
		LinkedHashSet<Character> characterList = new LinkedHashSet<Character>();
		UniqueCharacters uniqueCharacters = new UniqueCharacters();
		characterList = uniqueCharacters.getUniqueChacters(input);
		System.out.println("Unique Character list :" + characterList);
	}
}

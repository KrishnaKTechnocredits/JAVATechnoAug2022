/*Program 3 : Write a program to return unique characters from given name.
input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]
Set<Character> getUniqueCharacter(String name){
}*/
package ankitaBarwad;

import java.util.LinkedHashSet;
import java.util.Set;

public class A39_UniqueCharactersFromName {

	Set<Character> getUniqueCharacter(String name){
		char[] chArr = name.toCharArray();
		Set<Character> setChar = new LinkedHashSet<Character>();
		System.out.println(name);
		for(Character ch : chArr) {
			setChar.add(ch);
		}
		return setChar;
	}

	public static void main(String[] args) {
		System.out.println("Program 3 : Write a program to return unique characters from given name");
		String name = "technocredits";
		Set<Character> newSetChar = new A39_UniqueCharactersFromName().getUniqueCharacter(name);
		System.out.println(newSetChar);
	}
}

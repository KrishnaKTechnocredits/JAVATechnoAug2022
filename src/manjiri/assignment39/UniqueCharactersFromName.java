/*Write a program to return unique characters from given name.
input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]
Set<Character> getUniqueCharacter(String name){
}*/

package manjiri.assignment39;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersFromName {
	
	Set<Character> getUniqueCharacter(String name){
		System.out.println(name);
		System.out.println("-------------------------");
		
		char[] chArr = name.toCharArray();
		Set<Character> setChar = new HashSet<Character>();
		for(Character ch : chArr) {
			setChar.add(ch);
		}
		return setChar;
	}
	
	public static void main(String[] args) {
		String name = "technocredits";
		Set<Character> newSetChar = new UniqueCharactersFromName().getUniqueCharacter(name);
		System.out.println(newSetChar);
	}
}

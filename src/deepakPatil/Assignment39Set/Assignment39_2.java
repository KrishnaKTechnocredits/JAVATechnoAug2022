/*Assignment 39 : 15th Oct'2022
 Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]
 */

package deepakPatil.Assignment39Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment39_2 {
	
	Set<Character> getUniqueCharFromString(String name){
		Set<Character> uniqChar= new LinkedHashSet<Character>();
		
		for(int index=0; index<name.length();index++) {
			uniqChar.add(name.charAt(index));			
		}
		return uniqChar;
	}
	
	public static void main(String[] args) {
		String name="technocredits";
		System.out.println("Unique Character from from String "+name+" as below:");
		System.out.println(new Assignment39_2().getUniqueCharFromString(name));
		
	}
}

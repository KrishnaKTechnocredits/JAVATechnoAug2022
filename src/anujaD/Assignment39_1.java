/*Assignment 39 : 15th Oct'2022
Program 1: Print all duplicate names from given Array.
input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 
Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]
 */

/*Assignment 39 : 15th Oct'2022
 Program 3 : Write a program to return unique characters from given name.
input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]
 */
/*Assignment 39 : 15th Oct'2022
Program 4 : Remove duplicates from array containing numbers [insertion order].
input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]
*/
/*Assignment 39 : 15th Oct'2022 
Program 5 : Remove duplicates from array containing numbers [natural order].
input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]
 */

package anujaD;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class Assignment39_1 {
	
	void printAllduplicateNames(String[] nameSet){
		
		Set <String> input =new  HashSet<String>();
		Set <String> output = new HashSet<String>();
		
		for(String name: nameSet) {
			if(!input.add(name)) {
				output.add(name);
			}
		}
		System.out.println(output);	
	}
	
	void printUniqueNames(String[]names) {
		
		HashSet<String> nameSet= new HashSet<String>(Arrays.asList(names));
		System.out.println(nameSet);
	}
	
	Set<Character> getUniqueCharFromString(String name){
		Set<Character> uniqChar= new LinkedHashSet<Character>();
		
		for(int index=0; index<name.length();index++) {
			uniqChar.add(name.charAt(index));			
		}
		return uniqChar;
	}
Set<Integer> removeDuplicatesFromArray(Integer[]nums){
		
		Set<Integer>updatedSet=new LinkedHashSet<Integer>(Arrays.asList(nums));
		return updatedSet;
	}
	
	public static void main(String[] args) {
		Assignment39_1 assignment39_1 = new Assignment39_1();
		
		String[] names1= {"Maulik", "Umesh", "Saroj", "Umesh"};
		System.out.println("Given name set is:");
		System.out.println(Arrays.toString(names1));
		System.out.println("Duplicate names from given name is: ");
		assignment39_1.printAllduplicateNames(names1);
		System.out.println("----------------------------------------------");
		
		String[] names2={"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		System.out.println("Given name set is:");
		System.out.println(Arrays.toString(names2));
		System.out.println("Unique names from given name is: ");
		assignment39_1.printUniqueNames(names2);
		System.out.println("----------------------------------------------");
		
		String name="technocredits";
		System.out.println("Unique Character from from String "+name+" as below:");
		System.out.println(new Assignment39_1().getUniqueCharFromString(name));
		
		Integer[]nums={10,10,13,12,12,10,55,66,55,11};
		System.out.println("Given number array is:");
		System.out.println(Arrays.toString(nums));
		System.out.println("Set after removing duplicates: ");
		System.out.println(new Assignment39_1().removeDuplicatesFromArray(nums));
	
	}
	

}

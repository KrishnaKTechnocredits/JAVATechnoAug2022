/*Assignment 39 : 15th Oct'2022

Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 

Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]
 */

package deepakPatil.Assignment39Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
	}

}

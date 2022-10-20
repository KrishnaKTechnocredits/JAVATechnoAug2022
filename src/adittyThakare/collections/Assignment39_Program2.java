/*Assignment 39 : 15th Oct'2022
Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]*/
package adittyThakare.collections;

import java.util.Arrays;
import java.util.HashSet;

public class Assignment39_Program2 {
	
	void returnUniqueNamesFromArray(String[] arr) {
		
		HashSet<String> set1 = new HashSet<>();
		System.out.println("\nUnique Names: ");
		for(String name:arr) {
			boolean stringFlag = set1.add(name);
			if(stringFlag) {
				System.out.println(name);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment39_Program2 assignment39_Program2 = new Assignment39_Program2();
		System.out.println("Return unique names from given Array!");
		String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		System.out.println("\nInput Array: "+Arrays.toString(arr));
		assignment39_Program2.returnUniqueNamesFromArray(arr);
	}

}

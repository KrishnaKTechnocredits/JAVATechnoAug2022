/*Assignment 39 : 15th Oct'2022

Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] */
package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Assignment39_Program1 {
	
	void printDuplicateNamesFromArray(String[] arr) {
		
		HashSet<String> inputHash = new HashSet<>();
		System.out.println("\nDuplicate names: ");
		for(String name:arr) {
			boolean additionFlag = inputHash.add(name);
			if(!additionFlag) {
				System.out.println(name);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment39_Program1 assignment39_Program1 = new Assignment39_Program1();
		System.out.println("Print all duplicate names from given Array!");
		String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh"};
		System.out.println("\nInput Array: "+Arrays.toString(arr));
		assignment39_Program1.printDuplicateNamesFromArray(arr);
		
	}
	}

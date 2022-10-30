//Assignment 39 : 15th Oct'2022

package komalShrivastava.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetGames {

	//method to return all duplicate names from given Array
	
	HashSet<String> getAllDuplicateNames(String[] input){
		System.out.println("Input : " + Arrays.toString(input));
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		for(String name : input) {
			if(!hs1.add(name))
				hs2.add(name);
		}
		return hs2;
	}
	
	//method to return unique names from given Array(maintains insertion order)
	
	LinkedHashSet<String> getAllUniqueNames(String[] input){
		System.out.println("Input : " + Arrays.toString(input));
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>(Arrays.asList(input));
		return hs1;
	}
	
	//method to return unique characters from given name
	
	LinkedHashSet<Character> getUniqueCharacters(String input){
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		System.out.println("Input : " + input);
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			lhs.add(ch);
		}
		return lhs;
	}
	
	//method to remove duplicates from array containing numbers [insertion order]
	
	LinkedHashSet<Integer> removeDuplicateNumbers(int[] input){
		System.out.println("Input : " + Arrays.toString(input));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for(int num : input) {
			lhs.add(num);
		}
		return lhs;
	}
	
	//method to remove duplicates from array containing numbers [natural order]
	
	TreeSet<Integer> removeDuplicatesInsertionOrder(int[] input){
		System.out.println("Input : " + Arrays.toString(input));
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int num : input) {
			ts.add(num);
		}
		return ts;
	}
	
	//method to return duplicates from array containing numbers using Set
	
	LinkedHashSet<Integer> getduplicateNumbers(int[] input){
		System.out.println("Input : " + Arrays.toString(input));
		LinkedHashSet<Integer> hs1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> hs2 = new LinkedHashSet<Integer>();
		for(int num : input) {
			if(!hs1.add(num))
				hs2.add(num);
		}
		return hs2;
	}
	
	//method to return duplicates from array containing numbers using List
	
	ArrayList<Integer> getDuplicateNumbersUsingList(int[] input){
		System.out.println("Input : " + Arrays.toString(input));
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int num : input) {
			if(!al1.contains(num))
				al1.add(num);
			else if(!al2.contains(num))
				al2.add(num);
		}
		return al2;
	}
	
	public static void main(String[] args) {
		HashSetGames hashSetGames = new HashSetGames();
		
		//Program 1: Print all duplicate names from given Array
		System.out.println("Program 1: Print all duplicate names from given Array");
		String[] input1 = {"Maulik", "Umesh", "Saroj", "Umesh"};
		HashSet<String> duplicateNames = hashSetGames.getAllDuplicateNames(input1);
		System.out.println("Output : " + duplicateNames + "\n");
		
		//Program 2 : Return unique names from given Array
		System.out.println("Program 2: Return unique names from given Array");
		String[] input2 = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		LinkedHashSet<String> uniqueNames = hashSetGames.getAllUniqueNames(input2);
		System.out.println("Output : " + uniqueNames + "\n");
		
		//Program 3 : Write a program to return unique characters from given name
		System.out.println("Program 3 : Write a program to return unique characters from given name");
		String input3 = "technocredits";
		LinkedHashSet<Character> uniqueCharacters = hashSetGames.getUniqueCharacters(input3);
		System.out.println("Output : " + uniqueCharacters + "\n");
		
		//Program 4 : Remove duplicates from array containing numbers [insertion order].
		System.out.println("Program 4 : Remove duplicates from array containing numbers [insertion order].");
		int[] input4 = {10,10,13,12,12,10,55,66,55,11};
		LinkedHashSet<Integer> updatedNumbers = hashSetGames.removeDuplicateNumbers(input4);
		System.out.println("Output : " + updatedNumbers + "\n");
		
		//Program 5 : Remove duplicates from array containing numbers [natural order]
		System.out.println("Program 5 : Remove duplicates from array containing numbers [natural order]");
		TreeSet<Integer> updatedNumbers2 = hashSetGames.removeDuplicatesInsertionOrder(input4);
		System.out.println("Output : " + updatedNumbers2 + "\n");
		
		//Program 6 : Return duplicates from array containing numbers using Set.
		System.out.println("Program 6 : Remove duplicates from array containing numbers using Set.");
		int[] input6 = {10,10,13,12,12,10,55,66,55,11,11};
		LinkedHashSet<Integer> duplicateNumbers = hashSetGames.getduplicateNumbers(input6);
		System.out.println("Output : " + duplicateNumbers + "\n");
		
		// Program 7 : Remove duplicates from array containing numbers using List
		System.out.println("Program 7 : Return duplicates from array containing numbers using List.");
		ArrayList<Integer> duplicateNumbers2 = hashSetGames.getDuplicateNumbersUsingList(input6);
		System.out.println("Output : " + duplicateNumbers2 + "\n");
	}
}
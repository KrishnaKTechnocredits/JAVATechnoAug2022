/*Assignment 39 : 15th Oct'2022

Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 

Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]

Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]

Set<Character> getUniqueCharacter(String name){

}

Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]

Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]

Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]

Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/
package shrutiArora;
import java.util.*;
public class Assignment39 {
	//program1:Print all duplicate names from given Array.
 
 void duplicateNames(String[] input) {
		for(int index=0;index<input.length;index++) {
			int count=1;
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index]==input[innerIndex]) {
					input[innerIndex] = "";
					count++;
				}
			}
			if(count>1) {
				System.out.println(input[index]);
			}
		}
	}
	//program2: Return unique names from given Array.
	HashSet<String> getUniqueNamesFromArray(String[] input) {
			HashSet<String> setOfNames = new HashSet<String>();
			for(String name : input) {
				setOfNames.add(name);
			}
			return setOfNames;
	}
	//program3: Write a program to return unique characters from given name.

	Set<Character> getUniqueCharacters(String name){
		char[] ch = name.toCharArray();
		Set<Character> setOfCharacters = new LinkedHashSet<Character>();
		for(char ch1 : ch) {
			setOfCharacters.add(ch1);
		}
		return setOfCharacters;
	}
	//program4: Remove duplicates from array containing numbers [insertion order].
	Set<Integer> removeDuplicateNumbers(int[] input){
		Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		for(int num : input) {
			setOfNumbers.add(num);
		}
		return setOfNumbers;
	}
	//program5: Remove duplicates from array containing numbers [natural order].

	Set<Integer> removeDuplicateNumbersInAsc(int[] input) {
		Set<Integer> setOfNumbers = new TreeSet<Integer>();
		for (int num : input) {
			setOfNumbers.add(num);
		}
		return setOfNumbers;
	}
	//program6: Remove duplicates from array containing numbers using Set.
	Set<Integer> removeDuplicateNumbersUsingSet(int[] input) {
		Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		Set<Integer> output = new LinkedHashSet<Integer>();

		boolean flag = true;
		for (int num : input) {
			flag = setOfNumbers.add(num);
			if (!flag) {
				output.add(num);
			}
		}
		return output;
	}
	//program7: Remove duplicates from array containing numbers using List.
	ArrayList<Integer> removeDuplicateNumbersUsingList(Integer[] input) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for (int num : listOfNumbers) {
			if (listOfNumbers.indexOf(num)!=listOfNumbers.lastIndexOf(num) && !output.contains(num)) {
				output.add(num);
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment39 a39 = new Assignment39();
		System.out.println("-----------------------------------------------Program1------------------------------------------");
		String[] input = {"Maulik", "Umesh", "Saroj", "Umesh"};
		System.out.println(Arrays.toString(input));
		a39.duplicateNames(input);
		System.out.println("------------------------------------------------------Program2----------------------------------------");
		String[] input1 = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		System.out.println(Arrays.toString(input1));
		System.out.println("\n---------Unique names using HashSet---------");
		System.out.println(a39.getUniqueNamesFromArray(input1));
		String name = "technocredits";
		System.out.println("Program-3------Unique characters from name using LinkedHashSet------");
		System.out.println("Input: "+ name);
		System.out.println("Output: "+a39.getUniqueCharacters(name));
		int[] input2 = {10,10,13,12,12,10,55,66,55,11};
		System.out.println("Program-4---Remove Duplicate Numbers using LinkedHashSet Insertion Order)-----");
		System.out.println(Arrays.toString(input2));
		System.out.println(a39.removeDuplicateNumbers(input2));
		int[] input3 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Program-5---Remove Duplicate Numbers using TreeSet (Asc Order)-----");
		System.out.println(Arrays.toString(input3));
		System.out.println(a39.removeDuplicateNumbers(input3));
		int[] input4 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
	    System.out.println(" Program-6---Remove Duplicate Numbers using Set -----");
		System.out.println(Arrays.toString(input4));
		System.out.println(a39.removeDuplicateNumbers(input4));
		Integer[] input5 = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Program-7---Remove Duplicate Numbers using List -----");
		System.out.println(Arrays.toString(input5));
		System.out.println(a39.removeDuplicateNumbersUsingList(input5));
	}
}
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
output : [10,12,55,11]
*/

package sanket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAssignment39 {

	// Program 1: Print all duplicate names from given Array.
	HashSet<String> getDuplicateNames(String[] arr) {
		HashSet<String> setOfName = new HashSet<String>();
		HashSet<String> setOfName1 = new HashSet<String>();
		for (String name : arr) {
			if (!setOfName.add(name)) {
				setOfName1.add(name);
			}
		}
		return setOfName1;
	}

	// Program 2 : Return unique names from given Array.
	LinkedHashSet<String> getUniqueNames(String[] arr) {
		LinkedHashSet<String> setOfName = new LinkedHashSet<String>(Arrays.asList(arr));
		return setOfName;
	}

	// Program 3 : Write a program to return unique characters from given name.
	Set<Character> getUniqueCharacters(String name) {
		char[] chars = name.toCharArray();
		ArrayList<Character> listOfCharacter = new ArrayList<Character>();
		for (char ch : chars) {
			listOfCharacter.add(ch);
		}
		LinkedHashSet<Character> setOfCharacters = new LinkedHashSet<Character>(listOfCharacter);
		return setOfCharacters;
	}

	// Program 4 : Remove duplicates from array containing numbers [insertion
	// order].
	Set<Integer> getUniqueNumber(Integer[] number) {
		LinkedHashSet<Integer> uniqueNum = new LinkedHashSet<Integer>();
		for (int index : number) {
			uniqueNum.add(index);
		}
		return uniqueNum;
	}

	// Program 5 : Remove duplicates from array containing numbers [natural order].
	Set<Integer> getUniqueNumbersascending(Integer[] number) {
		TreeSet<Integer> uniqueNum = new TreeSet<Integer>();
		for (int index : number) {
			uniqueNum.add(index);
		}
		return uniqueNum;
	}

	// Program 6 : Remove duplicates from array containing numbers using Set.
	Set<Integer> getDuplicateNumbersSet(Integer[] numbers) {
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> setOfNumbers1 = new LinkedHashSet<Integer>();
		for (int index : numbers) {
			if (!setOfNumbers.add(index)) {
				setOfNumbers1.add(index);
			}
		}
		return setOfNumbers1;
	}

	// Program 7 : Remove duplicates from array containing numbers using List.
	List<Integer> getUniqueNumberList(Integer[] numbers) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(numbers));
		ArrayList<Integer> listOfNumbers2 = new ArrayList<Integer>();
		for (int numb : listOfNumbers) {
			if ((listOfNumbers.indexOf(numb) != listOfNumbers.lastIndexOf(numb)) && !listOfNumbers2.contains(numb))
				listOfNumbers2.add(numb);
		}
		return listOfNumbers2;
	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Umesh", "Saroj", "Umesh" };
		System.out.println("Program 1: Print all duplicate names from given Array.");
		System.out.println("The input array is " + Arrays.toString(input));
		System.out.println("The output array is " + new HashSetAssignment39().getDuplicateNames(input));

		System.out.println("\n");

		String[] input2 = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		System.out.println("Program 2: Return unique names from given Array.");
		System.out.println("The input array is " + Arrays.toString(input2));
		System.out.println("The output array is " + new HashSetAssignment39().getUniqueNames(input2));

		System.out.println("\n");

		String input3 = "technocredits";
		System.out.println("Program 3: Write a program to return unique characters from given name.");
		System.out.println("The input string is --> " + input3);
		System.out.println("The output array is " + new HashSetAssignment39().getUniqueCharacters(input3));

		System.out.println("\n");

		Integer[] input4 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Program 4 : Remove duplicates from array containing numbers [insertion order].");
		System.out.println("The input string is --> " + Arrays.toString(input4));
		System.out.println("The output array is " + new HashSetAssignment39().getUniqueNumber(input4));

		System.out.println("\n");

		Integer[] input5 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Program 5 : Remove duplicates from array containing numbers [natural order].");
		System.out.println("The input string is --> " + Arrays.toString(input5));
		System.out.println("The output array is " + new HashSetAssignment39().getUniqueNumbersascending(input5));

		System.out.println("\n");

		Integer[] input6 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Program 6 : Remove duplicates from array containing numbers using Set.");
		System.out.println("The input string is --> " + Arrays.toString(input5));
		System.out.println("The output array is " + new HashSetAssignment39().getDuplicateNumbersSet(input6));

		System.out.println("\n");

		Integer[] input7 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Program 7 : Remove duplicates from array containing numbers using List.");
		System.out.println("The input string is --> " + Arrays.toString(input5));
		System.out.println("The output array is " + new HashSetAssignment39().getUniqueNumberList(input7));
	}
}

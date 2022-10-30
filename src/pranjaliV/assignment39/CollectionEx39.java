/*
 Assignment 39 : 15th Oct'2022

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

package pranjaliV.assignment39;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class CollectionEx39 {
	
	void printDuplicateName(ArrayList <String> listOfNames) {
		LinkedHashSet <String> output = new LinkedHashSet <String> ();	//output set which maintains insertion order
		for(String name : listOfNames) {//traverse through list
			boolean flag = true;
			flag = output.add(name); //returns 
			if(!flag) {
				System.out.println(name);
			}
		}
	}
	
	LinkedHashSet <String> getUniqueNames(ArrayList<String> listOfNames) {
		LinkedHashSet <String> setOfNames = new LinkedHashSet <String> ();	//output set which maintains insertion order
		for(String name : listOfNames) {
			setOfNames.add(name);
		}
		return setOfNames;
	}
	
	LinkedHashSet <Character> getUniqueChars(String name) {
		char[] chars = name.toCharArray();
		LinkedHashSet <Character> setOfChars = new LinkedHashSet <Character> ();
		for(char letter: chars) {
			setOfChars.add(letter);
		}
		return setOfChars;
	}
	
	LinkedHashSet <Integer> removeDuplicateNum(int[] numArray) {
		LinkedHashSet <Integer> setOfNum = new LinkedHashSet<Integer>();
		for(int num : numArray) {
			setOfNum.add(num);
		}
		return setOfNum;
	}
	
	TreeSet<Integer> removeDupNumInsertionOrder(int[] numArray) {
		TreeSet<Integer> setOfNums = new TreeSet<Integer>();
		for(int num : numArray) {
			setOfNums.add(num);
		}
		return setOfNums;
	}
	
	LinkedHashSet<Integer> getDuplicateNumSet(int[] numArray) {
		LinkedHashSet<Integer> uniqueNum= new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> duplicateNum= new LinkedHashSet<Integer>();
		for(int num : numArray) {
			boolean flag = true; 
			flag = uniqueNum.add(num);
			if(!flag) {
				duplicateNum.add(num);
			}
		}
		return duplicateNum;
	}
	
	ArrayList<Integer>  getDuplicateNumList(Integer[] numArray){
	 	ArrayList<Integer> input = new ArrayList<Integer> (Arrays.asList(numArray));
	 	ArrayList<Integer> output = new ArrayList<Integer> ();
	 	
	 	for(int num : numArray){
	 	// if 1st and last index of input list not same (i.e there is duplicate) and that num is not there in ouput list then add in output list
	 		if((input.indexOf(num)!= input.lastIndexOf(num)) && output.contains(num)==false){ 
	 			output.add(num);
	 		}
	 	}	 	
	 	return output;
	 }

	public static void main(String[] args) {
		CollectionEx39 ex39 = new CollectionEx39();
		
		System.out.println("-------------------------------------");
		System.out.println("Program 1: Print all duplicate names from given Array.");
		String[] input1 = {"Maulik", "Umesh", "Saroj", "Umesh"};
		ArrayList <String> listOfNames = new ArrayList <String> (Arrays.asList(input1));// list of names	
		System.out.println("Input : " + listOfNames );
		System.out.print("Output : ");
		ex39.printDuplicateName(listOfNames);
		System.out.println("");
		
		System.out.println("-------------------------------------");
		System.out.println("Program 2 : Return unique names from given Array.");
		String[] input2 = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		ArrayList<String> listOfNames2 = new ArrayList<String> (Arrays.asList(input2));
		System.out.println("Input : " + listOfNames2);
		System.out.println("Output : " + ex39.getUniqueNames(listOfNames2));
		System.out.println("");
		
		System.out.println("-------------------------------------");
		System.out.println("Program 3 : Write a program to return unique characters from given name.");
		String input3 = "technocredits";
		System.out.println("Input : " + input3);
		System.out.println("Output : " + ex39.getUniqueChars(input3));
		System.out.println("");
		
		System.out.println("-------------------------------------");
		System.out.println("Program 4 : Remove duplicates from array containing numbers [insertion order].");
		int[] input4 = {10,10,13,12,12,10,55,66,55,11};
		System.out.println("Input : " + Arrays.toString(input4));
		System.out.println("Output : " + ex39.removeDuplicateNum(input4));
		System.out.println("");
		
		System.out.println("-------------------------------------");
		System.out.println("Program 5 : Remove duplicates from array containing numbers [natural order].");
		int[] input5 = {10,10,13,12,12,10,55,66,55,11};
		System.out.println("Input : " + Arrays.toString(input5));
		System.out.println("Output : " + ex39.removeDupNumInsertionOrder(input5));
		System.out.println("");
		
		System.out.println("-------------------------------------");
		System.out.println("Program 6 : Return duplicates from array containing numbers using Set.");
		int[] input6 = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Input : " + Arrays.toString(input6));
		System.out.println("Output : " + ex39.getDuplicateNumSet(input6));
		System.out.println("");
		
		
		System.out.println("-------------------------------------");
		System.out.println("Program 7 : Remove duplicates from array containing numbers using List.");
		Integer[] input7 = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Input : " + Arrays.toString(input7));
		System.out.println("Output : " + ex39.getDuplicateNumList(input7));
		//;
		System.out.println("");
		
	}

}

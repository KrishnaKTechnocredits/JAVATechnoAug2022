package sohail.stringprograms;

import java.util.Arrays;

//Assignment-27 : 23rd Sep'2022
//1. Write a program to print unique character of each name in given string array.
//
//String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
//
//Name is Maulik :
//M
//a
//u
//l
//i
//k

public class UniqueCharacterInString {
	void printUniqueCharFromArray(String[] input) {

		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = 0; innerIndex < input[index].length(); innerIndex++) {
				char ch = input[index].charAt(innerIndex);
				int index1 = input[index].indexOf(ch);
				int index2 = input[index].lastIndexOf(ch);
				if (index1 == index2) {
					System.out.println(ch);
				}
			}

		}
	}

	void printFirstUniqueCharFromArray(String[] input) {

		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = 0; innerIndex < input[index].length(); innerIndex++) {
				char ch = input[index].charAt(innerIndex);
				int index1 = input[index].indexOf(ch);
				int index2 = input[index].lastIndexOf(ch);
				if (index1 == index2) {
					System.out.println(ch);
					break;
				}
			}
			System.out.println("-----");
		}
	}

	public static void main(String[] args) {
		UniqueCharacterInString uniquecharinstring = new UniqueCharacterInString();
		String[] inputString = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		System.out.println("Given Array is: " + Arrays.toString(inputString));
		uniquecharinstring.printUniqueCharFromArray(inputString);
		String[] input1 = { "Maulik", "KananiK", "akanksha" };
		System.out.println(Arrays.toString(input1));
		System.out.println("First Unique Character From given array ");
		uniquecharinstring.printFirstUniqueCharFromArray(input1);

	}

}

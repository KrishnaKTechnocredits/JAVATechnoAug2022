package hardikBhatia.Assignments;

import java.util.Arrays;

public class Assignment33 {
	
	//Program 1: print duplicate numbers from given array.
	boolean checkDuplicateNumber(int number, int[] arrNumber) {
		int count = 0;
		for(int index = 0; index < arrNumber.length; index++) {
			if(number == arrNumber[index]){
				count++;
			}
		}
		if(count > 1) {
			return true;
		}
		return false;
	}
	void printDuplicateNumbersFromInput(int[] input) {
		for(int index = 0; index < input.length; index++) {
			 if(checkDuplicateNumber(input[index], input)) {
				System.out.println(input[index]); 
				 input[index] = 0;
			 }
		}
	}
	
	//Program 2 : print unique numbers from given array (having freq 1).
	void printUniqueNumbers(int[] input) {
		for(int index = 0; index < input.length; index++) {
			 if(!checkDuplicateNumber(input[index], input)) {
				System.out.println(input[index]); 
			 }
		}
	}
	
	//Program 3 : print missing numbers from given array from range 1 to 10.
	boolean checkNumberIsMissing(int number, int[] numbers) {
		for(int index = 0; index < numbers.length; index++) {
			if(number == numbers[index]) {
				return false;
			}
		}
		return true;
	}
	void printMissingNumberFromInput(int rangeStart, int rangeEnd, int[] input) {
		for(int index = rangeStart; index <= rangeEnd; index++){
			if(checkNumberIsMissing(index, input)) {
				System.out.println(index); 
			 }
		}
	}
	
	//program 4: print duplicate names from given array (do not consider case sensitivity).
	boolean checkDuplicateNames(String name, String[] names) {
		int count = 0;
		for(int index = 0; index < names.length; index++) {
			if(names[index].toLowerCase().equals(name.toLowerCase())) {
				count++;
			}
		}
		if(count > 1) {
			return true;
		}
		return false;
	}
	void printDuplicateNamesInput(String[] names) {
		for(int index = 0; index < names.length; index++) {
			if(checkDuplicateNames(names[index],names)) {
				System.out.println(names[index]);
				names[index] = "";
			}
		}
	}
	
	//program 5 : print unique names from given array.
	void printUniqueNamesInput(String[] names) {
		for(int index = 0; index < names.length; index++) {
			if(!checkDuplicateNames(names[index],names)) {
				System.out.println(names[index]);
			}
		}
	}
	
	//Program 6 : print unique numbers from given array (all content uniquely).
	void printContentUniqueNumbers(int[] numbers) {
		for(int index = 0; index < numbers.length; index++) {
			if(checkDuplicateNumber(numbers[index], numbers)) {
				numbers[index] = 0;
			}
			else {
				System.out.println(numbers[index]); 
			}
		}
	}
	
	//Program 7 : print each number with its frequency.
	int getCountFrequency(int number, int[] numbers) {
		int count = 0;
		for(int index = 0; index < numbers.length; index++) {
			if(number == numbers[index]) {
				count ++;
				numbers[index] = 0;
			}
		}
		return count;
	}
	void printNumberRepeateFrequency(int[] numbers) {
		for(int index = 0; index < numbers.length; index++) {
			if(numbers[index] != 0) {
				System.out.println(numbers[index] +" --> "+ getCountFrequency(numbers[index], numbers));
			}
		}
	}
	
	
	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		int[] numbers = {10,20,10,44,33,55,33};
		System.out.println("Input: "+ Arrays.toString(numbers));
		System.out.println("Output: ");
		assignment33.printDuplicateNumbersFromInput(numbers);
		System.out.println("-------------------------------------------------------");
		
		int[] numbers2 = {10,20,10,44,33,55,33};
		System.out.println("Input: "+ Arrays.toString(numbers2));
		System.out.println("Output: ");
		assignment33.printUniqueNumbers(numbers2);
		System.out.println("-------------------------------------------------------");
		
		int[] numbers3 = {1,3,9,5,6,10};
		System.out.println("Input: "+ Arrays.toString(numbers3));
		System.out.println("Output: ");
		assignment33.printMissingNumberFromInput(1,10,numbers3);
		System.out.println("-------------------------------------------------------");
		
		String[] names = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Input: "+ Arrays.toString(names));
		System.out.println("Output: ");
		assignment33.printDuplicateNamesInput(names);
		System.out.println("-------------------------------------------------------");
		
		String[] names1 = {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
		System.out.println("Input: "+ Arrays.toString(names1));
		System.out.println("Output: ");
		assignment33.printUniqueNamesInput(names1);
		System.out.println("-------------------------------------------------------");
		
		int[] numbers4 = {10,20,10,44,33,55,33};
		System.out.println("Input: "+ Arrays.toString(numbers4));
		System.out.println("Output: ");
		assignment33.printContentUniqueNumbers(numbers4);
		System.out.println("-------------------------------------------------------");
		
		int[] numbers5 = {10,11,11,10,5,6,5,6,5,5,4};
		System.out.println("Input: "+ Arrays.toString(numbers5));
		System.out.println("Output: ");
		assignment33.printNumberRepeateFrequency(numbers5);
		System.out.println("-------------------------------------------------------");
	}

}

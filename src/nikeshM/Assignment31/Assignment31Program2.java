package nikeshM.Assignment31;

import java.util.Arrays;
import java.util.Scanner;

//Program 2 :
//Write a method to print all pallindrome input from given array.
//
//input : {"radar","techhpet","madam","maulikkilum"};
//output : radar
//         madam

public class Assignment31Program2 {
		void checkpallindrome(String input) {
			String output = "";
			for(int index=input.length()-1;index>=0 ; index-- ) {
				output += input.charAt(index);
				
			}
			if(input.equals(output)) {
				System.out.println(output + " : is pallindrome");
			}
			else
				System.out.println(output + " : is not pallindrome");
		}	

		void getPellindromeArray(String []input) {
			for(int index = 0 ; index<input.length ; index++) {
				checkpallindrome(input[index]);
			}
		}
	public static void main(String[] args) {
		Assignment31Program2 p2 = new Assignment31Program2();
		String [] input = {"radar","techhpet","madam","maulikkilum"};
		System.out.println("input String " + Arrays.toString(input) + "\n");
		p2.getPellindromeArray(input);

	
}
}

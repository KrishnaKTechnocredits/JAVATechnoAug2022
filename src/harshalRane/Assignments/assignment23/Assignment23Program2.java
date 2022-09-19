/*
 * Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	
 */
package harshalRane.Assignments.assignment23;

public class Assignment23Program2 {
	
	boolean getWordWithDigit(String name) {
		int length = name.length();
		for(int index=0;index<length;index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) 
				return true;
		}
		return false;
	}
	
	void printWordsWithDigits(String input) {
		String[] arr = input.split(" ");
		System.out.println("Words having digits are:");
		for(int index = 0;index<arr.length;index++) {
			boolean flag = getWordWithDigit(arr[index]);
			if (flag) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment23Program2 p2 = new Assignment23Program2();
		String input = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("Input String: " +input);
		System.out.println("----------------------------");
		p2.printWordsWithDigits(input);
	}
}

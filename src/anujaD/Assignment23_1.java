/*Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

Program 2: Write a method to print all the words having atleast one digit.
String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	

*/


package anujaD;

public class Assignment23_1 {
	
	String getMaxLengthWord(String input) {
		String[] arr = input.split(" ");
		String maxLenWord = arr[0];

		for (int index = 1; index < arr.length; index++) {
			String word = arr[index];
			if (word.length() > maxLenWord.length()) {
				maxLenWord = arr[index];
			}
		}
		return maxLenWord;
	}

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
		Assignment23_1 p1 = new Assignment23_1();
		String input = "Good morning friends this is technocredits";
		System.out.println("Given String is: " + input);
		System.out.println("-------------------------");
		System.out.println("Max length word from given string is: \n" + p1.getMaxLengthWord(input));
		
		String input1 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("Input String: " +input1);
		System.out.println("----------------------------");
		p1.printWordsWithDigits(input1);
	}

}

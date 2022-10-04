/*Assignment - 23 : 16th Sep'2022

Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){
	
}

String[] arr = input.split(" ");*/
package asthaSrivastava.arrayBasics;

public class MaxLengthName {

	String getMaxLengthWord(String input) {
		String[] arr = input.split(" ");
		String maxLengthWord = " ";
		for (int index = 0; index < arr.length; index++) {
			if (maxLengthWord.length() < arr[index].length()) {
				maxLengthWord = arr[index];
			}
		}
		return maxLengthWord;
	}

	public static void main(String[] args) {
		MaxLengthName word = new MaxLengthName();

		String input = "Good morning friends this is technocredits";
		System.out.println("Max Length word is " + word.getMaxLengthWord(input));
	}

}

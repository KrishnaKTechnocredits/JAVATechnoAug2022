/*Assignment - 23 : 16th Sep'2022
Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits*/

package shivaniLikhia;

public class MaxLengthWordFromString {

	void getMaxLengthWordFromString(String input) {
		String[] arr = input.split(" ");
		int maxLength = arr[0].length();
		String maxLengthWord = "";
		char ch;
		for(int index=1;index<arr.length;index++) {
			int length = arr[index].length();
			if(maxLength<length) {
				maxLengthWord = arr[index];
			}
		}
		System.out.println("The word with maximum length from the given array is : " +maxLengthWord);
		if(maxLengthWord.length()%2==0) {
			ch = maxLengthWord.charAt(maxLengthWord.length()/2-1);
			System.out.println("The middle character from " +maxLengthWord+ " is : " +ch);
		}
		else {
			ch = maxLengthWord.charAt(maxLengthWord.length()/2);
			System.out.println("The middle character from " +maxLengthWord+ " is : " +ch);
		}
	}
	public static void main(String[] args) {
		new MaxLengthWordFromString().getMaxLengthWordFromString("Good morning friends this is technocredits");
	}
}

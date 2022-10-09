/*Assignment - 23 : 16th Sep'2022

Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){
	
}

String[] arr = input.split(" ");
*/

package pankajBhatt;

public class Assignment23_P1_16Sep2022 {
	
	String getMaxLengthWord(String input){
		String[] arr = input.split(" ");
		int length = 0;
		String maxString = null;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index].length() > length) {
				length = arr[index].length();
				maxString = arr[index];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		String input = "Good morning friends this is technocredits ";
		Assignment23_P1_16Sep2022 assignment23_P1_16Sep2022 = new Assignment23_P1_16Sep2022();
		String maxLengthString = assignment23_P1_16Sep2022.getMaxLengthWord(input);
		System.out.println(maxLengthString);
	}
}

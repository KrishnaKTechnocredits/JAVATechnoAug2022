//Assignment - 23 : 16th Sep'2022
//Program 1:
//Write a method to return maximum length word from given input.
//String input = "Good morning friends this is technocredits";
//output : technocredits
package sohail.stringprograms;
public class MaxWordOfString {
	String getMaxLengthWord(String inputString) {
		String[] output = inputString.split(" ");
		String max = "";
		for (int index = 0; index < output.length; index++) {
			if (output[index].length() >= max.length()) {
				max = output[index];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		MaxWordOfString maxwordofstring = new MaxWordOfString();
		String inputString = "Good morning friends this is technocredits";
		System.out.println("Input Sting is: "+inputString);
		String maxWord = maxwordofstring.getMaxLengthWord(inputString);
		System.out.println("Maximum length word is: "+maxWord);
	}
}


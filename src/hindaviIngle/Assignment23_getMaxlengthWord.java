/*
 * Assignment - 23 : 16th Sep'2022

Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){
	
}

String[] arr = input.split(" ");
 */
package hindaviIngle;

public class Assignment23_getMaxlengthWord {
	
	String getMaxLengthWord(String name) {
		String[] output = name.split(" ");
		String maxLengthWord = output[0];
		for (int index = 1; index < output.length; index++) {
			if (maxLengthWord.length() < output[index].length()) {
				maxLengthWord = output[index];
			}
		}
		return maxLengthWord;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment23_getMaxlengthWord assignment23=new Assignment23_getMaxlengthWord();
		String strInput = "Good morning friends this is technocredits";
		String StrOutput=assignment23.getMaxLengthWord(strInput);
		System.out.println("The MaxLength String word is : "+StrOutput);


	}

}

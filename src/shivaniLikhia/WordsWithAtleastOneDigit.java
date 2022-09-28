/*Program 2: Write a method to print all the words having atleast one digit.
String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	*/

package shivaniLikhia;

public class WordsWithAtleastOneDigit {
	
	boolean isWordsWithAtleastOneDigit(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
	
	void getWordsWithAtleastOneDigit(String input) {
		String[] arr = input.split(" ");
		String wordWithDigit = "";
		System.out.println("The words with atleast one digit in the given array are : ");
		for(int index=0;index<arr.length;index++) {
			boolean flag = isWordsWithAtleastOneDigit(arr[index]);
			if(flag) {
				wordWithDigit = arr[index];
				System.out.println(wordWithDigit);
			}
		}
	}
	public static void main(String[] args) {
		new WordsWithAtleastOneDigit().getWordsWithAtleastOneDigit("Good mor9ning fr3iends t2hi2s is technocredits");
	}

}

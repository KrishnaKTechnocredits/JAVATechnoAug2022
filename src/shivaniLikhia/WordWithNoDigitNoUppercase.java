/*Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is*/

package shivaniLikhia;

public class WordWithNoDigitNoUppercase {
	
	boolean isWordWithNoDigitNoUppercase(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch) || Character.isUpperCase(ch)){
				return false;
			}
		}
		return true;
	}
	
	void getWordWithNoDigitNoUppercase(String input) {
		String[] arr = input.split(" ");
		String word = ""; 
		System.out.println("The words with no upper case and no digit in the given array are : ");
		for(int index=0;index<arr.length;index++) {
			boolean flag = isWordWithNoDigitNoUppercase(arr[index]);
			if(flag) {
				word = arr[index];
				System.out.println(word);
			}
		}
	}
	
	public static void main(String[] args) {
		new WordWithNoDigitNoUppercase().getWordWithNoDigitNoUppercase("Good mor9ning techno fr3iends t2Hi2s is tEchnocredits");
	}

}

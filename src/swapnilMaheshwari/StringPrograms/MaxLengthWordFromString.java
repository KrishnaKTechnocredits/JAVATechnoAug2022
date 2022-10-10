/*
 Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	
         
Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs			 

Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is
 */

package swapnilMaheshwari.StringPrograms;

public class MaxLengthWordFromString {
	String getMaxLenWord(String input) {
		int maxLength = 0;
		String MaxLengthName = " ";
		String[] str = input.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (maxLength < str[i].length()) {
				maxLength = str[i].length();
				MaxLengthName = str[i];
			}
		}
		return MaxLengthName;
	}

	
	
	private boolean isDigitHavingWord(String word) {
		for(int i=0; i<word.length();i++) {
			char ch=word.charAt(i);
			if (Character.isDigit(ch))
				return true;
		}
		return false;
	}	
		void printWordHavingDigit(String input) {
			String[] str=input.split(" ");
			for (int index=0; index<str.length; index++) {
				 String singleWord=str[index];
				 boolean flag=isDigitHavingWord(singleWord);
				 if (flag)
					 System.out.println("Word having atleast one digits in the given String : " +input+ " - " +singleWord);
			}
		}
		
	int getMaxUpperCaseCount (String word) {
		int count=0;
		for (int i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			if ( Character.isUpperCase(ch)) {
				count++;
			}
		
	}
		return count;
	}
	String getMaxUpperCase (String input) {
		String word ="";
		int count=0;
		String[] str=input.split(" ");
		for (int index=0; index<str.length; index++) {
			int temp=getMaxUpperCaseCount(str[index]);
				if (count<temp) {
					count=temp;
					word=str[index];
				}
			}
			
		return word;
	}
	
	boolean isWordhavingNoWordAndDigits(String word) {
			for (int index=0; index<word.length(); index++) {
				char ch=word.charAt(index);
				if (Character.isUpperCase(ch) || Character.isDigit(ch))
				{
					return false;
				}
			}
			return true;
	}
	
	void printWordNotHavingDigitsandUpperCase(String input) {
		String [] str=input.split(" ");
		for (int i=0; i<str.length; i++) {
			boolean flag=isWordhavingNoWordAndDigits(str[i]);
			if(flag) {
				System.out.println("Word not having upper case and digits :" +str[i]);
			}
		}
	}
		public static void main(String[] args) {
			String input = "Good morning friends this is technocredits";
			System.out.println("Maximum length word in the given string --" + input + " -- Output is :"
					+ new MaxLengthWordFromString().getMaxLenWord(input));
			System.out.println();
			
			String input1 = "Good mor9ning fr3iends t2hi2s is technocredits";
			new MaxLengthWordFromString().printWordHavingDigit(input1);
			System.out.println();
			
			String input2 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
			System.out.println("Maximum character having upper case is "+new MaxLengthWordFromString().getMaxUpperCase(input2));
		
			String input3 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
			
			System.out.println();
			new MaxLengthWordFromString().printWordNotHavingDigitsandUpperCase(input3);
		}
	
}

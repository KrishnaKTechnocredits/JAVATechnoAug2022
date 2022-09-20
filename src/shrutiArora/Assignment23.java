/*Assignment - 23 : 16th Sep'2022

Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){
	
}

String[] arr = input.split(" ");

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
         is*/
package shrutiArora;
public class Assignment23 {
	String getMaxLengthWord(String str) {
	    System.out.println("Input: " + str);
		String[] array = str.split(" ");
		String maxName = " ";
		int  maxLength = 0 ;
		for(int index = 0 ; index<array.length;index++) {
			int length = array[index].length();
			if(maxLength < length) {
				maxLength = length ;
				maxName = array[index];
			}
		}
		System.out.println("Output: ");
		return maxName ;
	}
	void printAllWordHavingDigit(String input) {
		System.out.println("input: " + input);
		String[] arr = input.split(" ");
		for(int index = 0 ; index < arr.length ; index++) {
			boolean flag = isStringContainDigit(arr[index]);
			if(flag) {
				System.out.println(arr[index]);
			}
		}
	}
	boolean isStringContainDigit(String str) {
		for(int index = 0 ; index< str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
	String getWordHavingMaxUpperLetter(String input) {
	    System.out.println("Input: " + input) ;
		int maxUpperLetter = 0 ;
		String maxCapName = " ";
		String[] arr = input.split(" ");
		for(int index = 0 ; index < arr.length;index++) {
			int capCount = getCapCountInString(arr[index]);
			if(maxUpperLetter< capCount) {
				maxUpperLetter = capCount;
				maxCapName =  arr[index];
			}
		}
		System.out.println("Output: ");
		return maxCapName;
	}
	int getCapCountInString(String str) {
		int count = 0 ;
		for(int index = 0 ; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		
	   return count;
	}
	void printWordsHavingLowerCase(String str) {
		System.out.println("input: " + str);
		System.out.println("Output: ");
		String[] strArray = str.split(" ");
		for(int index = 0 ; index< strArray.length;index++) {
			boolean flag =  isNotHavingDigitOrCapital(strArray[index]);
			if(flag) {
				System.out.println(strArray[index]);
			}
		}
	}
	boolean isNotHavingDigitOrCapital(String name) {
		for(int index = 0 ;index< name.length(); index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)|| Character.isUpperCase(ch)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		System.out.println("--------------------------------------------------Program1--------------------------------------");
		String input = "Good morning friends this is technocredits";
		System.out.println(assignment23.getMaxLengthWord(input));
		System.out.println("--------------------------------------------------Program2--------------------------------------");
		String str = "Good mor9ning fr3iends t2hi2s is technocredits";
		assignment23.printAllWordHavingDigit(str);
		System.out.println("--------------------------------------------------Program3--------------------------------------");
		String name = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println(assignment23.getWordHavingMaxUpperLetter(name));
		System.out.println("--------------------------------------------------Program4--------------------------------------");
		String strName = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		assignment23.printWordsHavingLowerCase(strName);
	}
}
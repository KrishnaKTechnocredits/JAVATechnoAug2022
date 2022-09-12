/*
Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c*/


package smitaVetal;

public class ArrayTest {

	String getMaxLength(String[] arr) {
		int maxLength = arr[0].length();
		String maxLengthString = "";
		for (int index = 1; index < arr.length; index++) {
			if (arr[index].length() > maxLength) {
				maxLength = arr[index].length();
				maxLengthString = arr[index];
			}
		}
		return maxLengthString;
	}

	char getMiddleChar(String maxLengthString) {
		int index = 0;
		if (maxLengthString.length() % 2 == 0)
			index = (maxLengthString.length() / 2 - 1);
		else
			index = maxLengthString.length() / 2;
		return maxLengthString.charAt(index);

	}

	public static void main(String[] args) {
		ArrayTest array = new ArrayTest();
		String arr[] = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String maxLengthString = array.getMaxLength(arr);
		char middleChar = array.getMiddleChar(maxLengthString);
		System.out.println("Middle Character of maximum length element " + maxLengthString + " is " + middleChar);
		
	}
}

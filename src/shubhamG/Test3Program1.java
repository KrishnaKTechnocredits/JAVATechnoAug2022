package shubhamG;

/*
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c
*/

public class Test3Program1 {

	String getStringWithMaxLength(String[] arr) {
		String str = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (str.length() < arr[i].length()) {
				str = arr[i];
			}
		}
		return str;
	}

	char getMiddleCharacterOfString(String str) {
		char middle;
		if (str.length() % 2 == 0) {
			middle = str.charAt((str.length() / 2) - 1);
		} else
			middle = str.charAt(str.length() / 2);
		return middle;
	}

	public static void main(String[] args) {

		Test3Program1 test3 = new Test3Program1();

		String[] str1 = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String str2=test3.getStringWithMaxLength(str1);
		System.out.println("String with max length is - " + str2);
		System.out.println("Middle Character of " +str2+" is - " + test3.getMiddleCharacterOfString(str2));
	}
}

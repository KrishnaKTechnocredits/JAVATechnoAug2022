package shubhamG.Assignment21to30;

/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";*/

public class Assignment26 {

	// method to get frequency of each character in given string

	void getFrequencyOfEachCharacter(String str) {
		System.out.println("Given input String is : " + str);
		System.out.println("frequency of each character in the given string are - ");
		str = str.toLowerCase(); // Convert given string into lower case

		while (str.length() > 0) { // applying the loop till string length becomes 1
			char ch = str.charAt(0);
			String str1 = Character.toString(ch);
			int originallength = str.length();
			str = str.replace(str1, "");
			int newLength = str.length();
			System.out.println(str1 + " -> " + (originallength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment26 assignment = new Assignment26();
		assignment.getFrequencyOfEachCharacter("Technocreditst");
	}

}

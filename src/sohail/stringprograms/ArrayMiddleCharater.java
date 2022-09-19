//Write a method to return middle character of each elements from given array.
//input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
//output : Mahesh -> h
//              Avni -> v
//              Puja -> u
//              Harshal -> s
//              Aditty -> i
//              Rahul -> h

package sohail.stringprograms;

public class ArrayMiddleCharater {

	char getMiddleCharacterOfArray(String name) {
		int charIndex = name.length() / 2;
		if (name.length() % 2 == 0) {
			charIndex = charIndex - 1;
		}

		char result = name.toCharArray()[charIndex];
		return result;
	}

	public static void main(String[] args) {
		ArrayMiddleCharater arraymiddlecharacgter = new ArrayMiddleCharater();
		String[] str = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		for (int index = 0; index < str.length; index++) {
			System.out.println(str[index]);
			char midChar = arraymiddlecharacgter.getMiddleCharacterOfArray(str[index]);
			System.out.println(str[index] + " -> " + midChar);
		}
	}

}

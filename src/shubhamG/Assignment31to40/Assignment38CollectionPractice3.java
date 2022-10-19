package shubhamG.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;

/*
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']
*/

public class Assignment38CollectionPractice3 {

	ArrayList<Character> returnMiddleCharacter(ArrayList<String> list) {
		ArrayList<Character> ch = new ArrayList<Character>();
		for (String str : list) {
			if (str.length() > 6) {
				if (str.length() % 2 != 0) {

					ch.add(str.charAt((str.length() / 2)));
				} else {
					ch.add(str.charAt(str.length() / 2 - 1));
				}
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		Assignment38CollectionPractice3 middleCharacter = new Assignment38CollectionPractice3();

		String[] str = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(str));
		System.out.println("Given Input Array List is :\n" + listOfName);

		ArrayList<Character> output = middleCharacter.returnMiddleCharacter(listOfName);
		System.out.println("\nMiddle character from list with length of more then 6 char is :\n" + output);
	}

}

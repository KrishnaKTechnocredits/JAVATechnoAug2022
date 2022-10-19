/*
Program 3 : +
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']
*/
package gauravSahu;

import java.util.ArrayList;

public class Assignment38C {
	
	void getName(ArrayList<String> array) {
		ArrayList<Character> ch = new ArrayList<Character>();
		for (int i = 0; i < array.size(); i++) {
			String name = array.get(i);
			char ch1 = getMiddleChar(name);
			ch.add(ch1);
			for (int j = 0; j < ch.size(); j++) {
				char ch3 = ' ';
				char ch4 = ch.get(j);
				if (ch3 == ch4) {
					ch.remove(j);
				}
			}
		}
		System.out.println("Middle character of name more that 6 character : "+ ch);
	}

	char getMiddleChar(String name) {
		int middleIndex = 0;
		char ch1 = ' ';
		if (name.length() > 6) {
			System.out.println("Name Having more than 6 characters is : "  + name );
			for (int i = 0; i < name.length(); i++) {
				int lengthofName = name.length();
				if (lengthofName % 2 == 0) {
					middleIndex = (lengthofName / 2) - 1;
				}
				if (lengthofName % 2 == 1) {
					middleIndex = lengthofName / 2;
				}
				ch1 = name.charAt(middleIndex);
			}
		}
		return ch1;
	}

	public static void main(String[] args) {
		Assignment38C a38 = new Assignment38C();
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfNames = new ArrayList<String>();
		for (String name : input) {
			listOfNames.add(name);
		}
		System.out.println("Input arraylist : " + listOfNames);
		a38.getName(listOfNames);
	}
}

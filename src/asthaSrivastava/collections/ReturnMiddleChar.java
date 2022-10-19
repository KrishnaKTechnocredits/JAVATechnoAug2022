/*Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']
*/
package asthaSrivastava.collections;

import java.util.*;

public class ReturnMiddleChar {
	
	ArrayList<Character> getmiddleChar(ArrayList<String> listOfName) {
		System.out.println("Input Array is " + listOfName);
		ArrayList<Character> middleCharList = new ArrayList<>();
		for (int index = 0; index < listOfName.size(); index++) {
			if (listOfName.get(index).length() > 6) {
				char ch = listOfName.get(index).charAt(listOfName.get(index).length() / 2);
				middleCharList.add(ch);
			}
		}
		return middleCharList;
	}

	public static void main(String[] args) {
		String[] nameList = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> middleChar = new ArrayList<>(Arrays.asList(nameList));
		System.out.println("\nOutput Array List is " + new ReturnMiddleChar().getmiddleChar(middleChar));
	}
}

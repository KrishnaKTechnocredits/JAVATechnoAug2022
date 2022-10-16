package swapnilMaheshwari.Collection.ArrayList.Assignment38;

import java.util.ArrayList;
import java.util.Arrays;

public class MiddleCharacterForArrayList {

	char getMiddleCharacter(String str) {
		char midChar = ' ';
			int lengthOfName = str.length();
			if (str.length() % 2 == 0) {
				lengthOfName = (str.length() / 2) - 1;
				midChar = str.charAt(lengthOfName);
			}
			else {
				lengthOfName=(str.length()/2);
				midChar=str.charAt(lengthOfName);
			}
		return midChar;
	}

	ArrayList<Character> getProcessedStringArray(String[] strArr) {
		ArrayList<Character> listOfCharacter=new ArrayList<Character>();
		
		for(int index=0; index<strArr.length;index++) {
			if (strArr[index].length() >6 ) {
			char ch=getMiddleCharacter(strArr[index]);
			listOfCharacter.add(ch);
		}
	}
		return listOfCharacter;
	}
	public static void main(String[] args) {
		String[] input= { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		System.out.println("String Array list"+Arrays.toString(input));
		ArrayList<Character> ch=new ArrayList<>();
		MiddleCharacterForArrayList middleCharacterForArrayList = new MiddleCharacterForArrayList();
		for ( int i=0; i<input.length; i++) {
			ch=middleCharacterForArrayList.getProcessedStringArray(input);
		}
		System.out.println("Mid character of the list is"+ch);
	}
}

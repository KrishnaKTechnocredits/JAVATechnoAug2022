/*
Assignment - 38 : 14th Oct'2022

Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains

Program 2: 
Increse student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]

Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']

Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]
*/
package nilamP;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionExample1 {
	void replaceName(ArrayList<String> list, String name, String targetName) {
		while (list.contains(name)) {
			int i = list.indexOf(name);
			list.set(i, targetName);
		}
		System.out.println("output : " + list + "\n");
	}

	void increaseMarks(ArrayList<Integer> markslist) {
		for (int i = 0; i < markslist.size(); i++) {
			if (markslist.get(i) < 35) {
				int replace = markslist.get(i) + 10;
				markslist.set(i, replace);
			}
		}
		System.out.println("Output : " + markslist + "\n");
	}

	void getMiddlechar(ArrayList<Character> list, String[] input) {

		int length;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > 6) {
				length = (input[i].length() - 1) / 2;
				char ch = input[i].charAt(length);
				list.add(ch);
			}
		}
		System.out.println("Output : " + list + "\n");
	}

	void getListOfNames(ArrayList<String> list, String[] input) {
		for (int i = 0; i < input.length; i++) {
			String word = input[i];
			boolean DigitFlag = false;
			boolean UppercaseFlag = false;

			char ch = word.charAt(0);
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
				for (int j = 0; j < word.length(); j++) {
					char ch1 = word.charAt(j);
					if (Character.isDigit(ch1)) {
						DigitFlag = true;
					}
					if (Character.isUpperCase(ch1)) {
						UppercaseFlag = true;
					}
				}
				if (DigitFlag && UppercaseFlag) {
					list.add(word);
				}
			}

		}
		System.out.print("output: " + list);
	}

	public static void main(String[] args) {
		CollectionExample1 ce = new CollectionExample1();
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		System.out.println(" ** program 1 output ** " + "\n");
		System.out.println("Inpuut :" + Arrays.toString(input) + "\n");
		String name = "Deepak";
		String target = "shivani";
		ce.replaceName(list, name, target);
		System.out.println(" ** program 2 output ** " + "\n");
		Integer[] marks = { 23, 55, 34, 88, 58, 81 };
		System.out.println("Input : " + Arrays.toString(marks) + "\n");
		ArrayList<Integer> markslist = new ArrayList<Integer>(Arrays.asList(marks));
		ce.increaseMarks(markslist);
		System.out.println(" ** program 3 output ** " + "\n");
		String[] input1 = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<Character> list1 = new ArrayList<Character>();
		System.out.println("Input : " + Arrays.toString(input1) + "\n");
		ce.getMiddlechar(list1, input1);

		System.out.println(" ** program 4 output ** " + "\n");
		String[] input2 = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		System.out.println("Input : " + Arrays.toString(input2) + "\n");
		ArrayList<String> list2 = new ArrayList<String>();
		ce.getListOfNames(list2, input2);
	}
}

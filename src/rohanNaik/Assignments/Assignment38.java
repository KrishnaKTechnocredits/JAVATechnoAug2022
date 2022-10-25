
package rohanNaik.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assignment38 {

	public static void main(String[] args) {
		/*
		 * Program 1 : Replace all Deepak with Shivani.
		 * 
		 * input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak",
		 * "Deepak"} output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha",
		 * "Amol", "Shivani", "Shivani"}
		 * 
		 * Hint : use set, indexOf, contains
		 */

		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(input));
		System.out.println("Original List: " + list1);

		for (String name : input) {
			if (name == "Deepak") {
				int index = list1.indexOf("Deepak");
				list1.set(index, "Shivani");
			}
		}

		System.out.println("Updated List: " + list1);
		System.out.println("---------------------------------------------------------------------");

		/*
		 * Increase student marks by 10 if marks is less than 35.
		 * 
		 * input : [23,55,34,88,58,81] output : [33,55,44,88,58,81]
		 */
		Integer[] input2 = { 23, 55, 34, 88, 58, 81 };
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(input2));
		System.out.println("Original List: " + list2);

		for (int marks : input2) {
			if (marks < 35) {
				// marks = marks + 10;
				int index = list2.indexOf(marks);
				list2.set(index, marks + 10);
			}
		}

		System.out.println("Updated List: " + list2);
		System.out.println("---------------------------------------------------------------------");

		/*
		 * Program 3 : Return list of Middle character from given name if length of the
		 * name is more than 6 characters. input : {"Manjiri", "Anuja", "Deepak",
		 * "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"} output : ['j','n']
		 */
		String[] input3 = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> list4 = new ArrayList<String>();

		System.out.println("Original List: " + list3);

		for (String name : input3) {
			if (name.length() > 6) {
				String substring = name.substring(3, 4);
				list4.add(substring);
			}
		}

		System.out.println("Updated List: " + list4);
		System.out.println("---------------------------------------------------------------------");

		/*
		 * Program 4 : Return list of name if name starts with Vowel, contains atleast
		 * one digit and having exactly 1 uppercase.
		 * 
		 * input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"} output : ["Aa3shvi",
		 * "i5Sha4n"]
		 */

		String[] input4 = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList(input4));
		ArrayList<String> list6 = new ArrayList<String>();

		for (String name : input4) {
			String str = name;
			boolean flag = false;
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isDigit(ch)) {
					flag = true;
					count = 1;
					break;
				}
			}

			if (count == 1) {
				for (int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					if (Character.isUpperCase(ch)) {
						flag = true;
						count = 2;
						break;
					}
				}
			}

			if (count == 2) {
				for (int i = 0; i < str.length(); i++) {
					str.toLowerCase();
					name.toLowerCase();
					char ch = str.charAt(i);
					if (ch == 'a') {
						flag = true;
						count = 3;
						break;
					} else if (ch == 'A') {
						flag = true;
						count = 3;
						break;
					} 
				}
			}

			if (count == 3) {
				list6.add(name);
			}
		}
		System.out.println("Updated List: " + list6);
		System.out.println("---------------------------------------------------------------------");

	}

}

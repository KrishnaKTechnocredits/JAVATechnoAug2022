/*
 * Assignment - 38 : 14th Oct'2022

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

package akankshaVyas.CollectionWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment38Coll {

	public static void main(String[] args) {
		Assignment38Coll assignment38Coll = new Assignment38Coll();
		String[] arr = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		List<String> list = Arrays.asList(arr);
		List<String> listOfName = new ArrayList<String>(list);
		System.out
				.println("Output List: " + assignment38Coll.printReplaceDupliacteName(listOfName, "Deepak", "Shivani"));
		System.out.println("====================================================================================");

		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		listOfNum.add(23);
		listOfNum.add(55);
		listOfNum.add(34);
		listOfNum.add(88);
		listOfNum.add(58);
		listOfNum.add(81);
		assignment38Coll.printIncrementNum(listOfNum);
		System.out.println("Out list : " + assignment38Coll.getProcessNumber(listOfNum));
		System.out.println(
				"==============================================================================================");
		String[] str = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(str));
		System.out.println("output : " + assignment38Coll.getMiddlechar(stringList));
		System.out
				.println("==========================================================================================");
		String[] arr1= {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"};
		List<String> listOfName1= new ArrayList<String> (Arrays.asList(arr1));
		System.out.println(assignment38Coll.getProcessString(listOfName1));
	}

	ArrayList<String> printReplaceDupliacteName(List<String> listOfName, String name1, String name2) {
		System.out.println("Input list : " + listOfName);
		for (int index = 0; index < listOfName.size(); index++) {
			if (listOfName.contains(name1)) {
				index = listOfName.indexOf(name1);
				listOfName.set(index, name2);
			}
		}
		return (ArrayList<String>) listOfName;
	}

	void printIncrementNum(List<Integer> listOfNum) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int index = 0; index < listOfNum.size(); index++) {
			int value = listOfNum.get(index);
			if (value < 35) {
				numList.add(value + 10);
			} else {
				numList.add(value);
			}
		}
		System.out.println("Input list : " + listOfNum);
		System.out.println("Output list : " + numList);
	}

	ArrayList<Integer> getProcessNumber(ArrayList<Integer> numList) {
		for (int index = 0; index < numList.size(); index++) {
			int value = numList.get(index);
			if (value < 35)
				numList.set(index, value + 10);
		}
		return numList;
	}

	ArrayList<Character> getMiddlechar(ArrayList<String> stringList) {
		ArrayList<Character> midChar = new ArrayList<Character>();
		char ch = ' ';
		for (String name : stringList) {
			if (name.length() > 6) {
				if (name.length() % 2 == 0)
					ch = name.charAt(name.length() / 2 - 1);
				else
					ch = name.charAt(name.length() / 2);
				midChar.add(ch);
			}
		}
		return midChar;
	}
	
	int getCountUpperCase(String name) {
		int upperCount = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCount++;
			}
		}
		return upperCount;
	}
	
	int getCountDigit(String name) {
		int digitCount = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				digitCount++;
			}
		}
		return digitCount;
	}
	
	boolean isVowel(String name) {
		char ch = name.charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
			return true;}
		return false;
	}
	
	List<String> getProcessString(List<String> listOfName1){
	List<String> listOfName = new ArrayList<String> ();
	for(String name : listOfName1)
		if(getCountDigit(name)>0 && getCountUpperCase(name)==1 && isVowel(name)==true){
			listOfName.add(name);
		}return listOfName;
	}
		
	

}

//Assignment - 38 : 14th Oct'2022

package komalShrivastava;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceElementInArrayList {

	// method to replace all occurrence of name with another name
	
	ArrayList<String> replaceNameInArrayList(ArrayList<String> listOfName, String name1, String name2){
		while(listOfName.contains(name1)) {
			int index = listOfName.indexOf(name1);
			listOfName.set(index, name2);
		}
		return listOfName;
	}
	
	//method to increase student marks by 10 if marks is less than 35
	
	ArrayList<Integer> updateStudentMarks(ArrayList<Integer> studentMarks){
		for(int index=0; index < studentMarks.size(); index++) {
			int marks = studentMarks.get(index);
			if(marks < 35)
				studentMarks.set(index, marks+10);
		}
		return studentMarks;
	}
	
	//method to return list of Middle character from given name 
	//if length of the name is more than 6 character
	
	ArrayList<Character> getMiddleChar(ArrayList<String> listOfName){
		ArrayList<Character> middleChar = new ArrayList<Character>();
		for(String name : listOfName) {
			char ch = '0';
			if(name.length() > 6) {
				if(name.length()%2 == 0) 
					ch = name.charAt((name.length()/2)-1);
				else 
					ch = name.charAt(name.length()/2);
				middleChar.add(ch);
			}
		}
		return middleChar;
	}
	
	//Return list of name if name starts with Vowel, contains atleast one digit 
	//and having exactly 1 uppercase
	
	boolean isFirstLetterVowel(String name) {
		switch(name.charAt(0)) {
			case 'a':
			case 'e':	
			case 'i':
			case 'o':
			case 'u':	
			case 'A':
			case 'E':	
			case 'I':
			case 'O':
			case 'U':		
				return true;	
			default :
				return false;
			}	
	}
		
	boolean isDigit(String name) {
		boolean digitFlag = false;
		for(int index=0; index<name.length(); index++) {
			char ch = name.charAt(index);
		    digitFlag = Character.isDigit(ch);
		    if(digitFlag)
		    	return digitFlag;
		}
		return digitFlag;
	}
	
	boolean isUpperCase(String name) {
		boolean upperCaseFlag = false;
		for(int index=0; index<name.length(); index++) {
			char ch = name.charAt(index);
			upperCaseFlag = Character.isUpperCase(ch);
			if(upperCaseFlag)
				return  upperCaseFlag;
		}
		return upperCaseFlag;
	}
	
	ArrayList<String> getName(ArrayList<String> listOfName){
		ArrayList<String> updatedList = new ArrayList<String>();
		for(String name : listOfName) {
			if(isFirstLetterVowel(name) && isDigit(name) && isUpperCase(name) )
			updatedList.add(name);
		}	
		return updatedList;
		}
	
	public static void main(String[] args) {
		ReplaceElementInArrayList al = new ReplaceElementInArrayList();
		
		String[] input = {"Manjiri", "Anuja", "Deepak", "Sagar", "Akanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(input));
		System.out.println("Program 1 : \nReplace all occurance of name with another name");
		System.out.println("Input : " + listOfName);
		ArrayList<String> replacedArrayList = al.replaceNameInArrayList(listOfName, "Deepak", "Komal");
		System.out.println("Output : " + replacedArrayList + "\n");
		
		int[] marks = {23,55,34,88,8,81};
		ArrayList<Integer> studentMarks = new ArrayList<Integer>();
		for(int index=0; index<marks.length; index++) {
			studentMarks.add(marks[index]);
		}
		System.out.println("Program 2 : \nIncrease student marks by 10 if marks is less than 35");
		System.out.println("Input : " + studentMarks);
		ArrayList<Integer> updatedStudentMarks = al.updateStudentMarks(studentMarks);
		System.out.println("Output : " + updatedStudentMarks + "\n");
		
		System.out.println("Program 3 : \nReturn list of Middle character");
		String[] input2 = {"Manjiri", "Anuja", "Deepak", "Sagar", "Akanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> listOfName2 = new ArrayList<String>(Arrays.asList(input2));
		System.out.println("Input : " + listOfName2);
		ArrayList<Character> replacedCharArrayList = al.getMiddleChar(listOfName2);
		System.out.println("Output : " + replacedCharArrayList + "\n");

		System.out.println("Program 4 : \nReturn list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase");
		String[] input3 = {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"};
		ArrayList<String> listOfName3 = new ArrayList<String>(Arrays.asList(input3));
		System.out.println("Input : " + listOfName3);
		ArrayList<String> updatedList = al.getName(listOfName3);
		System.out.println("Output : " + updatedList + "\n");
	}
}
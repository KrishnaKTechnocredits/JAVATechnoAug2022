/*
 * Program 1 : 
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
package harshalRane.Assignments.assignment38.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment38ArrayList {
	//Program 1: Replace all Deepak with Shivani
	void replaceNameInArrayList(ArrayList<String> listOfNames, String oldName, String newName) {
		while(listOfNames.contains(oldName)) {
			int index = listOfNames.indexOf(oldName);
			listOfNames.set(index, newName);
		}	
	}
	
	//Program 2: Increase student marks by 10 if marks is less than 35.
	void increaseMarks(List<Integer> listOfMarks) {
		for(int index=0;index<listOfMarks.size();index++) {
			int marks = listOfMarks.get(index);
			if(marks<35) {
				listOfMarks.set(index,(marks+10));
			}			
		}
	}
	
	//Program 3: Return list of Middle character from given name if length of the name is more than 6 characters
	
	char getMiddleChar(String name) {
		char ch = ' ';
		for(int index=0;index<name.length();index++) {
			int arrIndex = 0;
			int length = name.length();
			if(length % 2 == 0 ) {
				arrIndex = length / 2 - 1;
			}else {
				arrIndex = length / 2;
			}
			ch = name.charAt(arrIndex);
		}
		return ch;
	}
	
	ArrayList<Character> middleCharFromList(String[] input) {
		ArrayList<Character> output = new ArrayList<Character>();
			for(int index=0;index<input.length;index++) {
				if(input[index].length() > 6) {
					char ch = getMiddleChar(input[index]);
					output.add(ch);
				}
			}
		return output;
	}
	
	//Program 4: Return list of name if name starts with Vowel, contains at least one digit and having exactly 1 uppercase
	
	boolean isDigit(String input) {
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				return true;
			}
		}
		return false;
	}
	
	boolean isUpperCase(String input) {
		for(int index=0;index<input.length();index++) {
			if(Character.isUpperCase(input.charAt(index))) {
				return true;
			}
		}
			return false;
	}
	
	boolean isVowel(String input) {
		for(int index=0;index<input.length();index++) {
			if(input.charAt(0)=='a' || input.charAt(0)=='e' || input.charAt(0)=='i' || input.charAt(0)=='o' || input.charAt(0)=='u') {
				return true;
			}else if(input.charAt(0)=='A' || input.charAt(0)=='E' || input.charAt(0)=='I' || input.charAt(0)=='O' || input.charAt(0)=='U') {
				return true;
			}
		}
		return false;
	}
	
	ArrayList<String> getNamesVowelDigitUpperCase(String[] input){
		ArrayList<String> output = new ArrayList<String>();
		for(int index=0;index<input.length;index++) {
			boolean flagIsUpperCase = isUpperCase(input[index]);
			if(flagIsUpperCase) {
				boolean flagIsDigit = isDigit(input[index]);
				if(flagIsDigit) {
					boolean flagIsVowel = isVowel(input[index]);
					if(flagIsVowel) 
						output.add(input[index]);
					}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment38ArrayList assignment38ArrayList = new Assignment38ArrayList();
		
		//Program 1:
		String[] input = {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> name = new ArrayList<String>(Arrays.asList(input));
		System.out.println("Input --> " + name.toString());
		assignment38ArrayList.replaceNameInArrayList(name,"Deepak","Shivani");
		System.out.println("Output -->"+ name.toString());
		
		System.out.println("-----------------------------");
		
		//Program 2:
		Integer[] input1 = {23,55,34,88,58,81};
		List<Integer> marks = Arrays.asList(input1);
		System.out.println("Input --> " + marks.toString());
		assignment38ArrayList.increaseMarks(marks);
		System.out.println("Output --> " + marks);
		
		System.out.println("-----------------------------");
		
		//Program 3:
		String[] input3 = {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		System.out.println("Input --> " + Arrays.toString(input3));
		ArrayList<Character> output = assignment38ArrayList.middleCharFromList(input3);
		System.out.println("Output --> " +output);
		
		System.out.println("-----------------------------");
		
		//Program 4:
		String[] input4 = {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"};
		System.out.println("Input --> " + Arrays.toString(input4));
		ArrayList<String> output1 = assignment38ArrayList.getNamesVowelDigitUpperCase(input4);
		System.out.println("Output --> " +output1);
		
	}
}

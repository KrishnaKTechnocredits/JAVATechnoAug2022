/*Assignment - 38 : 14th Oct'2022
Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.
input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']*/

package swatiM.assignment.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_Program3 {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment38_Program3 assignment38_Program3 = new Assignment38_Program3();
		String[] arr ={"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> inputList = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Program to return list of Middle character from given name if length of the name is more than 6 characters");
		System.out.println("\nInput list: "+inputList);
		System.out.println("\nOutput list: "+assignment38_Program3.getMiddleChar(inputList));
	}

}

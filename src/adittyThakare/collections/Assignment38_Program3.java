/*Assignment - 38 : 14th Oct'2022
Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']*/
package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_Program3 {
	
	ArrayList<Character> returnListMiddleCharacter(ArrayList<String> listOfNames){
		ArrayList<Character> outputList=new ArrayList<>();
		
		for(int index=0;index<listOfNames.size();index++) {
			if(listOfNames.get(index).length()>6) {
				int charNum = listOfNames.get(index).length()/2;
				char ch = listOfNames.get(index).charAt(charNum);
				outputList.add(ch);
			}
		}
		return outputList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment38_Program3 assignment38_Program3 = new Assignment38_Program3();
		String[] arr ={"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> inputList = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Program to return list of Middle character from given name if length of the name is more than 6 characters");
		System.out.println("\nInput list: "+inputList);
		System.out.println("\nOutput list: "+assignment38_Program3.returnListMiddleCharacter(inputList));
	}

}

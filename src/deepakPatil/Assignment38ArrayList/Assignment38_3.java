/*Assignment - 38 : 14th Oct'2022

Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']
*/

package deepakPatil.Assignment38ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_3 {
	
	ArrayList<Character> getMiddleCharacterFromName(ArrayList<String> nameList){
		
		ArrayList <Character> middleCharList = new ArrayList<Character>();
		for(String name : nameList) {
			if(name.length()>6) {
				middleCharList.add(name.charAt((name.length()-1)/2));
			}
		}
		return middleCharList;
	}
	
	public static void main(String[] args) {
		Assignment38_3 assignment38_3 = new Assignment38_3();
		
		String [] names= {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ArrayList <String> nameList=new ArrayList<String>(Arrays.asList(names));
		System.out.println("Given input name list is: "+nameList);
		System.out.println("List of middle character having string length more than 6 is :");
		System.out.println(assignment38_3.getMiddleCharacterFromName(nameList));
	}
}
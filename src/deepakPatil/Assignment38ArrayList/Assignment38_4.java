/*Assignment - 38 : 14th Oct'2022
Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]
 */

package deepakPatil.Assignment38ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_4 {
	
	boolean isStringStartWithVowel(String name) {
		String updateString= name.toLowerCase();
		char ch = updateString.charAt(0);
		switch (ch) {
			case 'a':
				return true;
			case 'e':
				return true;
			case 'i':
				return true;
			case 'o':
				return true;
			case 'u':
				return true;
		}
		
		return false;
	}
	
	boolean isContntainsDigit(String name) {
		for(int index=0;index<name.length();index++) {
			if(Character.isDigit(name.charAt(index))) {
				return true;
			}
		}
		return false;
	}
	
	boolean isContainsOnlyOneUpperChar(String name) {
		int count=0;
		for(int index=0;index<name.length();index++) {
			if(Character.isUpperCase(name.charAt(index))) {
				count++;
			}
		}
		
		if(count==1)
			return true;
		else
			return false;
	}

	ArrayList<String> getListOfNamesFulfillCriteria(ArrayList<String> nameList) {
		ArrayList <String> newNameList = new ArrayList<String>();
		
		for(String name : nameList) {
			if(isStringStartWithVowel(name) && isContntainsDigit(name) && isContainsOnlyOneUpperChar(name))
				newNameList.add(name);
		}
		
		return newNameList;
	}
	
	public static void main(String[] args) {
		Assignment38_4 assignment38_4 = new Assignment38_4();
		
		String [] names= {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"};
		ArrayList <String> nameList=new ArrayList<String>(Arrays.asList(names));
		System.out.println("Given input name list is: "+nameList);
		System.out.println("List of starts with Vowel, contains atleast one digit and having exactly 1 uppercase as below :");
		System.out.println(assignment38_4.getListOfNamesFulfillCriteria(nameList));
	}
}
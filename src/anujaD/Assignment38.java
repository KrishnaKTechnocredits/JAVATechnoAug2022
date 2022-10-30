/*Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains
*/

package anujaD;

import java.util.Arrays;
import java.util.ArrayList;

public class Assignment38 {
	
	public static void main(String[] args) {
		String[] arr = {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(listOfName);
		while(listOfName.contains("Deepak")) {
			
		}
		listOfName.set(2, "Shivani");
		System.out.println(listOfName);
		
		
	}
	
	

}

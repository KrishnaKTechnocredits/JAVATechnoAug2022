/*Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains
*/package asthaSrivastava.collections;

import java.util.*;

public class ReplaceName {
	//method to replace name from given Input Array
		void replaceName(ArrayList<String> listOfName, String name, String inputName){
			System.out.println("Input Array list is \n " +listOfName);
			while(listOfName.contains(name)){
			int tIndex = listOfName.indexOf(name);
			listOfName.set(tIndex,inputName);
			}
			System.out.println("New Array list after replacing "+name+" is \n " +listOfName);
		}
		
		public static void main(String[] args){
			String[] arr =  {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
			ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(arr));
			new ReplaceName().replaceName(listOfName, "Deepak", "Shivani");
		}

}

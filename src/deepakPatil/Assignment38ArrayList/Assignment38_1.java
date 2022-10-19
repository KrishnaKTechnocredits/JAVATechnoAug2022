/*Assignment - 38 : 14th Oct'2022

Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 
*/
package deepakPatil.Assignment38ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_1 {
	
	ArrayList <String> replaceName(ArrayList<String> names,String name, String replaceName) {
		
		while(names.contains(name)) {
			names.set(names.indexOf(name), replaceName);
		}
		
		return names;
	}
	
	public static void main(String[] args) {
		Assignment38_1 assignment38 =new Assignment38_1();
		
		String[] names= {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> nameList= new ArrayList<String>(Arrays.asList(names));
		String name="Deepak";
		String replaceName="Shivani";
		
		System.out.println("Given list is:");
		System.out.println(nameList);
		System.out.println("List after replacing '"+name+"' with '"+replaceName+"':");
		System.out.println(assignment38.replaceName(nameList, name, replaceName));
		
	}

}

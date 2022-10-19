/*Assignment - 37 : 12th Oct'2022

Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

void removeNameFromList(ArrayList<String> listOfName, String name){
	for(String n : listOfName){
		if(n.equals(name))
			count++;
	}
	
	ArrayList<String> temp = new ArrayList<String>(listOfName);
	while(temp.contains(name)){
		temp.remove(name);
		count++;
	}
}	

Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);


Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);
*/


package shivaniLikhia;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment37 {
	
	void removeNameFromArrayList(ArrayList<String> listOfName, String name) {
		System.out.println("The input ArrayList is : "+listOfName);
		for(int index=0;index<listOfName.size();index++ ) {
			if(listOfName.get(index).equals(name)) {
				listOfName.remove(name);
			}
		}
		System.out.println("After removing the given "+name+" ,the Output Array is :" +listOfName);
	}
	
	void removeMultipleOccurenceFromArrayList(ArrayList<String> listOfName, String name) {
		System.out.println("The given Input ArrayList of name is : "+listOfName);
		
		while(listOfName.indexOf(name)!= listOfName.lastIndexOf(name)) {
			listOfName.remove(listOfName.lastIndexOf(name));
		}
		System.out.println("After removing the multiple occurence of name "+name+" , the Output Array is : "+listOfName);	
	}
	
	ArrayList<String> removeMultipleOccurenceOfAllElementsFromArrayList(ArrayList<String> listOfName) {
		System.out.println("The given input ArrayList of name is : "+listOfName);
		ArrayList<String> output = new ArrayList<String>();
		for(String name : listOfName) {
			if(!output.contains(name)) {
				output.add(name);
			}
		}
		return output;
	}
	
	public static void main(String[] name) {
		Assignment37 assignment37 = new Assignment37();
		
		System.out.println("----------------------------------------------Program 1------------------------------------------------");

		ArrayList<String> listOfName = new ArrayList<String>();
		listOfName.add("Sagar");
		listOfName.add("Harshal");
		listOfName.add("Apurva");
		listOfName.add("Gaurav");
		listOfName.add("Sagar");
		listOfName.add("Deepak");
		listOfName.add("Rashmi");
		
		assignment37.removeNameFromArrayList(listOfName,"Sagar");
		
		System.out.println("----------------------------------------------Program 2------------------------------------------------");
		ArrayList<String> listOfName1 = new ArrayList<String>();
		listOfName1.add("Sagar");
		listOfName1.add("Harshal");
		listOfName1.add("Sagar");
		listOfName1.add("Apurva");
		listOfName1.add("Gaurav");
		listOfName1.add("Sagar");
		listOfName1.add("Deepak");
		listOfName1.add("Rashmi");
		assignment37.removeMultipleOccurenceFromArrayList(listOfName1, "Sagar");
		
		System.out.println("----------------------------------------------Program 3------------------------------------------------");
		ArrayList<String> listOfName2 = new ArrayList<String>();
		listOfName2.add("Sagar");
		listOfName2.add("Harshal");
		listOfName2.add("Sagar");
		listOfName2.add("Harshal");
		listOfName2.add("Apurva");
		listOfName2.add("Gaurav");
		listOfName2.add("Sagar");
		listOfName2.add("Gaurav");
		System.out.println(assignment37.removeMultipleOccurenceOfAllElementsFromArrayList(listOfName2));

	}

}

/*
 *  Program 1 : 
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
 

package akankshaVyas.CollectionWork;

import java.util.ArrayList;

public class Assignment37Collection {

	public static void main(String[] args) {
		Assignment37Collection assignment37Collection= new Assignment37Collection();
		ArrayList<String> listOFName = new ArrayList<String>();
		listOFName.add("Sagar");
		listOFName.add("Harshal");
		listOFName.add("Apurva");
		listOFName.add("Gaurav");
		listOFName.add("Sagar");
		listOFName.add("Deepak");
		listOFName.add("Rashmi");
		listOFName.add("Sagar");
		assignment37Collection.removeNameFromList(listOFName, "Sagar");
		System.out.println("================================================================================");
		
		assignment37Collection.removeMultipleOccuranceName(listOFName, "Sagar");
		System.out.println("================================================================================");
		ArrayList<String> listOfName = new ArrayList<String>();
		listOfName.add("Sagar");
		listOfName.add("Harshal");
		listOfName.add("Sagar");
		listOfName.add("Harshal");
		listOfName.add("Apurva");	
		listOfName.add("Gaurav");
		listOfName.add("Sagar");
		listOfName.add("Gaurav");
		
		assignment37Collection.findUniqueList(listOfName);
	}
	
	void removeNameFromList(ArrayList<String> listOfName, String name) {
		System.out.println("Input : "+listOfName);
		ArrayList<String> output = new  ArrayList<String> ( listOfName);
		while(output.contains(name)){
		output.remove(name)	;
				}
		System.out.println("Output: "+output);
		}
	
	void removeMultipleOccuranceName(ArrayList<String>listOFName, String name) {
		ArrayList<String> out = new  ArrayList<String> ( listOFName);
		while(out.indexOf(name) != out.lastIndexOf(name)) {
			out.remove(out.lastIndexOf(name));
			
		}
		System.out.println("Input list : "+ listOFName);
		System.out.println("Output list :" +out);
		
	}
	
	void findUniqueList(ArrayList<String> listOfName) {
		int targetIndex=0;
		ArrayList<String> output = new ArrayList<>(listOfName);
		for(int index=0; index<listOfName.size(); index++) {
			String name=listOfName.get(index);
			if(listOfName.indexOf(name) != listOfName.lastIndexOf(name))
				 targetIndex= listOfName.lastIndexOf(name);
				listOfName.remove(targetIndex);
			}
		System.out.println("input list is :"+output);
		System.out.println("output list is : "+listOfName);
		
	}
	
	
}

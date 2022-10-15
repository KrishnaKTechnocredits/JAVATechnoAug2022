/*
 * Assignment - 37 : 12th Oct'2022

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
package deepakBorse.Assignments;

import java.util.ArrayList;

public class Assignment37 {
	
	// Program 1 : Method to remove given name from ArrayList
	void removeNameFromlist(ArrayList<String> listOfName, String removeName) {
		
		ArrayList<String> processList=new ArrayList<String>(listOfName);
		
		for( String name:listOfName) {
			if(name.equals(removeName)) {
				processList.remove(removeName);
			}
			
		}
		System.out.println("Output After removing '"+removeName+"' string :"+processList);
		
	}
	
	void removemulipleoccur(ArrayList<String> listOfName, String removename) {
		
		ArrayList<String> processList=new ArrayList<String>(listOfName);
		while(processList.indexOf(removename)!=processList.lastIndexOf(removename)) {
			int index=processList.lastIndexOf(removename);
			processList.remove(index);
		}
		System.out.println("Output After removing '"+removename+"' string :"+processList);
	}
	
	//Program 3 : Remove multiple occurance from ArrayList.
	
	void removeduplicatename(ArrayList<String> listofname) {
		
		ArrayList<String> processList= new ArrayList<String>();
		for(String str:listofname) {
			
			if(!processList.contains(str)) {
				processList.add(str);
			}
		}
		System.out.println("Output Arraylist :"+processList);
	}
	
	public static void main(String[] args) {
		Assignment37 arrylist=new Assignment37();
        

	       ArrayList<String> listofName=new ArrayList<String>();

	        listofName.add("Sagar");
	        listofName.add("Harshal");
	        listofName.add("Apurva");
	        listofName.add("Gaurav");
	        listofName.add("Sagar");
	        listofName.add("Deepak");  
	        listofName.add("Rashmi");
	        listofName.add("Sagar");
	        System.out.println("----------------------------------------------------------------------------------");
	        System.out.println("Program 1: Remove given name from ArrayList.");
	        System.out.println("Input ArrayList :"+listofName);
	        arrylist.removeNameFromlist(listofName,"Sagar");
	        

	        
	        ArrayList<String> listOfName2=new ArrayList<String>();
	        listOfName2.add("Sagar");
	        listOfName2.add("Harshal");
	        listOfName2.add("Sagar");
	        listOfName2.add("Apurva");
	        listOfName2.add("Gurav");
	        listOfName2.add("Sagar");  
	        listOfName2.add("Deepak");
	        listOfName2.add("Rashmi");
	        System.out.println("----------------------------------------------------------------------------------");
	        System.out.println("Program 2 : Remove multiple occurance of given name from ArrayList.");
	        System.out.println("Input ArrayList :"+listOfName2);
	        arrylist.removemulipleoccur(listOfName2,"Sagar");
	        
	        ArrayList<String> listOfName3=new ArrayList<String>();
	        listOfName3.add("Sagar");
	        listOfName3.add("Harshal");
	        listOfName3.add("Sagar");
	        listOfName3.add("Harshal");
	        listOfName3.add("Apurva");
	        listOfName3.add("Gaurav");  
	        listOfName3.add("Sagar");
	        listOfName3.add("Gaurav");
	        System.out.println("----------------------------------------------------------------------------------");
	        System.out.println("Program 3 : Remove multiple occurance from ArrayList");
	        System.out.println("Input ArrayList :"+listOfName3);
	        arrylist.removeduplicatename(listOfName3);
	        System.out.println("----------------------------------------------------------------------------------");
	}

}

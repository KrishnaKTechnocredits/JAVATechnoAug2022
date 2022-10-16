/*
Assignment - 37 : 12th Oct'2022

Program 1 : Remove given name from ArrayList.
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

package pranjaliV.assignment37;
import java.util.ArrayList;
public class CollectionAssignment37 {
	
	//program 1
	void removeGivenName(ArrayList<String> listOfNames, String name) {
		while(listOfNames.contains(name)) {
			listOfNames.remove(name);
		}
		System.out.println("Output : " + listOfNames);
	}

	//program 2
	ArrayList<String> removeOccuranceGivenName(ArrayList<String> listOfNames, String name) {
		while(listOfNames.indexOf(name)!=listOfNames.lastIndexOf(name)) {
			int index = listOfNames.lastIndexOf(name);
			listOfNames.remove(index);
		}
		return listOfNames;
	}

	//program 3
	void removeAllOccurance(ArrayList<String> listOfNames) {
		for(int index=0; index<listOfNames.size(); index++) {
			listOfNames = removeOccuranceGivenName(listOfNames,listOfNames.get(index));
		}
		System.out.println("Output : " + listOfNames);
	}
	
	
	public static void main(String[] args) {
		CollectionAssignment37 ex37 = new CollectionAssignment37();
		
		System.out.println("-----------");
		System.out.println("Program 1 : Remove given name from ArrayList.");
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Sagar");
		listOfNames.add("Harshal");
		listOfNames.add("Apurva");
		listOfNames.add("Gaurav");
		listOfNames.add("Sagar");
		listOfNames.add("Deepak");
		listOfNames.add("Rashmi");	
		System.out.println("Input 1 : " + listOfNames);
		ex37.removeGivenName(listOfNames,"Sagar");
		System.out.println("");
		
		System.out.println("-----------");
		System.out.println("Program 2 : Remove multiple occurance of given name from ArrayList.");
		ArrayList<String> listOfNames2 = new ArrayList<String>();
		listOfNames2.add("Sagar");
		listOfNames2.add("Harshal");
		listOfNames2.add("Sagar");
		listOfNames2.add("Apurva");
		listOfNames2.add("Gaurav");
		listOfNames2.add("Sagar");
		listOfNames2.add("Deepak");
		listOfNames2.add("Rashmi");	
		System.out.println("Input 2 : " + listOfNames2);
		System.out.println("Output : " + ex37.removeOccuranceGivenName(listOfNames2,"Sagar"));
		System.out.println("");
		
		
		System.out.println("-----------");
		System.out.println("Program 3 : Remove all occurance from ArrayList.");
		ArrayList<String> listOfNames3 = new ArrayList();
		listOfNames3.add("Sagar");
		listOfNames3.add("Harshal");
		listOfNames3.add("Sagar");
		listOfNames3.add("Harshal");
		listOfNames3.add("Apurva");
		listOfNames3.add("Gaurav");
		listOfNames3.add("Sagar");
		listOfNames3.add("Gaurav");
		System.out.println("Input 3 : " + listOfNames3);
		ex37.removeAllOccurance(listOfNames3);
		System.out.println("");
		
	}

}

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
listOfName.remove(index);*/
package shrutiArora;
import java.util.*;
public class Assignment37 {
	//Program 1: Remove given name from ArrayList
		void removeNameFromArrayList(ArrayList<String> listOfName, String name) {
			while(listOfName.contains(name)) {
				listOfName.remove(name);
				}
		}
		
		//Program 2: Remove multiple occurrences of given name from ArrayList
		void removeAllOccuranceNameFromArrayList(ArrayList<String> listOfName, String name) {
			for(int index=0;index<listOfName.size();index++) {
				int firstIndex = listOfName.indexOf(name);
				int lastIndex = listOfName.lastIndexOf(name);
				
				if(firstIndex!=lastIndex) {
					listOfName.remove(lastIndex);
				}
			}
		}
		
		//Program 3: Remove multiple occurrences from ArrayList
		void removeMultipleOccurancesFromArrayList(ArrayList<String> listOfName) {
			for(int index=0;index<listOfName.size();index++) {
				String name = listOfName.get(index);
				int firstIndex = listOfName.indexOf(name);
				int lastIndex = listOfName.lastIndexOf(name);
				
				if(firstIndex!=lastIndex) {
					listOfName.remove(lastIndex);
					index--; 
				}
			}
		}
		
		public static void main(String[] args) {
			Assignment37 a37 = new Assignment37();
	    	//Program 1
			String[] arr = {"Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
			ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
			System.out.println("Input --> "+list.toString());	
			a37.removeNameFromArrayList(list,"Sagar");
			System.out.println("Output --> " +list.toString());
			System.out.println("--------------------------------------------");
			
			//Program 2
			String[] arr1 = {"Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
			ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
			System.out.println("Input --> "+list1.toString());	
			a37.removeAllOccuranceNameFromArrayList(list1,"Sagar");
			System.out.println("Output --> " +list1.toString());
			
			System.out.println("--------------------------------------------");
			
			//Program 3
			String[] arr2 = {"Sagar","Harshal","Sagar","Harshal","Harshal","Apurva","Gaurav","Sagar","Gaurav"};
			ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
			System.out.println("Input --> "+list2.toString());	
			a37.removeMultipleOccurancesFromArrayList(list2);
			System.out.println("Output --> " +list2.toString());
			
		}
	}
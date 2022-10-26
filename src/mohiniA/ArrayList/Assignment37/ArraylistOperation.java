/*****************
 * Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove
input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

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


 ************/

package mohiniA.ArrayList.Assignment37;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistOperation {

	//Remove given name from ArrayList
		void removeNameFromArrayList(ArrayList<String> listOfName, String name) {
			while(listOfName.contains(name)) {
				listOfName.remove(name);
				}
		}
		
		//Remove multiple occurrences of given name from ArrayList
		void removeAllOccuranceNameFromArrayList(ArrayList<String> listOfName, String name) {
			for(int index=0;index<listOfName.size();index++) {
				int firstIndex = listOfName.indexOf(name);
				int lastIndex = listOfName.lastIndexOf(name);
				
				if(firstIndex!=lastIndex) {
					listOfName.remove(lastIndex);
				}
			}
		}
		
		//Remove multiple occurrences from ArrayList
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
			ArraylistOperation a = new ArraylistOperation();
			
			System.out.println("Remove given name from ArrayList (Sagar)");
			String[] arr = {"Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
			ArrayList<String> input = new ArrayList<String>(Arrays.asList(arr));
			System.out.println("Input --> "+input.toString());	
			a.removeNameFromArrayList(input,"Sagar");
			System.out.println("Output --> " +input.toString());
			System.out.println("--------------------------------------------");
			
			System.out.println("Remove multiple occurrences of given name from ArrayList (Sagar)");
			String[] arr1 = {"Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
			ArrayList<String> input1 = new ArrayList<String>(Arrays.asList(arr1));
			System.out.println("Input --> "+input1.toString());	
			a.removeAllOccuranceNameFromArrayList(input1,"Sagar");
			System.out.println("Output --> " +input1.toString());
			System.out.println("--------------------------------------------");
			
			System.out.println("Remove multiple occurrences from ArrayList ");
			String[] arr2 = {"Sagar","Harshal","Sagar","Harshal","Harshal","Apurva","Gaurav","Sagar","Gaurav"};
			ArrayList<String> input2 = new ArrayList<String>(Arrays.asList(arr2));
			System.out.println("Input --> "+input2.toString());	
			a.removeMultipleOccurancesFromArrayList(input2);
			System.out.println("Output --> " +input2.toString());
			
		}	
	
	
}

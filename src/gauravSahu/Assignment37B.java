/*Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);
*/
package gauravSahu;

import java.util.ArrayList;

public class Assignment37B {
	
	void removeMultipleOccurance(ArrayList<String> array, String name) {
		while(array.lastIndexOf(name)!= array.indexOf(name)) {
			array.remove(array.lastIndexOf(name));
		}
			System.out.println(array);
		}
	
	void removeMultipleOccurance2(ArrayList<String> array) {
		
	}
	
	public static void main(String[] args) {
		String[] input = { "Sagar", "Sagar", "Sagar", "Sagar", "Harshal", "Sagar", "Harshal", "Apurva", "Gaurav",
				"Sagar", "Gaurav", "Apurva", "Apurva", "Apurva" };
		ArrayList<String> array  = new ArrayList<String>();
		for(String name : input) {
			array.add(name);
		}
		Assignment37B a37 = new Assignment37B();
		a37.removeMultipleOccurance(array,"Sagar");
		
	}

}

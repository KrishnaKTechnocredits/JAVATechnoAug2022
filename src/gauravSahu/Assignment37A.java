/*Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 
*//*Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);

*/
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

public class Assignment37A {

	void removeName(ArrayList<String> al, String name) {
		while (al.contains(name)) {
			al.remove(name);
		}
		System.out.println(al);
	}
	
	void removeMultipleName(ArrayList<String> array, String name2 ) {
		for(int i = 0; i<array.size();i++){
			int firstIndex = array.indexOf(name2);
			int lastIndex = array.lastIndexOf(name2);
			if(firstIndex != lastIndex) {
				array.remove(lastIndex);
			}
		}System.out.println(array);
	}
	
	public static void main(String[] args) {
		Assignment37A a37 = new Assignment37A();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sagar");
		al.add("Harshal");
		al.add("Apurva");
		al.add("Gaurav");
		al.add("Sagar");
		al.add("Deepak");
		al.add("Rashmi");
		String name = "Sagar";
		a37.removeName(al, name);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sagar");
		al2.add("Harshal");
		al2.add("Sagar");
		al2.add("Gaurav");
		al2.add("Sagar");
		al2.add("Apurva");
		al2.add("Deepak");
		al2.add("Rashmi");
		String name2 = "Sagar";
		a37.removeMultipleName(al2, name2);
	
	}

}

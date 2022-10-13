/*
 Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

 */

package swapnilMaheshwari.Collection.ArrayList.Assignment37;

import java.util.ArrayList;

public class RemoveNameFromArrList {
	
	void printRemoveNameFromArrList(ArrayList<String> listOfName,String name) {
		while (listOfName.contains(name)){
			listOfName.remove(name);
		}
		System.out.println("Output:"+listOfName);
		
	}
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("Sagar");
		al.add("Harshal");
		al.add("Apurava");
		al.add("Gaurav");
		al.add("Sagar");
		al.add("Deepak");
		al.add("Rashmi");
		System.out.println("Input :"+al);
		RemoveNameFromArrList removeNameFromArrListnew=new RemoveNameFromArrList();
		removeNameFromArrListnew.printRemoveNameFromArrList(al, "Sagar");
	}
}
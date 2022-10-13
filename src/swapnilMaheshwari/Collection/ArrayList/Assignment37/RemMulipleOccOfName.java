/*
 Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);

 */

package swapnilMaheshwari.Collection.ArrayList.Assignment37;

import java.util.ArrayList;

public class RemMulipleOccOfName {
	void printRemMulpleOccOfName(ArrayList<String> listOfName, String name) {
		
			int index=listOfName.indexOf(name);
			int lastIndex=listOfName.lastIndexOf(name);
			while (index!=lastIndex) {
			listOfName.remove(lastIndex);
			lastIndex=listOfName.lastIndexOf(name);
		}
		System.out.println("Output:"+listOfName);
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sagar");
		al.add("Harshal");
		al.add("Sagar");
		al.add("Apurava");
		al.add("Gaurav");
		al.add("Sagar");
		al.add("Deepak");
		al.add("Rashmi");
		System.out.println("Input :" + al);
		RemMulipleOccOfName remMulipleOccOfName = new RemMulipleOccOfName();
		remMulipleOccOfName.printRemMulpleOccOfName(al, "Sagar");
	}
}

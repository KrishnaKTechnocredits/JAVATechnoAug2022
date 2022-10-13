/*
 Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 


 */

package swapnilMaheshwari.Collection.ArrayList.Assignment37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMulOccOfAllName {
	ArrayList getUniqueListOfName(List<String> listOfName) {
		ArrayList <String> output = new ArrayList<String>();
		for(String name:listOfName) {
			if (!output.contains(name))
					output.add(name);
		}
		return output;
	}
	void getUniqueListOfNameUsingMethod(List<String> listOfName) {
		ArrayList <String> temp= new ArrayList<String>(listOfName);
		for (int index=0; index<listOfName.size();index++) {
			String name=listOfName.get(index);
			if(temp.indexOf(name) !=temp.lastIndexOf(name)) {
				int target=temp.lastIndexOf(name);
				temp.remove(target);
			}
		}
		System.out.println(temp);
	}
	void getUniqueListOfNameUsingMethod1(List<String> listOfName) {
		//ArrayList <String> temp= new ArrayList<String>(listOfName);
		for (int index=0; index<listOfName.size();index++) {
			String name=listOfName.get(index);
			if(listOfName.indexOf(name) !=listOfName.lastIndexOf(name)) {
				int targetIndex=listOfName.lastIndexOf(name);
				listOfName.remove(targetIndex);
				index--;
			}
		}
		System.out.println(listOfName);
	}
public static void main(String[] args) {
	//ArrayList<String> al = new ArrayList<String>();
	String[] strArr= {"Sagar","Sagar","Sagar","Harshal","Harshal","Apurava","Gaurav","Gaurav","Apurava","Apurava"};
	List <String> al1 =new ArrayList<String>(Arrays.asList(strArr));
	//List <String> output = new ArrayList<String>(al1);
	System.out.println("Input :" + al1);
	//System.out.println("Output:"+output);
	RemoveMulOccOfAllName removeMulOccOfAllName = new RemoveMulOccOfAllName();
	//output=removeMulOccOfAllName.getUniqueListOfName(al1);
	//removeMulOccOfAllName.getUniqueListOfNameUsingMethod(al1);
	//System.out.println("Output:"+output);
	removeMulOccOfAllName.getUniqueListOfNameUsingMethod1(al1);
	

}
}

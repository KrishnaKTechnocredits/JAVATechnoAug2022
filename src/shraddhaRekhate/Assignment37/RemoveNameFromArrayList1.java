package shraddhaRekhate.Assignment37;
//Remove given name from ArrayList.
//Hint : contains, remove
//
//input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
//output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

import java.util.ArrayList;

public class RemoveNameFromArrayList1 {

	void removeGivenNameFromArrayList(ArrayList<String>listOfName,String name) {
		//int index=0;
		//if(listOfName.get(index).equals("Sagar") ){
		if(listOfName.contains(name)){
				listOfName.remove(name);
				System.out.println("output : "+listOfName);
			}
	}

	public static void main(String[] args) {
		ArrayList<String> listOfName=new ArrayList<String>();
		listOfName.add("Sagar");
		listOfName.add("Harshal");
		listOfName.add("Apurva");
		listOfName.add("Gourav");
		listOfName.add("Sagar");
		listOfName.add("Deepak");
		listOfName.add("Rashmi");
		System.out.println("input : "+listOfName);
		RemoveNameFromArrayList1 rem=new RemoveNameFromArrayList1();
		rem.removeGivenNameFromArrayList(listOfName, "Sagar");
	}

}

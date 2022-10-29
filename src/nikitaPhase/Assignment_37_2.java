package nikitaPhase;
import java.util.ArrayList;


public class Assignment_37_2 {

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
		 Assignment_37_2 rem=new Assignment_37_2();
		rem.removeGivenNameFromArrayList(listOfName, "Sagar");
	}

}

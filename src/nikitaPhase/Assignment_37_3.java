package nikitaPhase;
import java.util.ArrayList;

//Remove multiple occurance from ArrayList.
//input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
//output : ["Sagar","Harshal","Apurva","Gaurav"] 
//hint : indexOf, lastIndexOf, remove(int index)
//int index = listOfName.lastIndexOf("Sagar");
//listOfName.remove(index);

public class Assignment_37_3 {
	 
	 ArrayList<String> getUniQueListOfName(ArrayList<String> listOfName){
		 ArrayList<String> output=new ArrayList<String>();
		 for(String name:listOfName) {
			 if(!output.contains(name)) {
				 output.add(name);
			 }
		 }
		 return output;
	 }
	 public static void main(String[] args) {
		 ArrayList<String> listOfName=new ArrayList<String>();
		    listOfName.add("Sagar");
			listOfName.add("Harshal");
			listOfName.add("Sagar");
			listOfName.add("Harshal");
			listOfName.add("Apurva");
			listOfName.add("Gourav");
			listOfName.add("Sagar");
			listOfName.add("Gourav");
			System.out.println("input : "+listOfName);
			Assignment_37_3 removMulOccFromArraList=new Assignment_37_3();
			System.out.println("output : "+removMulOccFromArraList.getUniQueListOfName(listOfName));
	}
}

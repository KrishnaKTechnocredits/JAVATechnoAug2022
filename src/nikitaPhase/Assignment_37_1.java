package nikitaPhase;

   //Remove multiple occurance of given name from ArrayList.
	//input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
	//output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 
	//hint : indexOf, lastIndexOf, remove(int index)
	//int index = listOfName.lastIndexOf("Sagar");
	//listOfName.remove(index);

	import java.util.ArrayList;

	public class Assignment_37_1 {
		
		void removeMultipleOccurance(ArrayList<String> listOfName,String name) {
			int index=listOfName.lastIndexOf("Sagar");
			if(listOfName.indexOf(name)!=index){
				listOfName.remove(index);
				System.out.println("output : "+listOfName);
			}
		}                    
	    public static void main(String[] args) {
				ArrayList<String> listOfName=new ArrayList<String>();
				listOfName.add("Sagar");
				listOfName.add("Hrashal");
				listOfName.add("Apurva");
				listOfName.add("Gourav");
				listOfName.add("Sagar");
				listOfName.add("Deepak");
				listOfName.add("Rashmi");
				System.out.println("input : "+listOfName);
				Assignment_37_1 remo=new Assignment_37_1();
				remo.removeMultipleOccurance(listOfName, "Sagar");
	    }
	}
package chaitanyaMankar.Assignment37;
import java.util.ArrayList;

/*Assignment - 37 : 12th Oct'2022

Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

void removeNameFromList(ArrayList<String> listOfName, String name){
	for(String n : listOfName){
		if(n.equals(name))
			count++;
	}
	
	ArrayList<String> temp = new ArrayList<String>(listOfName);
	while(temp.contains(name)){
		temp.remove(name);
		count++;
	}
}	

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
listOfName.remove(index); */

public class ArrList
{
	
	void removeNameFromList(ArrayList<String> listOfName, String name)
	{
		System.out.println("Program 1 : \r\n"
				+ "Remove given name from ArrayList.");
		System.out.println("Input: "+listOfName);
		while(listOfName.contains(name))
		{
			listOfName.remove(name);
		}
		System.out.println("Output: "+listOfName);
	}
	//////////////////////////////
	void removeMultipleOcc(ArrayList<String> listOfName, String name)
	{
		System.out.println();
		System.out.println("Program 2 : \r\n"
				+ "Remove multiple occurance of given name from ArrayList.");
		System.out.println("Input: "+listOfName);
		
		while(listOfName.indexOf(name)!=listOfName.lastIndexOf(name))
		{
			int index = listOfName.lastIndexOf(name);
			listOfName.remove(index);
		}
		
		System.out.println("Output: "+listOfName);
	}
	
	void removeMultipleOcc2(ArrayList<String> ListOfName)
	{
		System.out.println();
		System.out.println("Remove multiple occurance from ArrayList.");
		ArrayList<String> output = new ArrayList<String>();
		for(String n : ListOfName)
		{
			if(!output.contains(n))
			{
				output.add(n);
			}
			
		}
		System.out.println(output);
	}
	
 public static void main(String[] args)
 {
	 
	 ArrayList<String> as = new ArrayList<String>();
	 
	 String name = "Sagar";
	 as.add("Sagar");
	 as.add("Harshal");
	 as.add("Apurva");
	 as.add("Gaurav");
	 as.add("Sagar");
	 as.add("Deepak");
	 as.add("Rashmi");
	 
	 ArrList asl = new ArrList();
	 asl.removeNameFromList(as, name);
	 
	 
 ArrayList<String> as1 = new ArrayList<String>();
	 
	 as1.add("Sagar");
	 as1.add("Harshal");
	 as1.add("Apurva");
	 as1.add("Gaurav");
	 as1.add("Sagar");
	 as1.add("Deepak");
	 as1.add("Rashmi");
     asl.removeMultipleOcc(as1, name);
	 
 ArrayList<String> ask = new ArrayList<String>();

 ask.add("Sagar");
 ask.add("Harshal");
 ask.add("Sagar");
 ask.add("Harshal");
 ask.add("Apurva");
 ask.add("Gaurav");
 ask.add("Sagar");
 ask.add("Gaurav");
 
 asl.removeMultipleOcc2(ask);

 }
}

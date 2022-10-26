package priyankaD.assignments_31_40;
import java.util.ArrayList;
public class Assignment_37 {
/*Remove given name from ArrayList.
input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"]*/
		void removeGivenNameFromArrayList(ArrayList<String>listOfName,String name) {
			int count=0;
			while(listOfName.contains(name)) {
		        listOfName.remove(name);
		        count++;
			}System.out.println(listOfName);
			 System.out.println("Sagar->"+count);
		}
/*Program 2 : 
Remove multiple occurance of given name from ArrayList.
input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] */
		void removeLastIndexOfGivenName(ArrayList<String>listOfName1,String name) {
			while(listOfName1.contains(name)) {
				int index=listOfName1.lastIndexOf(name);
				System.out.println("last index of "+name+"-->"+index);
				listOfName1.remove(index);
				break;
			}System.out.println(listOfName1);
		}
/*Program 3 : 
Remove multiple occurance from ArrayList.
input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] */
		ArrayList<String> uniqueOccurence(ArrayList<String>list){
			ArrayList<String>temp=new ArrayList<String>();
			for(String name:list) {
				if(!temp.contains(name)) {
				    temp.add(name);
				    }
			}
			System.out.println(temp);
			return temp;
		}
		public static void main(String[]args) {
	       Assignment_37 assignment=new Assignment_37();
	       System.out.println("Program 1-----------------");
	       ArrayList<String>listOfName=new ArrayList<String>();
	       listOfName.add("Sagar");
			listOfName.add("Harshal");
			listOfName.add("Apurva");
			listOfName.add("Gaurav");
			listOfName.add("Sagar");
			listOfName.add("Deepak");
			listOfName.add("Rashmi");
			System.out.println(listOfName);
	       assignment.removeGivenNameFromArrayList(listOfName,"Sagar");
	       System.out.println("Program 2-----------------");
	       ArrayList<String>listOfName1=new ArrayList<String>();
	       listOfName1.add("Sagar");
			listOfName1.add("Harshal");
			listOfName1.add("Apurva");
			listOfName1.add("Gaurav");
			listOfName1.add("Sagar");
			listOfName1.add("Deepak");
			listOfName1.add("Rashmi");
	       assignment.removeLastIndexOfGivenName(listOfName1, "Sagar");
	       System.out.println("Program 3----------------");	
	       ArrayList<String>list=new ArrayList<String>();
	       list.add("Sagar");
	       list.add("Harshal");
	       list.add("Sagar");
	       list.add("Harshal");
	       list.add("Apurva");
	       list.add("Gaurav");
	       list.add("Sagar");
	       list.add("Harshal");
			System.out.println(list);
			assignment.uniqueOccurence(list);
			}
}

package amolMule;
/*
Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 
*/
import java.util.ArrayList;
public class ArrCollection1 {

	void removeName(ArrayList<String> arrlist, String name) {
		while (arrlist.contains(name)) {
			arrlist.remove(name);
		}
		System.out.println("Given name is: " + name);
		System.out.println("Arrayist after removing given name: " + arrlist);
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ajit");
		al.add("Amit");
		al.add("Amol");
		al.add("Ajay");
		al.add("Amit");
		System.out.println("Original Arrayist: " + al);
		ArrCollection1 ac = new ArrCollection1();
		ac.removeName(al, "Amit");

	}
}

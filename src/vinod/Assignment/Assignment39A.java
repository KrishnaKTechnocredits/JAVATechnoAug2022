package vinod.Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment39A {
	
	void getUniqueNameHS(String[] array) {
		HashSet<String> listOfNames1 = new HashSet<String>();
		for(String name : array) {
			listOfNames1.add(name);
		}System.out.println("In HashSet Insertion order is not maintained : \n" + listOfNames1);
	}
	
	void getUniqueNameUsingLHS(String[] array) {
		LinkedHashSet<String> listOfNames2 = new LinkedHashSet<String>();
		for(String name : array) {
			listOfNames2.add(name);
		}System.out.println("In LinkedHashSet Insertion order is maintained : \n" + listOfNames2 );
	}
	
	public static void main(String[] args) {
		Assignment39A assign39A = new Assignment39A();
		String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		assign39A.getUniqueNameHS(arr);
		assign39A.getUniqueNameUsingLHS(arr);
	}

}

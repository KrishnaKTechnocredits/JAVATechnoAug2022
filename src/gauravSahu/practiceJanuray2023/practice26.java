package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;
import java.util.List;

public class practice26 {
	
	void multipleNames(ArrayList<String> al , String name) {
		while(al.indexOf(name) != al.lastIndexOf(name)) {
			al.remove(al.indexOf(name));
		}
		System.out.println(al);
	}
	
	
	public static void main(String[] args) {
		String[] names = {"Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"};
		
		ArrayList<String> al = new ArrayList<String>();
		
		for(String name : names) {
			al.add(name);
		}
		System.out.println(al);
		
		String str = "Sagar";
		
		new practice26().multipleNames(al , str );

	}
	
	
	
}

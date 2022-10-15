package amolMule;

import java.util.ArrayList;

public class ArrCollection {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Amol");
		al.add("Balasaheb");
		al.add("Mule");

		
		  System.out.println(al);
		  
		  String s1=al.get(0); int n=s1.length(); System.out.println(s1);
		  System.out.println(n);
		

		for (String name : al) {
			System.out.println(name);
		}

	}

}

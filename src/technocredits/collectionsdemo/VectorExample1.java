package technocredits.collectionsdemo;

import java.util.TreeSet;
import java.util.Vector;

public class VectorExample1 {

	// 10
	// 15
	// 22
	// 22 + 22/2 = 33
	// 33 + 16 =
	public static void main(String[] args) {

		/*
		 * String str = null;
		 * 
		 * if(str.equals("Hi")) { System.out.println("Shubham"); }else
		 * System.out.println("Pankaj");
		 */
		
		Vector<String> v1 = new Vector<String>();
		v1.add(null);
		v1.add("Gaurav");
		v1.add("Maulik");

		System.out.println(v1);

		TreeSet<String> nameSet = new TreeSet<String>();
		//nameSet.add(null);
		nameSet.add("Gaurav");
		nameSet.add("Maulik");

		System.out.println(nameSet);
		
		/*
		 * Map<Integer,Boolean> hm = new Hashtable<Integer,Boolean>(); //hm.put(null,
		 * true); hm.put(1, false); hm.put(22, false); hm.put(3, null); //hm.put(null,
		 * false);
		 * 
		 * System.out.println(hm);
		 */
	}
}

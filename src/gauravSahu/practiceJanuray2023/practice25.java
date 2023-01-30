package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;

public class practice25 {
	
	void removeName(ArrayList<String> arraylist , String name) {
		
		while(arraylist.contains(name)) {
			arraylist.remove(name);
		}
		System.out.println(arraylist);
	}
	
	void removeMultiple(ArrayList<String> al , String name) {
		for(int index = 0 ; index<al.size();index++) {
			int a = al.indexOf(name);
			int b = al.lastIndexOf(name);
			if(a!=b) {
				al.remove(b);
			}
			
		}
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		// input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
		
		practice25 p25 = new practice25();
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sagar");
		al.add("Harshal");
		al.add("Sagar");
		al.add("Harshal");
		al.add("Harshal");
		al.add("Apurva");
		String name = "Sagar";
		p25.removeName(al, name);
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Gaurav");
		al2.add("Garvis");
		al2.add("Sahu");
		al2.add("Gaurav");
		String name2 = "Gaurav";
		
		p25.removeMultiple(al2,name2);
		
	}

}

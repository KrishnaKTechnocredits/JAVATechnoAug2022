package vinod.Assignment;

import java.util.ArrayList;

public class Assignment37 {
	void removeName(ArrayList<String> al, String name) {
		while (al.contains(name)) {
			al.remove(name);
		}
		System.out.println("Output  : " + al);
		System.out.println(" ----------------  ");
	}
	
	void removeMultipleName(ArrayList<String> array, String name2 ) {
		for(int i = 0; i<array.size();i++){
			int firstIndex = array.indexOf(name2);
			int lastIndex = array.lastIndexOf(name2);
			if(firstIndex != lastIndex) {
				array.remove(lastIndex);
			}
		}	System.out.println("Output  : " + array);
		
	}
	
	public static void main(String[] args) {
		Assignment37 assign37 = new Assignment37();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sagar");
		al.add("Harshal");
		al.add("Apurva");
		al.add("Gaurav");
		al.add("Sagar");
		al.add("Deepak");
		al.add("Rashmi");
		String name = "Sagar";
		System.out.println("Input  : " + al);
		assign37.removeName(al, name);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sagar");
		al2.add("Harshal");
		al2.add("Sagar");
		al2.add("Gaurav");
		al2.add("Sagar");
		al2.add("Apurva");
		al2.add("Deepak");
		al2.add("Rashmi");
		String name2 = "Sagar";
		System.out.println("Input  : " + al2);
		assign37.removeMultipleName(al2, name2);
	
	}

}

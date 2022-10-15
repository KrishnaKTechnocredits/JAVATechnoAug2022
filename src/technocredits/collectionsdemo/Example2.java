package technocredits.collectionsdemo;

import java.util.ArrayList;

public class Example2 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Manjiri");
		al.add("Sagar");
		al.add("Deepak");
		al.add("Swapnil");
		al.add("Hardik");
		al.add("Sagar");
		
		System.out.println(al.size());
		//System.out.println("4th Element : " + al.get(3));
		System.out.println(al);
		
		for(String name : al) {
			if(name.length() < 6)
				System.out.println(name);
		}
	}
}

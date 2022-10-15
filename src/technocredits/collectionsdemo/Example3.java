package technocredits.collectionsdemo;

import java.util.ArrayList;

public class Example3 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Manjiri");
		al.add("Sagar");
		al.add("Deepak");
		al.add("Swapnil");
		al.add("Hardik");
		al.add("Sagar");
		
		System.out.println(al.contains("deepak"));
		int index = al.lastIndexOf("Sagar");
		System.out.println("Sagar : " + index);
		
		System.out.println(al);
		System.out.println(al.remove("Maulik"));
		al.remove("Sagar");
		System.out.println(al);
	}
}

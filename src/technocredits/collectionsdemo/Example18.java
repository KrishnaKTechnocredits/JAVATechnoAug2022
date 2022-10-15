package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Example18 {
	//Apurva Deepak apurva

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apurva");
		al.add("apurva");
		al.add("Aeepak");
		
		// Maulik
		// Maurvi
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println("------------------");
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}
}

package technocredits.collectionsdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Example15 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Hi");
		lhs.add("Hello");
		lhs.add("Globant");
		System.out.println(lhs);
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Rashmi");
		hs.add("Harshal");
		hs.add("Puja");
		hs.add("Globant");
		
		hs.retainAll(lhs);
		System.out.println(hs);
	}
}

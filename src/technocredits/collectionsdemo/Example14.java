package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Example14 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Hi");
		lhs.add("Hello");
		lhs.add("globant");
		lhs.add("Hi");
		lhs.add("ptc");
		lhs.add("globant");
		lhs.add("Hi");
		
		
		System.out.println(lhs);
		ArrayList<String> al = new ArrayList<String>(lhs);
		System.out.println(al.get(0) + "--" + al.get(al.size()-1));
		System.out.println(al);
	}
}

package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class Example12 {

	void m1() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("Hello");
		al.add("globant");
		al.add("Hi");
		al.add("ptc");
		al.add("globant");
		al.add("Hi");
		
		System.out.println(al.get(0) + "--" + al.get(al.size()-1));
		
		HashSet<String> hs = new HashSet<String>(al);
		System.out.println(hs.size() + "--" + hs);
		
		ArrayList<String> al1 = new ArrayList<String>(hs);
		System.out.println(al1);
	}
	
	public static void main(String[] args) {
		new Example12().m1();
	}
}

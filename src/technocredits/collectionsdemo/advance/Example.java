package technocredits.collectionsdemo.advance;

import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		String str1 = "Hi";
		String str2 = "Hi";
		
		str1.equals(str2);
		
		Builder b1 = new Builder("Manjiri",13,100,"Pune");
		Builder b2 = new Builder("Hardik",13,10,"Ahmd");
		Builder b3 = new Builder("Sagar",12,50,"Delhi");
		Builder b4 = new Builder("Saroj",13,60,"Delhi");
		
		TreeSet<Builder> ts = new TreeSet<Builder>();
		ts.add(b1);
		ts.add(b2); // b2.compareTo(b1);
		ts.add(b3);
		ts.add(b4);
		
		for(Builder b : ts) {
			System.out.println(b.getName() + "-" + b.getExp());
		}
	}
}

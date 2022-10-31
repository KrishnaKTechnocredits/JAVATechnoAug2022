package technocredits.collectionsdemo.advance;

import java.util.ArrayList;
import java.util.Collections;

public class Example4 {

	public static void main(String[] args) {
		
		Builder b1 = new Builder("Manjiri",13,100,"Pune");
		Builder b2 = new Builder("Hardik",13,10,"Ahmd");
		Builder b3 = new Builder("Sagar",12,50,"Delhi");
		Builder b4 = new Builder("Saroj",13,100,"Delhi");
		
		ArrayList<Builder> ts = new ArrayList<Builder>();
		ts.add(b1);
		ts.add(b2); // b2.compareTo(b1);
		ts.add(b3);
		ts.add(b4);
		
		Collections.sort(ts);
		for(Builder b : ts) {
			System.out.println(b.getName() + "-" + b.getExp() + "-" + b.getRevenue());
		}
	}
}

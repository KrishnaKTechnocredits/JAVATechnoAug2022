package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Hindvi -> 6
// Puja -> 4

public class IteratorExample {

	public static void main(String[] args) {
		Set<String> setOfName = 
				new LinkedHashSet<String>(Arrays.asList("Hindvi", "Puja", "Titksha", "Mohini", "Swapnil")); 
		
		ArrayList<String> al = new ArrayList<String>();
		Iterator<String> itr =setOfName.iterator();
		System.out.println(itr);
		while(itr.hasNext()) {
			String name = itr.next();
			if(name.length() > 6)
				itr.remove();
		}
		System.out.println(setOfName);
	}
}

package technocredits.collectionsdemo;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
//[Globant, Hello, Hi]
//[Hi, Hello, Globant]
public class Example19 {

	Employee getEmpDetail() {
		return null;
	}
	
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>(Collections.reverseOrder());
		treeSet.add("Hi"); // sorting // hashcode // 
		treeSet.add("Hello");
		treeSet.add("Globant");
		
		System.out.println(treeSet);
		
		
		
	}
}

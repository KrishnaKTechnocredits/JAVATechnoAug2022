package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
//[Globant, Hello, Hi]
//[Hi, Hello, Globant]
public class Example19 {

	
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>(Collections.reverseOrder());
		treeSet.add("Hi"); // sorting // hashcode // 
		treeSet.add("Hello");
		treeSet.add("Globant");
		
		System.out.println(treeSet);
		 
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(3,5,33,3,55,3,11,11));
		int beforeSize = 0,afterSize=0,num = 0;
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		while(al.size() >0) {
			num = al.get(0);
			beforeSize = al.size();
			removeList.add(num);
			al.removeAll(removeList);
			afterSize = al.size();
			System.out.println(num + "--->" + (beforeSize-afterSize));
			removeList.clear();
		}
	}
}

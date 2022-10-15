package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {
		String[] arr = {"Swapnil","Sagar","Hindvi","Harshada","Sagar","Sagar","Priya"};
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr));
		int index = list1.indexOf("Sagar");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Sagar");
		
		list1.removeAll(list2);
		list1.add(index, "Sagar");
		System.out.println(list1);
	}
}

package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example5 {
	
	
	public static void main(String[] args) {
		String[] arr = {"Harshal","Swati","Vinod"};
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(listOfName);
		listOfName.add(3,"Puja");
		System.out.println(listOfName);
		String oldName = listOfName.set(2, "Apurva");
		System.out.println("------" + oldName);
		System.out.println(listOfName);
		listOfName.clear();
		System.out.println(listOfName);
		System.out.println(listOfName.isEmpty());
	}
	
}

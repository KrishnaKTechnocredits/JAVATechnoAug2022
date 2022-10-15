package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example9 {

	public static void main(String[] args) {
		String[] arr = {"rashmi","rahul","deepak","swapnil","Manjiri"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		
		for(String name : al) {
			if(name.length() > 6) {
				al.remove(name);
				System.out.println(al);
			}
		}
	}
}

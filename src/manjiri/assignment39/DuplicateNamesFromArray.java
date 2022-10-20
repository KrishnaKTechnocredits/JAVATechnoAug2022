/*Program 1: Print all duplicate names from given Array.
input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] */

package manjiri.assignment39;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNamesFromArray {
	
	void getDuplicateNames(String[] input) {
		System.out.println(Arrays.toString(input));
		HashSet<String> setNames = new HashSet<String>();
		boolean flag = true;
		for(String name : input) {
			flag = setNames.add(name);
			if(!flag) {
				System.out.println(name);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh"};
		new DuplicateNamesFromArray().getDuplicateNames(arr);
	}
}

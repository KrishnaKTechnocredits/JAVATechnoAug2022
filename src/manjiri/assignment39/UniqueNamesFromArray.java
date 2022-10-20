/*Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]*/

package manjiri.assignment39;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueNamesFromArray {
	
	HashSet<String> getUniqueNames(String[] input){
		System.out.println(Arrays.toString(input));
		System.out.println("-------------------------------------------");
		HashSet<String> setNames = new HashSet<String>();
		for(String name : input) {
			setNames.add(name);
		}
		return setNames;
	}
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		HashSet<String> newSet = new UniqueNamesFromArray().getUniqueNames(arr);
		System.out.println("Unique Names From Given array are:");
		System.out.println(newSet);
	}
}

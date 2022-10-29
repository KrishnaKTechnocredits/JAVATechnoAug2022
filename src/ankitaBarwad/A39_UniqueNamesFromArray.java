/*Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]*/
package ankitaBarwad;

import java.util.Arrays;
import java.util.HashSet;

public class A39_UniqueNamesFromArray {

	HashSet<String> getUniqueNames(String[] input){
		HashSet<String> setNames = new HashSet<String>();
		System.out.println(Arrays.toString(input));
		for(String name : input) {
			setNames.add(name);
		}
		return setNames;
	}

	public static void main(String[] args) {
		System.out.println("Program 2 : Return unique names from given Array");
		String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		HashSet<String> newSet = new A39_UniqueNamesFromArray().getUniqueNames(arr);
		System.out.println("Unique Names From Given array are:");
		System.out.println(newSet);
	}
}

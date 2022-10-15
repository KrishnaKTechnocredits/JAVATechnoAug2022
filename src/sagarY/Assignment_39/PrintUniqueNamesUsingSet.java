/*Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]
 */

package sagarY.Assignment_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class PrintUniqueNamesUsingSet {

	LinkedHashSet<String> printDuplicateNamesUsingSet(String[] str) {
		List<String> arr = Arrays.asList(str);
		
		LinkedHashSet<String> output = new LinkedHashSet<String>(arr);
				
		System.out.print("Unique element in array: ");
		
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println("Program 2 : Return unique names from given Array using \nSet Collection method");
		System.out.println("========================================================");
		String[] input = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		System.out.println("Input is: "+Arrays.toString(input)+"\n");
		PrintUniqueNamesUsingSet print =  new PrintUniqueNamesUsingSet();
		LinkedHashSet<String> output =print.printDuplicateNamesUsingSet(input);
		System.out.print(output);
	}
	
}
